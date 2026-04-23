package ch12.sec05;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String data1 = "홍길동&이수홍,박연수";
        StringTokenizer st = new StringTokenizer(data1, "[& ,]");
        while (st.hasMoreElements()) {
            System.out.println(st.nextToken());
        }

        String data2 = "홍길동/이수홍/박연수";
        st = new StringTokenizer(data2, "[/]");
        while (st.hasMoreElements()) {
            System.out.println(st.nextToken());
        }
    }
}
