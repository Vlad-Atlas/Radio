package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestRadio {
    @Test
    public void testCustomConstructor() {
        Radio radio = new Radio(5);
        assertEquals(5, radio.getStationCount());
        assertThrows(IllegalArgumentException.class, () -> new Radio(0));
    }

    @Test
    public void testSetCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(15);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testLombokAnnotations() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        assertEquals(50, radio.getCurrentVolume());
    }
}
