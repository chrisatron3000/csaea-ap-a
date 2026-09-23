import module java.base;
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
Tree.java m1 = Pine("PineTree","Brown",False);
Tree.java m1 = Pine("PineTree","Brown", false);
Tree.java m1 = new Tree("PineTree","Brown",false);
Tree.java m1 = new Pine("PineTree","Brown",false);
Tree.java m1 = new Tree("PineTree","Brown",false);
Tree m1 = new Pine("PineTree","Brown",false);
Tree m1 = new Tree("PineTree","Brown",false);
Tree m2 = new Tree("BirchTree","White", false);
Tree m3 = new Tree("Palm","Beige",false);
Tree m4 = new Tree("RedWoodTree","Red",false);
Tree m5 = new Tree("WeepingWillowTree","GreyishBrown",false);
m1.specificVariety
m1.height
m1.barkColor
m1.RootLength
m1.age
m1.glucoseLevel
m1.isAlive
m1.isDanger
m1.LeafColor
m1.sway()
m1.absorb()
m1.absorb(oxygen = 100)
m1.absorb(int oxygen =100)
m1.absorb(100)
m1.grow()
m1.expand()
m1.selfDestruct
m1.selfDestruct
m1.selfDestruct()