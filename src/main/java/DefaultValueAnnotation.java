import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD})
public @interface DefaultValueAnnotation {

    // 어떤 값을 같는 키워드를 value 라고 입력하면 이름을 생략한 후에 값을 입력할 수 있다.
    String value() default "hash_2";

    String name() default "kwondarc";

    int number() default 100;

}