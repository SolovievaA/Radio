package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int stationsNumber = 10;

    public Radio(int stationsNumber) {
        this.stationsNumber = stationsNumber;
    }
    public Radio() {
    }

    public int getStation() {
        return currentStation;
    }

    public void setStation(int newstation) {
        if (newstation <= stationsNumber - 1) {
            if (newstation >= 0) {
                currentStation = newstation;
            }
        }
    }

    public void next() {
        if (currentStation == stationsNumber - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = stationsNumber - 1;
        } else {
            currentStation--;
        }
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume >= 0) {
            if (newVolume <= 100) {
                currentVolume = newVolume;
            }
        }
    }

    public int getVolume() {
        return currentVolume;
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
