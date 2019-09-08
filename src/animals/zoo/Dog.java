package animals.zoo;

import animals.iface.Huggable;
import animals.iface.Jumpable;
import animals.iface.Swimmable;

public class Dog extends Mammal implements Huggable, Jumpable, Swimmable{

    @Override
    public float swim()
    {
        return 1;
    }

    @Override
    public int jump()
    {
        return 1;
    }

    @Override
    public String hugged() {
        return "love you";
    }
}
