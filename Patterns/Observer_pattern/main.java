package Observer_pattern;

import Observer_pattern.Subject.WeatherData;
import Observer_pattern.observer.CurrentConditionDisplay;
import Observer_pattern.observer.CustomObserver;

public class main {
    public static void main(String[] args) {
        
        WeatherData weatherData = new WeatherData(10,20);
       
        CustomObserver customObserver = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(30, 0);
        
    }
}
