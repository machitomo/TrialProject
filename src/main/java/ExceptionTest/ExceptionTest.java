package ExceptionTest;

public class ExceptionTest {
    public static void main(String... args){

        sub();
    }

    private static void sub(){
        throw new IllegalArgumentException("引数の値が不正です");
    }
}
