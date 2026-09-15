package crashcourse;

public class Tree {

    String specificVariety;
    Double height;
    String barkColor;
    Double rootLength;
    int age;
    int glucoseLevel;
    boolean isAlive;
    boolean isDanger;

    public Tree(String specificVariety, String barkColor, Boolean isDanger){

        this.specificVariety = specificVariety;
        this.barkColor = barkColor;
        this.isDanger = isDanger;

        height = 40.5;
        rootLength = 15.5;
        age = 5;
        glucoseLevel = 100;
        isAlive = true;


    }

    public void sway(){

        System.out.println("You sway in the wind")

    }

    public void absorb(){

        System.out.println("You photosynthesised!")
        glucoseLevel += 20;

        if (glucoseLevel > 100){

            glucoseLevel = 100;
        }
    }

    

    
}
