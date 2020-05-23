package com.css.apps;

public class TestRunnable {
    public static void main(String[] args) {
        //开启一个线程任务
        Runnable a=new MyRunnable();
        //new Thread(a).start();
        //new Thread(a).start();
        //匿名内部类的方式设置线程任务
        /*Runnable b=new Runnable() {
            @Override
            public void run() {

                //打印当前线程的名称
                System.out.println(Thread.currentThread().getName());
            }
        };
        new Thread(b).start();*/
        //使用lambda表达式实现多线程
       Runnable c= () -> System.out.println(Thread.currentThread().getName());
        new Thread(c).start();

    }

}
