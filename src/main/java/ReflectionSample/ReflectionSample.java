package ReflectionSample;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionSample {
    public static void main(String... args){
        reflectionSampleMain();
    }

    public static void reflectionSampleMain(){
        ReflectionSub target = new ReflectionSub();


        try{
            // クラスの宣言
            Class<?> clazz = ReflectionSub.class;
            // メソッドの宣言
            Method method = clazz.getDeclaredMethod("reflectionSub",null);
            // メソッド実行（引数なし）
            method.invoke(target,null);

        } catch (NoSuchMethodException e) {
        // 文字列で指定したメソッド名に一致するメソッドが無いとき
        } catch (InvocationTargetException e) {
        // 呼び出したメソッドの中で例外がおきたとき
        } catch (IllegalAccessException e) {
        // アクセスできないメソッドにアクセスしたとき
        } finally {

        }
    }

}



