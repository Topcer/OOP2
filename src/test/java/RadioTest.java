import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.topce.Radio;

public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio rad = new Radio();

        rad.setStation(10);

        int expected = 0;
        int actual = rad.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToSetStation() {
        Radio rad = new Radio();

        rad.setStation(-3);

        int expected = 0;
        int actual = rad.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation() {
        Radio rad = new Radio();

        rad.setStation(9);
        rad.nextStation();

        int expected = 0;
        int actual = rad.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToNextStation() {
        Radio rad = new Radio();

        rad.setStation(10);
        rad.nextStation();

        int expected = 1;
        int actual = rad.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStation() {
        Radio rad = new Radio();

        rad.setStation(9);
        rad.prevStation();

        int expected = 8;
        int actual = rad.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToPrevStation() {
        Radio rad = new Radio();

        rad.setStation(0);
        rad.prevStation();

        int expected = 9;
        int actual = rad.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetVolume() {
        Radio rad = new Radio();

        rad.setVolume(5);

        int expected = 5;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToGetVolume() {
        Radio rad = new Radio();

        rad.setVolume(-2);

        int expected = 0;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio rad = new Radio();

        rad.setVolume(10);

        int expected = 10;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToSetVolume() {
        Radio rad = new Radio();

        rad.setVolume(0);
        rad.increaseVolume();

        int expected = 1;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToVolume() {
        Radio rad = new Radio();

        rad.setVolume(11);

        int expected = 0;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();

        rad.setVolume(10);
        rad.increaseVolume();

        int expected = 10;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio rad = new Radio();

        rad.setVolume(10);
        rad.decreaseVolume();

        int expected = 9;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxVolume() {
        Radio rad = new Radio();

        rad.setVolume(10);
        rad.increaseVolume();

        int expected = 10;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinVolume() {
        Radio rad = new Radio();

        rad.setVolume(-1);
        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }
}
