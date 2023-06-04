package IO.转换流;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReader字节转字符流 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader isr = new InputStreamReader(in);

        BufferedReader br = new BufferedReader(isr);
        String ch = null;
        while ((ch = br.readLine()) != null) {
            System.out.println(ch);
        }

        br.close();
        isr.close();
    }
}
