
package ru.netology.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RadioServiceTest {
    private RadioService radio;

    @BeforeEach
    public void radioAtributes() {
        this.radio = new RadioService(0,10,0,100);
    }

    @Test
    public  void setCurrentStationValid() {
        radio.setCurrentStation(7);
        assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void setStationOverMax(){
        radio.setCurrentStation(11);
        assertEquals(10, radio.getMaxStation());
    }

    @Test
    public void setStationUnderMin(){
        radio.setCurrentStation(- 9);
        assertEquals(0, radio.getMinStation());
    }

    @Test
    public void setCurrentStationPlus(){
        radio.setCurrentStation(8);
        radio.setCurrentStationPlus();
        assertEquals(9, radio.getCurrentStation());

    }

    @Test
    public  void setCurrentStationOverPlus(){
        radio.setCurrentStation(10);
        radio.setCurrentStationPlus();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void setCurrentStationMinus(){
        radio.setCurrentStation(9);
        radio.setCurrentStationMinus();
        assertEquals(8, radio.getCurrentStation());
    }
    @Test
    public void setCurrentStationUnderMinus(){
        radio.setCurrentStation(0);
        radio.setCurrentStationMinus();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void setCurrentVolumeValid(){
        radio.setCurrentVolume(78);
        assertEquals(78, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeOverMax(){
        radio.setCurrentVolume(101);
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void setCurrentVolumeUnderMin(){
        radio.setCurrentVolume(-14);
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void setUpCurrentVolumeValid(){
        radio.setCurrentVolume(78);
        radio.setCurrentVolumePlus();
        assertEquals(79, radio.getCurrentVolume());
    }


    @Test
    public void setUpCurrentVolumeOverMax(){
        radio.setCurrentVolume(100);
        radio.setCurrentVolumePlus();
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void setDownCurrentVolumeValid(){
        radio.setCurrentVolume(78);
        radio.setCurrentVolumeMinus();
        assertEquals(77, radio.getCurrentVolume());
    }


    @Test
    public void setDowncurrentVolumeUnderMin(){
        radio.setCurrentVolume(0);
        radio.setCurrentVolumeMinus();
        assertEquals(0, radio.getMinVolume());
    }



}


