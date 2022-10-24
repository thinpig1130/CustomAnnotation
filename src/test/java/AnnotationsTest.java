import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

@DisplayName("애노테이션 정보")
public class AnnotationsTest {

    // @Target 에노테이션 설명
    // 어노테이션 메소드

    @Test
    @DisplayName("RetentionPolicy")
    void getAnnotations(){
        Arrays.stream(Book.class.getAnnotations()).forEach(System.out::println);
    }

    @Test
    @DisplayName("에노테이션 상속 확인")
    void getAnnotationInherited(){
        Arrays.stream(MyBook.class.getAnnotations()).forEach(System.out::println);
    }

}
