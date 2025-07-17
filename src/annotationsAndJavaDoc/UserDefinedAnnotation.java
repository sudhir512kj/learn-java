package annotationsAndJavaDoc;

import java.lang.annotation.*;

//@Retention(RetentionPolicy.CLASS)

//@Documented
//@Target(value = ElementType.METHOD)
//@Inherited
@interface MyAnno {
    String name();
    String project() default "Bank";
    String date() default "today";
    String version() default "13";
}

@MyAnno(name = "Sudhir")
public class UserDefinedAnnotation {
    @MyAnno(name = "Sudhir")
    int data;

    @MyAnno(name = "Sudhir")
    public static void main(@MyAnno(name = "Sudhir") String[] args) {
        @MyAnno(name = "Sudhir")
        int x;
    }
}
