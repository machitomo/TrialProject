package PrivateConstructorTest;

import org.junit.Test;

import java.lang.reflect.Constructor;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class PrivateConstructorTest {

    /**
     * プライベートコンストラクタのテスト方法
     * 主にカバレッジの網羅でしようする。
     */
    @Test
    public void PrivateConstructor_Test() throws Exception{
        try {
            Class<?> clazz = PrivateConstructor.class;
            Constructor<?>[] constructor = clazz.getDeclaredConstructors();
            constructor[0].setAccessible(true);
            assertThat(constructor[0].newInstance(),instanceOf(PrivateConstructor.class));

        }catch (Exception e){
            fail(e.getMessage());
        }

    }
}