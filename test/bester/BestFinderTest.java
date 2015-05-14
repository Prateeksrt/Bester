package bester;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by prateeks on 5/14/15.
 */
public class BestFinderTest {
    @Test
    public void testShouldFindTheBestOfTwoRectangles() {
        Rectangle rect1 = new Rectangle(2, 4);
        Rectangle rect2 = new Rectangle(3, 4);

        assertEquals(new BestFinder<Rectangle>().getBest(rect1, rect2), rect2);
    }

    @Test
    public void testShouldFindTheBestRectangleFromMany() throws Exception {
        Rectangle rect1 = new Rectangle(2, 4);
        Rectangle rect2 = new Rectangle(3, 4);
        Rectangle rect3 = new Rectangle(4, 4);

        assertEquals(new BestFinder<Rectangle>().getBest(rect1, rect2, rect3), rect3);

    }

    @Test
    public void testShouldFindTheBestCookieFromMany() throws Exception {
        Cookie c1 = new Cookie(10);
        Cookie c2 = new Cookie(15);
        Cookie c3 = new Cookie(20);


        assertEquals(new BestFinder<Cookie>().getBest(c1, c2, c3), c3);

    }

    @Test
    public void testShouldFindBestOutOfOneRectangle() throws Exception {
        Rectangle rect1 = new Rectangle(2, 4);
        assertEquals(new BestFinder<Rectangle>().getBest(rect1), rect1);

    }
}
