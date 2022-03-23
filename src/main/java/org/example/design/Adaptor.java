package org.example.design;

import java.util.concurrent.Callable;

/**
 * @author game-netease
 * @date 2022/3/21
 * 适配器
 */
//业务类：没办法使用Thred调用callable，添加适配器
class Task implements Callable<Long>{
    private long num;
    public Task(long num){
        this.num=num;
    }
    @Override
    public Long call() throws Exception{
        long r=0;
        for(long n=1;n<=this.num;n++){
            r=r+n;
        }
        System.out.println(r);
        return r;
    }
}
class RunnableAdapter implements Runnable{
    private Callable<?> callable;
    public RunnableAdapter(Callable<?> callable){
        this.callable=callable;
    }
    @Override
    public void run() {
        try {
            callable.call();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class Adaptor {

    public static void main(String[] args) {
        Callable<Long> callable = new Task(123450000L);
        Thread thread = new Thread(new RunnableAdapter(callable)); // compile error!
        thread.start();
    }

}
