package animals.zoo;

import animals.iface.Huggable;

public class Cat extends Feline implements Huggable {

    @Override
    public String hugged() {
        return "thanks";
    }
}
