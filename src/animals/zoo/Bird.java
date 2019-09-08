package animals.zoo;

import animals.iface.Flyable;
import animals.iface.Jumpable;

public class Bird extends Animal implements Flyable, Jumpable {

    @Override
    public String fly() {
        return "wheeee";
    }

    @Override
    public int jump() {
        return 1;
    }
}
