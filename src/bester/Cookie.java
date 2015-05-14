package bester;

public class Cookie implements Bestable<Cookie> {

    private int numberOfChocolateChips;

    public Cookie(int numberOfChocolateChips) {
        this.numberOfChocolateChips = numberOfChocolateChips;
    }



    public Cookie compareTo(Cookie cookie) {
        return numberOfChocolateChips > cookie.numberOfChocolateChips ? this : cookie;
    }

}
