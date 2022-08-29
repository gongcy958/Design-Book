package behaviour.observer;

/**
 * @author gongcy
 * @date 2022/8/29 5:33 下午
 * @Description
 */
public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(Message message);
}
