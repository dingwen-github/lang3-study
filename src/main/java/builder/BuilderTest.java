package builder;

/**
 * @program:
 * @description: BuilderTest
 * @author: dingwen
 * @create: 2020/12/23 10:20
 **/
public class BuilderTest {
    public static void main(String[] args) {
        System.out.println(Student.builder().id("1605410122").name("dingwen").clazz("物联网工程").subject("Java").score(99.0).build().toString());
    }
}
