package Observer_pattern.Subject;

import java.util.*;

import Observer_pattern.observer.CustomObserver;

public class WeatherData implements Subject{

    Set<CustomObserver> observerList;
    private float temp;
    private float pressure;

    public WeatherData(float temp, float pressure){
        observerList = new HashSet<>();
        this.temp = temp;
        this.pressure = pressure;
    }

    @Override
    public void registerObserver(CustomObserver o) {

       observerList.add(o);
    }

    @Override
    public void removeObserver(CustomObserver o) {
       
        if(observerList.contains(o)){
            observerList.remove(o);
        }else{
            System.out.println("The Observer is Not Subscribed only");
        }
    }

    @Override
    public void notifyObserver() {
        
        for (CustomObserver customObserver : observerList) {
            customObserver.update(temp, pressure);
        }
    }

    public float getTemp(){
        return temp;
    }

    public float getPressure(){
        return pressure;
    }

    public void measurementsChanged(){
        notifyObserver();
    }

    public void setMeasurements(float temp, float pressure){
        this.temp = temp;
        this.pressure = pressure;
        measurementsChanged();
    }
    
}
