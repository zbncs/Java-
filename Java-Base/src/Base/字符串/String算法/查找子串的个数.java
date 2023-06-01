package Base.字符串.String算法;

public class 查找子串的个数 {
    public static void main(String[] args) {
        String str = "nbahsknbajkenbanba";
        System.out.println(findStr(str, "nba"));
        System.out.println(find2(str, "nba"));
    }

    public static int findStr(String str, String target) {
        int count = 0;

        int index = 0;

        while ((index = str.indexOf(target)) != -1) {
            str = str.substring(index+target.length());
            count++;
        }

        return count;
    }

    public static int find2(String str, String target) {
        int count = 0;

        int index = 0;

        while ((index = str.indexOf(target, index)) != -1) {
            index = index + target.length();
            count++;
        }

        return count;
    }
}
