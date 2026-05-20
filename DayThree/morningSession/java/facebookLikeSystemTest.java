import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class faceBookLikeApp {

    
    @Test
    public void testThatNoOneLikesThis() {
        String[] names = { "peter, paul, silas"}
        String expectedResult = "no likes";
        String actualResult = facebookLikeSystem.getFaceBookLikes(names);
        assertEquals = (actualResult, expectedResult);
    }
    
    
    @Test
    public void testThatPeterLikesThis() {
        String[] name = "peter";
        String expectedResult = "likes";
        String actualResult = facebookLikeSystem.getFaceBookLikes(names);
        assertEquals = (actualResult, ExpectedResult);
    }
    
    @Test
    public void testThatJacobAndAlexLikesThis() {
        String[] name = "Jacob , Alex";
        String expectedResult = "likes";
        String actualResult = facebookLikeSystem.getFaceBookLikes(names);
       assertEquals = (actualResult, ExpectedResult);
    }
    
    
    @Test
    public void testThatMax,JohnAndMarkLikesThis() {
        String[] name = "Max , John, Mark";
        String expectedResult = "likes";
        String actualResult = facebookLikeSystem.getFaceBookLikes(names);
       assertEquals = (actualResult, ExpectedResult);
    }
    
    
     @Test
    public void testThatAlex,Jacob,MarkAndMaxLikesThis() {
        String[] name = "Alex,Jacob,Mark,Max";
        String[] expectedResult = "likes";
        String actualResult = facebookLikeSystem.getFaceBookLikes(names);
       assertEquals = (actualResult, ExpectedResult);
    }
