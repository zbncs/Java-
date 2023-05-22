package Base.数组;

/**
 * 奇数放前面
 */
public class 数组 {
    public static void main(String[] args) {
        int[] a = {8,4,1,6,7,4,9,6,4};
        sort1(a);
    }
    public static int[] sort1(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int item = a[i];
            if (item % 2 == 0) {
                for (int j = i+1; j < a.length; j++) {
                    if (a[j] % 2 != 0) {
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
        }
        return a;
    }
    void sort(int a[], int n) {
        int x;
        int i = 0;
        int j = n-1;
        while(i != j) {
            while( a[i]%2 == 1)
                i++;
            while (a[j]%2 == 0)
                j++;
            if(i < j) {
                x = a[i];
                a[i] = a[j];
                a[j] = x;
            }
        }
    }
}
