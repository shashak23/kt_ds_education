package vacancehomework;

import java.util.ArrayList;
import java.util.List;

public class TemperatureList {
	private List<Temperature> temperatureList;

    public TemperatureList() {
        temperatureList = new ArrayList<>();
    }

    // 등록하기
    public void addTemperature(Temperature temperature) {
        temperatureList.add(temperature);
    }

    // 섭씨 반환
    public double getCelsius(String date) {
        for (Temperature temperature : temperatureList) {
            if (temperature.getDate().equals(date)) {
                return temperature.getCelsius();
            }
        }
        return -1; // 하..이게 맞나...
    }

    // 화씨 반환
    public double getFahrenheit(String date) {
        for (Temperature temperature : temperatureList) {
            if (temperature.getDate().equals(date)) {
                return temperature.getFahrenheit();
            }
        }
        return -1;
    }

    // 모드 반환
    public void printAllTemperatures() {
        System.out.println("온도 목록:");
        for (Temperature temperature : temperatureList) {
            System.out.println("날짜: " + temperature.getDate() + ", 섭씨: " + temperature.getCelsius() + "도, 화씨: " + temperature.getFahrenheit() + "도");
        }
    }
}
