package Placement.com;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Buffer {
    public static void main(String[] args) {
        try {
            InputStreamReader sc = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(sc);
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            a=a+b;
            b=a-b;
            a=a-b;

            System.out.println("a:"+a);
            System.out.println("a:"+b);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
