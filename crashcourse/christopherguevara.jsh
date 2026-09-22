import module java.base;
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

        System.out.println(species +" hunted in a nearby river, caught a fish while you where at it!")

        hasFish = true;

    }

    public void castSpell(){

        System.out.println(species + " casted a spell that decreases your mana! you dont know any other spells...")
        mana -= 20;

        if (mana < 0){

            mana = 0;
            System.out.println(species + "shot all those mana wasting spells left you with no mana.")
        }

    
    }

    public void runAround(){

        System.out.println(species + " decided to run around for a bit. you feel a bit tired")

        weight -= 20;

        if (weight < 0){
            System.out.println(species + " completely lost your depth makeing you a 2 dimensonal being");
            weight = 0;
        } 
        
        System.out.println(species + " lost weight and you got hungry");
        isHungry = true;

    }

    public void roar(){

        System.out.println(species +" roared their heart out");

    }

    public void rollAround(){


        System.out.println(species +" rolled around");

    }
    

    
}
public class Knight {

    //1. Data / attributes
    String characterName;
    int health;   // 0 - 100
    int energyLevel;   // 0 - 100
    boolean isHoly;
    int strength;   // at least 1
    boolean hasWeapon;  
    int speed;  // 0 - 100

    // 2. Constructor 
    // special method, only runs when we CREATE an Knight object.
    //names in paranthesis do not have to  be the same as varbs up top but its easier to undersand
    public Knight(String characterName, int health, boolean isHoly) {

        //varibles unique to only this Knight
        this.characterName = characterName;
        this.health = health;
        this.isHoly = isHoly;

        //preset varaibels
        energyLevel = 87;
        strength = 10;
        hasWeapon = true;
        speed = 50; 


    }


    //BEHAVIORS

    public void eat(){

        energyLevel =+ 25;
        if (energyLevel > 100){
            energyLevel = 100;
        }
    }

    public void breakWeapon(){

        hasWeapon = false;
        health /= 2;
    }

    public void workOut(){

        strength += 1;
    }

    public void getDamaged(int amount){

        health -= amount;
        if (health <0){

            System.out.println("you died dud");
        }


    }

}
package crashcourse;
public class Tree{
    //instance variables:
     /*made to be used instantly at the beggining of code */;
    //4 private variables 
    String specificVariety; //const
    private double height; // priv
    private String barkColor; //const & priv
    Double RootLength;
    int age;
    private int glucoseLevel; // priv
    boolean isAlive;
    private boolean isDanger; //const & priv
    String leafColor;

    public Tree(String specificVariety, String barkColor, Boolean isDangerous){// 3 paramiters 3 attribus
        // 3 attributes:
        this.specificVariety = specificVariety;
        this.barkColor = barkColor;
        this.isDanger = isDangerous;


        height = 5;
        RootLength = 3.5;
        age = 1;
        glucoseLevel = 100;
        isAlive = true;
        leafColor = "Green";
    }

    public void sway(){

        System.out.println(specificVariety + " swayed in the wind");

    }

    // 5 behaviors
    public void absorb(int oxygen ){ //parameter
        System.out.println(specificVariety + " absorbed oxegen through their leaves");
        glucoseLevel += 15;
        oxygen --;

        if (glucoseLevel > 100){

            glucoseLevel = 100;
        }

    }

    public void grow(){
        // && is a symbol that makes both the requirments to be true
        // if else 1
        if(0 < glucoseLevel && glucoseLevel< 100){
            height += 1;
            System.out.println(specificVariety + " grew taller to a new height of " + height); //concatination
        
        } else {
            System.out.println(specificVariety + " could not grow");
        }
        

        glucoseLevel -= 10;

        if (glucoseLevel < 0){
            glucoseLevel = 0;
        }

    }


    public void expand(){
        // if else 2
        if(0 < glucoseLevel && glucoseLevel< 100){
            RootLength *= 1.5;
            System.out.println(specificVariety + "expanded their roots to " + RootLength + " inches"); //concatination
        
        } else {
            System.out.println(specificVariety + " could not grow");
        }
        

        glucoseLevel -= 20;
        

        if (glucoseLevel < 0){
            glucoseLevel = 0;
        }
    }
    public void selfDestruct(){
        isAlive = false;
        leafColor = "brown";
        System.out.println(specificVariety + "has self destructed and died ):");

    }



}
public class Tree{
    //instance variables:
     /*made to be used instantly at the beggining of code */;
    //4 private variables 
    String specificVariety; //const
    private double height; // priv
    private String barkColor; //const & priv
    Double RootLength;
    int age;
    private int glucoseLevel; // priv
    boolean isAlive;
    private boolean isDanger; //const & priv
    String leafColor;

    public Tree(String specificVariety, String barkColor, Boolean isDangerous){// 3 paramiters 3 attribus
        // 3 attributes:
        this.specificVariety = specificVariety;
        this.barkColor = barkColor;
        this.isDanger = isDangerous;


        height = 5;
        RootLength = 3.5;
        age = 1;
        glucoseLevel = 100;
        isAlive = true;
        leafColor = "Green";
    }

    public void sway(){

        System.out.println(specificVariety + " swayed in the wind");

    }

    // 5 behaviors
    public void absorb(int oxygen ){ //parameter
        System.out.println(specificVariety + " absorbed oxegen through their leaves");
        glucoseLevel += 15;
        oxygen --;

        if (glucoseLevel > 100){

            glucoseLevel = 100;
        }

    }

    public void grow(){
        // && is a symbol that makes both the requirments to be true
        // if else 1
        if(0 < glucoseLevel && glucoseLevel< 100){
            height += 1;
            System.out.println(specificVariety + " grew taller to a new height of " + height); //concatination
        
        } else {
            System.out.println(specificVariety + " could not grow");
        }
        

        glucoseLevel -= 10;

        if (glucoseLevel < 0){
            glucoseLevel = 0;
        }

    }


    public void expand(){
        // if else 2
        if(0 < glucoseLevel && glucoseLevel< 100){
            RootLength *= 1.5;
            System.out.println(specificVariety + "expanded their roots to " + RootLength + " inches"); //concatination
        
        } else {
            System.out.println(specificVariety + " could not grow");
        }
        

        glucoseLevel -= 20;
        

        if (glucoseLevel < 0){
            glucoseLevel = 0;
        }
    }
    public void selfDestruct(){
        isAlive = false;
        leafColor = "brown";
        System.out.println(specificVariety + "has self destructed and died ):");

    }



}
Tree birchy = new Tree("birch", "birch", false);
Tree pineifer = new Tree("pine","dark brown", false);
Tree mapleity = new Tree("maple","brown", false);
Tree willowTree = new Tree("willow", "light brown", false);
Tree palmTree = new Tree("palm", "orange", false);