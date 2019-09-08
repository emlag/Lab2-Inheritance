package animals.zoo;

import animals.iface.Jumpable;
import animals.iface.Swimmable;

public class Fish extends Animal implements Swimmable, Jumpable {

    @Override
    public float swim() {
        return 45f;
    }

    @Override
    public int jump() {
        return 45;
    }
}
