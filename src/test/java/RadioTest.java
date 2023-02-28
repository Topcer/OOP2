import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldStationCount() {
        Radio rad = new Radio(35);

        rad.setCurrentStation(30);

        int expected = 30;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    Radio rad = new Radio();
    @Test
    public void shouldNextStation() {
        rad.setCurrentStation(3);

        rad.nextStation();

        int expected = 4;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void limitValueCheckNextStationZero() {
        rad.setCurrentStation(0);

        rad.nextStation();

        int expected = 1;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void limitValueCheckNextStationOne() {
        rad.setCurrentStation(1);

        rad.nextStation();

        int expected = 2;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void limitValueCheckNextStationEight() {
        rad.setCurrentStation(8);

        rad.nextStation();

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void limitValueCheckNextStationNine() {
        rad.setCurrentStation(9);

        rad.nextStation();

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPrevStation() {
        rad.setCurrentStation(3);

        rad.prevStation();

        int expected = 2;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void limitValueCheckPrevStationZero() {
        rad.setCurrentStation(0);

        rad.prevStation();

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void limitValueCheckPrevStationOne() {
        rad.setCurrentStation(1);

        rad.prevStation();

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void limitValueCheckPrevStationEight() {
        rad.setCurrentStation(8);

        rad.prevStation();

        int expected = 7;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void limitValueCheckPrevStationNine() {
        rad.setCurrentStation(9);

        rad.prevStation();

        int expected = 8;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentStation () {

        rad.setCurrentStation(3);

        int expected = 3;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldToSetCurrentStation() {
        rad.setCurrentStation(-3);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNextCurrentStation() {

        rad.setCurrentStation(13);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void limitValueCheckSetCurrentStation() {
        rad.setCurrentStation(-1);

        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void limitValueCheckSetCurrentStationZero() {
        rad.setCurrentStation(0);

        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void limitValueCheckSetCurrentStationOne() {
        rad.setCurrentStation(1);

        int expected = 1;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void limitValueCheckSetCurrentStationEight() {
        rad.setCurrentStation(8);

        int expected = 8;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void limitValueCheckSetCurrentStationNine() {
        rad.setCurrentStation(9);

        int expected = 9;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void limitValueCheckSetCurrentStationTen() {
        rad.setCurrentStation(10);

        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentVolume () {

        rad.setCurrentVolume(10);

        int expected = 10;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldToSetCurrentVolume() {
        rad.setCurrentVolume(-3);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNextCurrentVolume() {

        rad.setCurrentVolume(120);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void limitValueCheckSetCurrentVolume() {
        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void minValueSetCurrentVolume() {
        rad.setCurrentVolume(0);

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void limitValueCheckSetCurrentVolumeOne() {
        rad.setCurrentVolume(1);

        int expected = 1;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void limitValueCheckSetCurrentVolumeNinetyNine() {
        rad.setCurrentVolume(99);

        int expected = 99;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void limitValueCheckSetCurrentVolumeOneHundredAndOne() {
        rad.setCurrentVolume(101);

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void maxValueSetCurrentVolume() {
        rad.setCurrentVolume(100);

        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}