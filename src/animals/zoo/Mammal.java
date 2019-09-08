package animals.zoo;

import animals.iface.Domesticatable;

public class Mammal extends Animal implements Domesticatable {

    public Mammal()
    {
        this("bob");
    }

    public Mammal(String name)
    {
        this(name, 15);
    }

    public Mammal(String name, int weight)
    {
        this(name, weight, 10);
    }

    public Mammal(String name, int weight, int height)
    {
        super(name, weight, height);
    }

    @Override
    public Boolean hasBeenDomesticated() {
        return true;
    }

    @Override
    public String goodBoy() {
        return "thanks!";
    }
}
