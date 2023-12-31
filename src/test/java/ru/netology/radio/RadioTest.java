package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void testSetCurrentStationRegularFlow() {
        Radio radio = new Radio();

        radio.setStation(5);
        int actual = radio.getStation();
        int expected = 5;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testSetCurrentStationBelowZero() {
        Radio radio = new Radio();

        radio.setStation(5);
        radio.setStation(-5);
        int actual = radio.getStation();
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentStationOverNine() {
        Radio radio = new Radio();

        radio.setStation(5);
        radio.setStation(15);
        int actual = radio.getStation();
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextRadio1() {
        Radio radio = new Radio();

        radio.setStation(2);
        radio.next();
        int actual = radio.getStation();
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testNextRadio2() {
        Radio radio = new Radio();

        radio.setStation(9);
        radio.next();
        int actual = radio.getStation();
        int expected = 0;


        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testNextRadio3() {
        Radio radio = new Radio();

        radio.setStation(10);
        radio.next();
        int actual = radio.getStation();
        int expected = 1;


        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testPrevRegularFlow() {
        Radio radio = new Radio();

        radio.setStation(5);
        radio.prev();
        int actual = radio.getStation();
        int expected = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevResetToNine() {
        Radio radio = new Radio();

        radio.setStation(0);
        radio.prev();
        int actual = radio.getStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeRegularFlow() {
        Radio radio = new Radio();

        radio.setCurrentVolume(67);
        radio.setCurrentVolume(167);
        int actual = radio.getVolume();
        int expected = 67;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeRegularFlow2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(67);
        radio.setCurrentVolume(-67);
        int actual = radio.getVolume();
        int expected = 67;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(67);
        radio.increaseVolume();
        int actual = radio.getVolume();
        int expected = 68;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int actual = radio.getVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testIncreaseVolume3() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);
        radio.increaseVolume();
        int actual = radio.getVolume();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(67);
        radio.decreaseVolume();
        int actual = radio.getVolume();
        int expected = 66;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int actual = radio.getVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testDecreaseVolume3() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);
        radio.decreaseVolume();
        int actual = radio.getVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

}