import java.util.ArrayList;
import java.util.List;
// Concrete subject (MessagingApp)
public class MessagingApp implements MessageSubject {
    private List<MessageObserver> observers = new ArrayList<>();

    public void sendNewMessage(String message) {
        notifyObservers(message);
    }

    @Override
    public void registerObserver(MessageObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(MessageObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (MessageObserver observer : observers) {
            observer.notifyNewMessage(message);
        }
    }
}
