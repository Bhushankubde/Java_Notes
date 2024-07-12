package com.javacore;

import java.io.InterruptedIOException;

public class Threads implements Runnable  {
        @Override
        public void run () {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                }catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        }

    public static void main(String[] args) {
        Threads t1 = new Threads();
        Thread th = new Thread(t1);
        th.start();

        Threads1 t2 = new Threads1();
        t2.start();


    }
}
