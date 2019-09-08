package animals.AnimalTester;

import animals.iface.Jumpable;
import animals.zoo.Animal;
import animals.zoo.Bird;

import java.util.ArrayList;

public class AnimalMain {

    public static void main(String[] args) {

        //Implement the following, TODO 1 has been done for you:

        //TODO 1: An arraylist of animals that can jump
        ArrayList<Jumpable> myJumpingFriends = new ArrayList<>();

        //TODO 2: Add 5 instances of animals that can jump to 
        //the myJumpingFriends List.


        //TODO 3: Run the following for Loop. All the animals 
        //should return a jumping distance.
        for (Jumpable currentAnimal : myJumpingFriends)
        {
            System.out.println("Wow, I jumped " + 
                               currentAnimal.jump() +
                               " meters.");
        }


        //TODO 4: An array of birds.
        ArrayList<Bird> myBirdies = new ArrayList<>();

        //TODO 5: Add five bird instances to myBirdies.



        //TODO 6: Uncomment the following loop and listen to your birdies fly!
//        for (Bird birdie : myBirdies)
//        {
//            System.out.println("Here I go!! " + birdie.fly());
//        }

        //TODO 7: A list of animals.
        ArrayList<Animal> coolZoo = new ArrayList<>();

        //TODO 8: Add 3 birds, 2 GermanShepards, 
        //1 Whale and 2 Fish to the coolZoo list.


        //TODO 9: Run the following loop and put the whole zoo to sleep.

//        for(Animal anml: coolZoo)
//        {
//            System.out.println(anml.getName() + " says " + anml.goToSleep() );
//        }

    }
}
