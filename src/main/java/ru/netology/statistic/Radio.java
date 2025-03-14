package ru.netology.statistic;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Radio {
    private int currentStation;
    private int currentVolume;
    private int stationCount;

    public Radio(int stationCount) {
        if (stationCount <= 0) {
            throw new IllegalArgumentException("Количество станций должно быть положительным");
        }
        this.stationCount = stationCount;
    }

    public void setCurrentStation(int station) {
        if (station >= 0 && station < stationCount) {
            currentStation = station;
        }
    }

    public void next() {
        currentStation = (currentStation == stationCount - 1) ? 0 : currentStation + 1;
    }

    public void prev() {
        currentStation = (currentStation == 0) ? stationCount - 1 : currentStation - 1;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}