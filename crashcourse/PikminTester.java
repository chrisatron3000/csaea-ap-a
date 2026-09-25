public class PikminTester {

    public static void main(String[] args){


        Pikmin var1 = new Pikmin("Blue Pikmin", "blue", "Captin Olimar");
        Pikmin var2 = new Pikmin("Rock Pikmin", "Rock", "Captin Louie");

        var1.relax();
        var1.drinkNector();
        var1.carryFood();
        var1.workout();
        var1.explore();
        var1.explore();
        var1.joinGroup(false, false);
        var1.goHome();
        var1.dayEnd(true);

        System.out.println( var2.name + " strength is currently: " + var2.strength);
        var2.workout();
        System.out.println(var2.name + " strength now after working out is currently: " + var2.strength);






    }
    
}
