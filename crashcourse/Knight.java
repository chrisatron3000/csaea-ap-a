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
