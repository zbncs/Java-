package Base.字符串.String算法;

public class 消除括号 {
    public static void main(String[] args) {
        System.out.println(fliter1("(a,(b,1),(2,(c,a),5))"));
    }
    public static String fliter1(String s) {
        StringBuilder str = new StringBuilder(s);
        for (int i = 1; i < str.length() - 1; i++) {
            int j = str.indexOf("(");
            int k = str.indexOf(")");

            if (j != -1) {
                str.delete(j, j+1);
                i--;
            }

            if (k != -1) {
                str.delete(k, k+1);
                i--;
            }
        }
        return str.toString();
    }
}
