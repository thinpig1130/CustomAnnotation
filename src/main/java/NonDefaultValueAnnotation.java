import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface NonDefaultValueAnnotation {

    // 기본 값을 주지 않은 애노테이션의 경우, 값을 입력하지 않으면 사용 할 수 없다.
   String name();
}