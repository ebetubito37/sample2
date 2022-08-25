
import org.junit.Test;

/**
 * <p>[概 要] src.main.java.Pjxのテストクラス</p>
 * <p>[詳 細] Pjx.javaの異常系テスト用クラス</p>
 * <p>[備 考] </p>
 * <p>[環 境] JRE 7</p>
 * <p>Copyright(c) NTT COMWARE 2015</p>
 *
 * @author NTTコムウェア
 */
public class PjxExceptionTest {

    /**
     * PjxクラスのメソッドをPjxBasicTestでも呼び出せるようにする
     */
    Pjx pjx = new Pjx();

    /**
     * <p>[概 要] Basic arithmeticはゼロ除算で引数不正例外をスロー</p>
     * <p>[詳 細] basicArithmeticの引数val2に0、kigouに除算記号が渡された場合の試験項目</p>
     * <p>[備 考] </p>.
     */
    @Test(expected = IllegalArgumentException.class)
    public void basicArithmeticはゼロ除算で引数不正例外をスロー() {
        pjx.basicArithmetic(6, 0, "/");
    }

    /**
     * <p>[概 要] Basic arithmeticは演算子以外の入力で引数不正例外をスロー</p>
     * <p>[詳 細] basicArithmeticの引数kigouに算術演算子以外の記号が渡された場合の試験項目</p>
     * <p>[備 考] </p>.
     */
    @Test(expected = IllegalArgumentException.class)
    public void basicArithmeticは演算子以外の入力で引数不正例外をスロー() {
        pjx.basicArithmetic(6, 2, "★");
    }
}
