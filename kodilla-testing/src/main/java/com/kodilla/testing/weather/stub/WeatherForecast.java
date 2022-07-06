package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double calculateAvarage() {
        List<Double> avarageList = new ArrayList<>();
        double avarage = 0;
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            avarageList.add(temperature.getValue());
        }
        for (int i = 0; i < avarageList.size(); i++) {
            avarage += avarageList.get(i);
        }
        avarage = avarage / avarageList.size();
        return avarage;
    }

    public double calculateMedian() {
        List<Double> medianList = new ArrayList<>();
        double median = 0;
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            medianList.add(temperature.getValue());
        }
        Collections.sort(medianList);
        if (medianList.size() % 2 == 1)
            return medianList.get((medianList.size() + 1) / 2 - 1);
        else {
            double lower = medianList.get(medianList.size() / 2 - 1);
            double upper = medianList.get(medianList.size() / 2);

            return (lower + upper) / 2.0;
        }
    }
}
