package crashcourse;

public class Bear {

    String species;
    int age;
    double weight;
    int mana;
    int radioactivity;
    String pronouns;
    boolean isHungry;
    boolean hasFish;

    public Bear(String species, String pronouns, int age){ // i get now that age was probably a bad idea for this

        this.species = species;
        this.pronouns = pronouns;
        this.age = age;

        weight = 50;
        mana = 100;
        radioactivity = 0;
        isHungry = false;
        hasFish = false;


    }

    public void hunt(){

        System.out.println("You hunted in a nearby river, caught a fish while you where at it!")

        hasFish = true;

    }

    public void castSpell(){

        System.out.println("You casted a spell that decreases your mana! you dont know any other spells...")
        mana -= 20;

        if (mana < 0){

            mana = 0;
            System.out.println("shoot all those mana wasting spells left you with no mana.")
        }

    
    }

    public void runAround(){

        System.out.println("You decided to run around for a bit. you feel a bit tired")

        weight -= 20;

        if (weight < 0){
            System.out.println("you completely lost your depth makeing you a 2 dimensonal being");
            weight = 0;
        } 
        
        System.out.println("you lost weight and you got hungry");
        isHungry = true;

    }

    public void roar(){

        System.out.println("you roared your heart out");

    }

    public void rollAround(){


        System.out.println("you rolled around");

    }
    

    
}
