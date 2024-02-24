package Observer_pattern.Subject;

import Observer_pattern.observer.CustomObserver;

public interface Subject {

    void registerObserver(CustomObserver o);
    void removeObserver(CustomObserver o);
    void notifyObserver();

} 
