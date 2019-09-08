package animals.zoo;

import animals.iface.Jumpable;
import animals.iface.Swimmable;
import animals.iface.Walkable;

public class Feline extends Animal implements Walkable, Swimmable, Jumpable {

    @Override
    public float swim() {
        return 10;
    }

    @Override
    public String walk() {
        return "thanks";
    }

    @Override
    public int jump() {
        return 11;
    }
}
