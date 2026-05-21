import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayMethodsTest{


     @Test
    public void testThatMethodGetsArrayAndIntegerThenReturnsArrayOne() {
    //Arrange
    int[] array = {8,6,12,4,-2};
    int[] number = 6;
    
    //Act
    int[] expectedResult = {8, -2};
    int[] actualResult = ArrayMethods.getArrayInt(array,number);
    
    //Assert
    assertArrayEquals(expectedResult, actualResult);
 }

 
    @Test
    public void testThatMethodGetsArrayAndIntegerThenReturnsArrayTwo() {
    //Arrange
    int[] array = {1,2,5,7,6,8,9};
    int[] number = 12;
    
    //Act
    int[] expectedResult = {5, 7};
    int[] actualResult = ArrayMethods.getArrayInt(array,number);
    
    //Assert
    assertArrayEquals(expectedResult, actualResult);
 }
 
   
   
}

