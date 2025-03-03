package ru.netology.statistic;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public void setCurrentStation(int station) {
        if (station >= 0 && station <= 9) {
            currentStation = station;
        }
    }

    public void next() {
        currentStation = (currentStation == 9) ? 0 : currentStation + 1;
    }

    public void prev() {
        currentStation = (currentStation == 0) ? 9 : currentStation - 1;
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

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}