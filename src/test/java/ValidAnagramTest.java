import junit.framework.TestCase;

public class ValidAnagramTest extends TestCase {

    public void testProfit1(){
        String s = "anagram";
        String t = "nagaram";
        boolean actual = Main.Solution.isAnagram(s, t);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    public void testProfit2(){
        String s = "rat";
        String t = "car";
        boolean actual = Main.Solution.isAnagram(s, t);
        boolean expected = false;
        assertEquals(expected, actual);
    }

}
