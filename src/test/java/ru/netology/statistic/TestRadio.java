package ru.netology.statistic;

import static org.junit.jupiter.api.Assertions.*;

public class TestRadio {

    @org.junit.jupiter.api.Test
    void testDefaultConstructor() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        assertEquals(0, radio.getCurrentVolume());
        assertEquals(0, radio.getStationCount());
    }

    @org.junit.jupiter.api.Test
    void testAllArgsConstructor() {
        Radio radio = new Radio(5, 30, 10);
        assertEquals(5, radio.getCurrentStation());
        assertEquals(30, radio.getCurrentVolume());
        assertEquals(10, radio.getStationCount());
    }

    @org.junit.jupiter.api.Test
    void testCustomStationCountConstructor() {
        Radio radio = new Radio(20);
        assertEquals(20, radio.getStationCount());
        assertThrows(IllegalArgumentException.class, () -> new Radio(0));
    }

    @org.junit.jupiter.api.Test
    void testSetCurrentStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
        radio.setCurrentStation(15);
        assertEquals(5, radio.getCurrentStation());
    }

    @org.junit.jupiter.api.Test
    void testNextStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(9);
        radio.next();
        assertEquals(0, radio.getCurrentStation());
    }

    @org.junit.jupiter.api.Test
    void testPrevStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(0);
        radio.prev();
        assertEquals(9, radio.getCurrentStation());
    }

    @org.junit.jupiter.api.Test
    void testVolumeControls() {
        Radio radio = new Radio();
        radio.increaseVolume();
        assertEquals(1, radio.getCurrentVolume());
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
        radio.decreaseVolume();
        assertEquals(99, radio.getCurrentVolume());
    }
}