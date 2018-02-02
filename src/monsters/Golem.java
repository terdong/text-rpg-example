package monsters;

import items.Item;
import utility.Dice;

/**
 * Created by DongHee Kim on 2018-02-02 002.
 */
public class Golem extends Monster{
    public Golem() {
        super("골렘", 20, 5, 99, 30, new Dice(4,4));
    }
}
