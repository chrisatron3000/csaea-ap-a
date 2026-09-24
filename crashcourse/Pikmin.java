public class Pikmin {
    
    String name; //constuctor
    private int leafStage; //priv 1
    private int energy; // priv 2
    private double strength; // priv 3
    boolean isCarrying;
    private int happiness; //priv 4
    String type; // conrtuctor
    private String captinName; // constructor + priv
    boolean isExploring;
    private boolean isHome;


    public Pikmin(String name,String type, String captinName){
        this.name = name;
        this.type = type;
        this.captinName = captinName;

        leafStage = 1;
        energy = 5;
        strength = 1;
        isCarrying = false;
        happiness = 0;
        isExploring = false;
        isHome = true;
    }

    
    // 5 attribute changing methods
    public void relax(){/*pikmin relaxes +energy +happiness -FisCarrying*/
        if (!isCarrying){
            System.out.println(name + " relaxed and restored their energy");
            energy = 5;
            happiness += 1;

            if(happiness > 5){
                happiness = 5; 
            }
        }

    }
    public void drinkNector(){/*Pikmin drinks nector +leafsStage" leaf > bud > flower"-FCarry -FisExploring*/
        if (isCarrying && isExploring){
            if(leafStage == 0){
                System.out.println(name + " drank nector and grew their leaf back!");
                leafStage += 1;
            }else if(leafStage == 1){
                System.out.println(name + " drank necter and their leaf grew into a bud!");
                leafStage += 1;
            }else if(leafStage == 2){
                System.out.println(name + " drank necter and their bud grew into a Flower!");
                leafStage += 1;
            } else if (leafStage > 2){
                System.out.println(name + "found necter but was already full");
            }
        } else {
            System.out.println(name +  " wanted necter but is occupied");
        }
    } 
    public void carryFood(){/*Pikmin carries food +TisCarrying -Texplore -energy*/
        if (isExploring){
            isCarrying = true;
            energy -= 1;
        } else{
            System.out.println(name + "i");
        }

    }
    public void workout(){/*Pikmin works out +strenth -FCarry*/
        strength -= 1;
    }
    public void explore(){/*Pikmin explores +TisExploring*/
        isExploring = true;
    }
    public void goHome(){/*pikmin goes home +happiness +strength -FisExploring*/ 
        happiness += 1;
        strength += 1;

    }

    // 2 parameter methods

    public void JoinGroup(boolean isGroupfull){}
    public void dayEnd(Boolean day){}

    




}
