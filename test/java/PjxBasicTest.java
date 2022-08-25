
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * <p>[概 要] src.main.java.Pjxのテストクラス</p>
 * <p>[詳 細] Pjx.javaの正常系テスト用クラス</p>
 * <p>[備 考] </p>
 * <p>[環 境] JRE 7</p>
 * <p>Copyright(c) NTT COMWARE 2015</p>.
 *
 * @author NTTコムウェア
 */
public class PjxBasicTest {

    /**
     * PjxクラスのメソッドをPjxBasicTestでも呼び出せるようにする
     */
    Pjx pjx = new Pjx();

    /**
     * <p>[概 要] Basic arithmeticは引数の加算で8を返す</p>
     * <p>[詳 細] basicArithmeticの引数kigouに加算記号が渡された場合の試験項目</p>
     * <p>[備 考] </p>.
     */
    @Test
    public void basicArithmeticは引数の加算で8を返す() {
        assertThat(pjx.basicArithmetic(6, 2, "+"), is(8));
    }

    /**
     * <p>[概 要] Basic arithmeticは引数の乗算で12を返す</p>
     * <p>[詳 細] basicArithmeticの引数kigouに乗算記号が渡された場合の試験項目</p>
     * <p>[備 考] </p>.
     */
    @Test
    public void basicArithmeticは引数の乗算で12を返す() {
        assertThat(pjx.basicArithmetic(6, 2, "*"), is(12));
    }

    /*
     * @Test
     * public void basicArithmeticは引数の減算で4を返す() {
     * assertThat(pjx.basicArithmetic(6, 2, "-"),is(4));
     * }
     * 
     * @Test
     * public void basicArithmeticは引数の除算で3を返す() {
     * assertThat(pjx.basicArithmetic(6, 2, "/"),is(3));
     * }
     */
}
