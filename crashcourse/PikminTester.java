public class PikminTester {

    public static void main(String[] args){


        Pikmin var1 = new Pikmin("Blue Pikmin", "blue", "Captin Olimar");
        Pikmin var2 = new Pikmin("Rock Pikmin", "Rock", "Captin Louie");

        //getter method 0
        var1.getName();
        //setter method 0
        var1.setName("MORE blue pikmin");
        var1.getName();
        //so what can we do with this

        String name = var1.getName();

        System.out.println("from tester class:" + name);

        System.out.println("oh look its a " + var1.getName());


        System.out.println("Uppercase: " + var1.getName().toUpperCase());

        var1.relax();
        var1.drinkNector();
        var1.carryFood();
        var1.workout();
        var1.explore();
        var1.joinGroup(false, false);
        var1.goHome();
        var1.dayEnd(true);

        System.out.println( var2.getName() + " strength is currently: " + var2.strength);
        var2.workout();
        System.out.println(var2.getName() + " strength now after working out is currently: " + var2.strength);






    }
    
}
