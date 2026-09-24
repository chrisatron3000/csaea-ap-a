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
        if (isExploring && !isCarrying && strength > 2 && energy > 0){
            isCarrying = true;
            energy -= 1;
            System.out.println(name + "found some food and started carrying it");
        } else{
            System.out.println(name + "wanted to carry food but is unable to");
        }

    }
    public void workout(){/*Pikmin works out +strenth -FCarry*/
        if (!isCarrying && energy > 0){
            strength += 1;
            energy -= 1;
            System.out.println(name + " worked out and gained strength");
        } else {
            System.out.println(name + "wanted to work out but they are occupied");
        }
    }
    public void explore(){/*Pikmin explores +TisExploring*/
        isExploring = true;
    }
    public void goHome(){/*pikmin goes home +happiness +strength -FisExploring*/ 
        isExploring = false;
        happiness += 1;
        strength += 1;
        isCarrying = false;

        System.out.println(name + " went home and dropped off any food they were carrying");

        if(happiness > 5){
                happiness = 5; 
            }
    }

    // 2 parameter methods

    public void JoinGroup(boolean isGroupfull, boolean grouped){
        if(!isGroupfull){
            happiness += 1;
            grouped = true;
            System.out.println(name + " joined a group");
            
            if(happiness > 5){
                happiness = 5; 
            }


        }
    }
    public void dayEnd(Boolean dayOver){

        if(dayOver){

            goHome();
            energy = 0;

        }
    }

    




}
