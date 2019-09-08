package animals.zoo;

import animals.iface.Swimmable;

public class Whale extends Mammal implements Swimmable {

    @Override
    public float swim() {
        return 99999;
    }
}
