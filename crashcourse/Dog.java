package crashcourse;

public class Dog {

    String name;
    String ownerName;
    String breed;
    int age;
    double weight;
    boolean isHungry;
    boolean isHome;
    int energyLevel;

    public Dog(String name, String ownerName, String breed){

        this.name = name;
        this.ownerName = ownerName;
        this.breed = breed;

        age = 7;
        weight = 42.6;
        isHungry = false;
        isHome = true;
        energyLevel = 100;



    }

    public void bark(){

        System.out.println(this.name + " Barked playfully");
    }

    public void scratch(){

        System.out.println(this.name + " scratched around the room makeing a mess!");
    }

    public void bite(){

        System.out.print(this.name + " started biteing their toys")

    }

    public void eat(){

        isHungry = false;
        weight += 5;

    }

    public void runAway(){

        isHome =false;
        energyLevel -= 15;

        if (energyLevel < 0){

            System.out.println("rip dog");
        }

    }

    public void comeHome(){

        isHome = true;

    }

    public void sleep(){

        energyLevel = 100;
    }

    public void haveBirthday(){

        age += 1;
    }
    
}
