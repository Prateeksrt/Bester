package bester;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class RectangleTest {
    @Test
    public void areaShouldBeEqualToLengthyMultipliedByBreadth() throws Exception {
        assertEquals(6.0, new Rectangle(2, 3).area());
        assertEquals(0.0, new Rectangle(0, 1).area());
        assertEquals(3.75, new Rectangle(1.5, 2.5).area());
    }

    @Test
    public void whichIsTheBestRectangle(){
        Rectangle rect=new Rectangle(2,3);
        assertTrue(rect.compareTo(rect).equals(rect));
    }
    @Test
    public void whichIsTheBestRectangleOutOfTwo(){
        Rectangle rect1=new Rectangle(2,3);
        Rectangle rect2=new Rectangle(4,3);
        assertTrue(rect1.compareTo(rect2).equals(rect2));
    }
}
