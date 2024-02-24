package Observer_pattern.observer;

import Observer_pattern.Subject.WeatherData;

public class CurrentConditionDisplay implements CustomObserver{

    private float temp;
    private float pressure;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData w){
        weatherData = w;
        weatherData.registerObserver(this);
    }
    @Override
    public void update(float temp, float pressure) {
        
        this.temp= temp;
        this.pressure = pressure;

        updateDisplay();
    }

    public void updateDisplay(){
        System.out.println("The values changed in CurrentCondition to : "+ temp + " " + pressure);
    }
    
}
