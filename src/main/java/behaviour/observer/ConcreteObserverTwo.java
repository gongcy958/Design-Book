package behaviour.observer;

/**
 * @author gongcy
 * @date 2022/8/29 5:39 下午
 * @Description
 */
public class ConcreteObserverTwo implements Observer{
    @Override
    public void update(Message message) {
        System.out.println("ConcreteObserverTwo is notified.");
    }
}
