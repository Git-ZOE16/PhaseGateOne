import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class miniParkingLot{


@Test
public void testThatParkingLotExist(){
    int[] numbers = {};
    int[] expected = 1;
    int actual = miniParkingLot.parkingLot(number,space)
    assertArrayEquals(expectedResult,actualResult);

}

@Test
public void testThatEmptyParkingLot(){
    int[] numbers = {};
    int[] expected = 0;
    int actual = miniParkingLot.parkingLot(number,space)
    assertArrayEquals(expectedResult,actualResult);

}
@Test
public void testThatCarCanEnterParkingLotIfThereIsFreeSlot(){
    int[] numbers = 1 - 20;
    int[] expected = 1;
    int actual = miniParkingLot.parkingLot(number,space)
    assertArrayEquals(expectedResult,actualResult);

}
@Test
public void testThatCarleavesSlot(){
    int[] numbers = " ";
    int[] expected = 1;
    int actual = miniParkingLot.parkingLot(number,space)
    assertArrayEquals(expectedResult,actualResult);

}

}


}
