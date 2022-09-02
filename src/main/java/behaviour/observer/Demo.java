package behaviour.observer;

import java.util.concurrent.*;

/**
 * @author gongcy
 * @date 2022/8/29 5:47 下午
 * @Description
 */
public class Demo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ConcreteSubject subject = new ConcreteSubject();
//        subject.registerObserver(new ConcreteObserverOne());
//        subject.registerObserver(new ConcreteObserverTwo());
//        subject.notifyObservers(new Message());

        ScheduledExecutorService scheduled = Executors.newScheduledThreadPool(5);
        ScheduledFuture<?> future = scheduled.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("开始执行任务");
                    TimeUnit.SECONDS.sleep(3);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("执行完毕");
            }
        }, 1000L, 1000L, TimeUnit.MILLISECONDS);
        System.out.println("阻塞开始");
        System.out.println(future.get() + "");
        System.out.println("阻塞结束");


    }
}
