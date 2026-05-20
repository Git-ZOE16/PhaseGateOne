import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class faceBookLikeApp {

    
    @Test
    public void testThatNoOneLikesThis() {
        
        String expectedResult = "no likes";
        String actualResult = 0;
        assertEquals = (actualResult, ExpectedResult);
    }
    
    
    @Test
    public void testThatPeterLikesThis() {
        String[] name = "peter";
        String expectedResult = "likes";
        String actualResult = 1;
        assertEquals = (actualResult, ExpectedResult);
    }
    
    @Test
    public void testThatJacobAndAlexLikesThis() {
        String[] name = "Jacob , Alex";
        String expectedResult = "2";
       assertEquals = (actualResult, ExpectedResult);
    }
    
    
    @Test
    public void testThatMax,JohnAndMarkLikesThis() {
        String[] name = "Max , John, Mark";
        String expectedResult = "3";
       assertEquals = (actualResult, ExpectedResult);
    }
    
    
     @Test
    public void testThatAlex,Jacob,MarkAndMaxLikesThis() {
        String[] name = "Alex,Jacob,Mark,Max";
        String expectedResult = "4";
       assertEquals = (actualResult, ExpectedResult);
    }
