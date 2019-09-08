package animals.zoo;

import animals.iface.*;

public class Dolphin extends Mammal implements Jumpable, Huggable, Swimmable {

    @Override
    public int jump() {
        return 15;
    }

    @Override
    public String hugged() {
        return "thanks :)";
    }

    @Override
    public float swim() {
        return 13;
    }
}
