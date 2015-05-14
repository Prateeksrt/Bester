package bester;

/**
 * Created by prateeks on 5/14/15.
 */
public class BestFinder<E extends Bestable> {

    public E getBest(E... t) {
        E best = t[0];
        for(int i=0;i<t.length-1;i++) {
            best = (E)t[i].compareTo(t[i+1]);
        }
        return best;
    }
}
