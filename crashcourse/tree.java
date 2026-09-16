package crashcourse;

public class tree{

    //4 private variables 
    String specificVariety; //const
    private double height;
    private String barkColor; //const
    Double RootLength;
    int age;
    private int glucoseLevel;
    boolean isAlive;
    private boolean isDanger; //const
    String leafColor;

    public tree(String specificVariety, String barkColor, Boolean isDangerous){// 3 paramiters 3 attribus
        // 3 attributes:
        this.specificVariety = specificVariety;
        this.barkColor = barkColor;
        this.isDanger = isDangerous;


        height = 15;
        RootLength = 3.5;
        age = 1;
        glucoseLevel = 100;
        isAlive = true;
        leafColor = "Green";
    }

    public void sway(){

        System.out.println(specificVariety + " swayed in the wind");

    }

    public void absorb(){

    }

    public void grow(){

    }
    public void expand(){

    }
    public void selfDestruct(){
        isAlive = false;

    }



}
