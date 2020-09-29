import java.util.Scanner;

public class Loader
{
    private static Cat getKitten(){
        return new Cat(1100.);
    }

    public static void main(String[] args)
    {
        // Cats for task 1 & 2;
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();

//...................................Task 1..................................................................................................................

        System.out.println("__________________Task 1__________________");
        System.out.println("We have 5 cats: ");
        System.out.println("Cat1`s Weight is " + cat1.getWeight() + ", Cat2`s Weight is " + cat2.getWeight() +
                ", Cat3`s Weight is " + cat3.getWeight() + ", \nCat4`s Weight is " + cat4.getWeight() + " and Cat5`s Weight is " + cat5.getWeight() + ".");
        System.out.println("\nWould you like to feed Cat1 and Cat2? (Yes/No)");

        Scanner an = new Scanner(System.in);
        String yes = an.next();

        if (yes.contains("Yes")) {
            cat1.feed(10.0);
            cat2.feed(15.0);
            System.out.println("Cats got some food. Their` Weight changed: " + "\nCat1`s Weight is " + cat1.getWeight() + " and Cat2`s Weight is " + cat2.getWeight() + ".");

        }
        else if (yes.contains("No")) {
            System.out.println("What is Wrong With you? Those cats Want some food! Okay, I`ll feed them.");
            cat1.feed(10.0);
            cat2.feed(15.0);
            System.out.println("Cats got some food. Their` Weight changed: " + "\nCat1`s Weight is " + cat1.getWeight() + " and Cat2`s Weight is " + cat2.getWeight() + ".");
        }
        else {
            System.out.println("That Was a simple question: Yes or No. You didn't pass it.");
        }
        System.out.println("\nOkay. Do you Want to feed Cat3? (Yes/No)");
        String yes1 = an.next();

        if (yes1.contains("Yes")) {
            while (cat3.getWeight() <= 9000) {
                cat3.feed(100.0);
            }
            System.out.println("Oh no! You fed it too much! Cat3`s just " + cat3.getStatus() + "!!!");
        }
        else if (yes1.contains("No")){
            System.out.println("Well, at least Cat3 is safe.");
        }
        else {
            System.out.println("It`s yes or no. Not " + yes1 + ". Is that so hard?");
        }

        System.out.println("\nEnough feeding. Let`s see if Cat4 can meow. Ready? (Yes/No)");
        String yes2 = an.next();
        if (yes2.contains("Yes")) {
            while (cat4.getWeight() >= 1000) {
                cat4.meow();
            }
            System.out.println("\nNot again! Cat4 meowed too hard! Now its " + cat4.getStatus() + "!");
        }
        else if (yes2.contains("No")){
            System.out.println("Too bad.");
        }
        else {
            System.out.println("Is that so hard to print Yes or No?");
        }

//...................................Task 2.................................................................................................................

        System.out.println("__________________Task 2__________________");
        System.out.println("\nLet`s feed Cat5 (150 g.)");
        cat5.feed(150.0);
        System.out.println("Cat5 Weight after that is " + cat5.getWeight() + "\nNext, let`s feed Cat5 with 150g. and make her meow.");
        cat5.meow();
        cat5.feed(150.);
        System.out.println("Cat5 Weight after that is " + cat5.getWeight() + ", she ate " + cat5.getFood() + " g.");

//...................................Task 3..................................................................................................................

        System.out.println("\n__________________Task 3__________________");
        System.out.println("Cats status check:");
        System.out.println("Cat1 is " + cat1.getStatus() + ", Cat 2 is " + cat2.getStatus() + ", Cat3 is " + cat3.getStatus() +
                ", Cat4 is " + cat4.getStatus() + ", Cat5 is " + cat5.getStatus());
        System.out.println("So, we only have " + Cat.getCount() + " left. Let`s create another one.");
        Cat cat6 = new Cat();
        System.out.println("Cat 6 is " + cat6.getStatus() + "\nSo we have " + Cat.getCount() + " cats. Let`s overfeed her and check her status after that." );
        cat6.feed(1000000.);
        System.out.println("Now Cat6 is " + cat6.getStatus() + " .But let`s make sure that she is. Let`s see if she can meow and the to feed her.");
        cat6.meow();
        cat6.feed(1.);
        System.out.println("So now we sure that she is dead. Now let`s count our cats again: " + Cat.getCount());

//...................................Task 4..................................................................................................................

        System.out.println("\n__________________Task 4__________________");
        System.out.println("Constants:" + " Minimum weight: " + cat1.MIN_WEIGHT + " ,Minimum weight: " + cat1.MAX_WEIGHT + " ,Eyes count: " + cat1.EYES_COUNT);
        System.out.println("In enum we have colours: "  + HairColour.BLACK + ", " + HairColour.BROWN + ", " + HairColour.GREY +
                ", " + HairColour.RED + " and " + HairColour.WHITE);

//...................................Task 5.....................................................................................................................

        System.out.println("\n__________________Task 5__________________");
        System.out.println("Now we have " + Cat.getCount() + " cats. Let`s make 3 new cats with method getKitten() and see if we succeed.");
        Cat cat13 = getKitten();
        Cat cat14 = getKitten();
        Cat cat15 = getKitten();
        cat13.meow();
        cat14.meow();
        cat15.meow();
        System.out.println(cat13.getOriginWeight());
        System.out.println("Cats count changed to " + Cat.getCount());

//...................................Task 6.....................................................................................................................

        System.out.println("\n__________________Task 6__________________");
        System.out.println("Let`s set Cat1 colour using enum from task 4.");
        cat1.setColour(HairColour.BLACK);
        System.out.println("Cat1 colour is " + cat1.getColour());

//...................................Task 7.....................................................................................................................

        System.out.println("\n__________________Task 7__________________");
        Cat cat8 = new Cat();
        Cat cat9 = new Cat(cat8);

        System.out.println(cat8.getWeight() + ", " + cat8.getOriginWeight() + ", " + cat8.getFood() + ", " + cat8.getAlive() + ", " + cat8.getColour()
                + ", " + cat8.getName());
        System.out.println(cat9.getWeight() + ", " + cat9.getOriginWeight() + ", " + cat9.getFood() + ", " + cat9.getAlive() + ", " + cat9.getColour()
                + ", " + cat9.getName());
        cat8.setWeight(110.);
        cat8.setOriginWeight(100000.);
        cat8.setFood(1.);
        cat8.setAlive(false);
        cat8.setColour(HairColour.BROWN);
        cat8.setName("Хуита");
        cat9.copyCat(cat8);
        System.out.println(cat8.getWeight() + ", " + cat8.getOriginWeight() + ", " + cat8.getFood() + ", " + cat8.getAlive() + ", " + cat8.getColour()
                + ", " + cat8.getName());
        System.out.println(cat9.getWeight() + ", " + cat9.getOriginWeight() + ", " + cat9.getFood() + ", " + cat9.getAlive() + ", " + cat9.getColour()
                + ", " + cat9.getName());
    }
}