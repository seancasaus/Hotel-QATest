package HOTEL_SUITES;
import org.junit.Test;
import static org.junit.Assert.*;

public class hotel_test {
    hotelOccupancy hotel = new hotelOccupancy();

    //Does not enter for loop
    @Test
    public void Test1(){
        double expected = 0;
        double actual = hotel.calcRate(20,2,1,10);
        assertEquals(expected, actual, 0.001);
    }

    //if floor is 13
    @Test
    public void Test2(){
        double expected = 0;
        double actual = hotel.calcRate(20,13,13,10);
        assertEquals(expected, actual, 0.001);
    }

    //occupied is out of bounds of suites per floor and enters while loop
    //also a DU test for more suitesOccupied than available
    @Test
    public void Test3(){
        double expected = 50;
        double actual = hotel.calcRate(20,10,16,25);
        assertEquals(expected, actual, 0.001);
    }

    //runs through everything except while loop
    //also a DU test for an in range value
    @Test
    public void Test4(){
        double expected = 50;
        double actual = hotel.calcRate(20,10,16,10);
        assertEquals(expected, actual, 0.001);
    }

    //du test for negative occupany value
    @Test
    public void Test5(){
        double expected = 50;
        double actual = hotel.calcRate(20,10,16,-1);
        assertEquals(expected, actual, 0.001);
    }
}
