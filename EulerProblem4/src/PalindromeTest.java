import junit.framework.TestCase;
import org.junit.Test;

public class PalindromeTest extends TestCase {

    @Test
    public void testGetLargestPalindrome(){
        assertEquals(906609, new Palindrome(100,999).getLargestPalindrome());
    }

    @Test
    public void testExecutesFast(){
        long startTime = System.currentTimeMillis();
        new Palindrome(100,999).getLargestPalindrome();
        long timeTaken = System.currentTimeMillis() - startTime;

        assertTrue(timeTaken < 700);
    }

    @Test
    public void testIsPalindrome(){
        assertTrue(new Palindrome(10,99).isPalindrome(99099));

    }
}