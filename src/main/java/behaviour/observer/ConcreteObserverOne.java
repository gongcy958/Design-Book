package behaviour.observer;

/**
 * @author gongcy
 * @date 2022/8/29 5:38 下午
 * @Description
 */
public class ConcreteObserverOne implements Observer{
    @Override
    public void update(Message message) {
        System.out.println("ConcreteObserverOne is notified.");
    }
}
