package JmockitSample;

import mockit.Mocked;
import org.junit.Test;
import mockit.Expectations;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class mocClassTest {

    // モックにしたいクラスの宣言(クラス全てに影響)
    //@Mocked
    //private mocClass moc_class;

    @Test
    public void mockKitTrial(@Mocked final mocClass moc_class) {

        // モックの中身の作成
        new Expectations() {
            {
                // メソッドの宣言
                moc_class.getString();
                // 戻り値の宣言
                result = "getMock";
            }
            // 複数のメソッドの定義はこっちの方が好き。（そもそも2つする意味があるかは...）
            {
                moc_class.setString();
                result = "setMock";
            }
            // 引数がある場合
            {
                moc_class.argString("args_test");
                result = "arg_test";
            }
            // 想定外引数の場合
            {
                moc_class.argString(anyString);
                result = "None";
            }
        };

        // getter テスト
        assertThat(moc_class.getString(), is("getMock"));

        // setter テスト
        assertThat(moc_class.setString(),is("setMock"));

        // 引数がある場合
        assertThat(moc_class.argString("args_test"),is("setMock"));

        // 想定外引数の場合
        assertThat(moc_class.argString("aaa"),is("None"));

    }
}