/**
 * <p>[概 要] Pjx Class</p>
 * <p>[詳 細] 四則演算を行うクラス</p>
 * <p>[備 考] </p>
 * <p>[環 境] JRE 7</p>
 * <p>Copyright(c) NTT COMWARE 2015</p>.
 *
 * @author NTTコムウェア
 */
public class Pjx {

    /**
     * <p>[概 要] Basic arithmetic</p>
     * <p>[詳 細] 値1、値2、演算子を引数として受け取り、その計算結果を返す</p>
     * <p>[備 考] </p>.
     *
     * @param val1 計算する値1
     * @param val2 計算する値2
     * @param kigou 演算子
     * @return int 計算結果
     */
    public int basicArithmetic(int val1, int val2, String kigou) {

        // 演算子によって処理を分岐
        if ("+".equals(kigou)) {
            return val1 + val2;
        } else if ("-".equals(kigou)) {
            return val1 - val2;
        } else if ("*".equals(kigou)) {
            return val1 * val2;
        } else if ("/".equals(kigou)) {
            // ゼロ除算時不正引数例外
            if (val2 == 0) {
                throw new IllegalArgumentException();
            }
            return val1 / val2;
        } else {
            // 演算子が+-*/以外のとき引数不正例外
            throw new IllegalArgumentException();
        }
    }
}
