package animals.zoo;

import animals.iface.Sleepable;

public abstract class Animal implements Sleepable{
    private String name;
    private int height;
    private int weight;

    public Animal()
    {
        this.name = "bob";
        this.height = 5;
        this.weight = 10;
    }


    public Animal(String userName, int weight, int height)
    {
        this.name = userName;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String goToSleep() {
        return "zzzzz";
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }
}
