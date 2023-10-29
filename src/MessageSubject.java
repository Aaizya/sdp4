// Subject (Observable) interface
public interface MessageSubject {
    void registerObserver(MessageObserver observer);
    void removeObserver(MessageObserver observer);
    void notifyObservers(String message);
}