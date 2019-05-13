package ExceptionTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class ExceptionTestTest {
    @Rule
    public ExpectedException exception = ExpectedException.none();

    /**
     * 例外が発生した時のテストの仕方
     */
    @Test
    public void main_normalEnd() {
        ExceptionTest exceptionTest = new ExceptionTest();
        // 例外の期待値を設定
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("引数の値が不正です");

        // 実際に例外を発生させる。
        exceptionTest.main();
    }

    /**
     * 期待した例外と異なる挙動をとったときのテスト
     */
    @Test
    public void main_abnormalEnd() {
        ExceptionTest exceptionTest = new ExceptionTest();
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("全然異なるコメント");
        exceptionTest.main();
    }
}