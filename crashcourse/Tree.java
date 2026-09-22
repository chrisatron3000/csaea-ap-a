//package crashcourse;

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
