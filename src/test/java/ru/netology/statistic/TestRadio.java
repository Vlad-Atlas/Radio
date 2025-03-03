package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestRadio {

    @Test
    public void defaultConstructorShouldSet10Stations() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldCreateRadioWithCustomStationCount() {
        Radio radio = new Radio(5);
        radio.setCurrentStation(4);
        radio.next();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationBeyondCustomCount() {
        Radio radio = new Radio(5);
        radio.setCurrentStation(5);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSwitchFromMaxTo0OnNext() {
        Radio radio = new Radio(5);
        radio.setCurrentStation(4);
        radio.next();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSwitchFrom0ToMaxOnPrev() {
        Radio radio = new Radio(5);
        radio.setCurrentStation(0);
        radio.prev();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void invalidStationCountShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Radio(0));
        assertThrows(IllegalArgumentException.class, () -> new Radio(-5));
    }


    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationBelowZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

}
