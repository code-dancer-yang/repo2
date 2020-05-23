package com.css.apps;

/**
 * @author yang
 */
public class MyRunnable implements Runnable{
    /**
     *
     *线程任务
     */
    @Override
    public void run() {
        //让当前线程休眠3秒钟
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //打印当前线程的名称
        while (true){

            System.out.println(Thread.currentThread().getName());
        }

    }
}
