import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class arrayMethodTest{


 @Test
    public void testThatMethodGetsTheSmallestNumberInArray() {
    //Arrange
    int[] array = {14,9,6,5,8,10};
    //Act
    int[] expectedResult = 5;
    int[] actualResult = arrayMethod.getSmallest(number);
  
    //Assert
    assertArrayEquals(expectedResult, actualResult);
 }
 
   @Test
    public void testThatMethodGetsTheLargestNumberInArray() {
    //Arrange
    int[] array = {14,9,6,5,8,10};
    
    //Act
    int[] expectedResult = 15;
    int[] actualResult = arrayMethod.getLargest(number);
  
    //Assert
    assertArrayEquals(expectedResult, actualResult);
 }
 }
