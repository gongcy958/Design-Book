package behaviour.observer;

/**
 * @author gongcy
 * @date 2022/8/29 5:47 下午
 * @Description
 */
public class Demo {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.registerObserver(new ConcreteObserverOne());
        subject.registerObserver(new ConcreteObserverTwo());
        subject.notifyObservers(new Message());
    }
}
