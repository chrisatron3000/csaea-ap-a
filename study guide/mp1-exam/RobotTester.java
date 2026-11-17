// TESTER CLASS: separate class, holds main

public class RobotTester {
    public static void main(String[] args) {

    // OBJECT: specific instance of a class
    // INSTANTIATION: new + constructor call
    // ARGUMENTS: "Rover", "RX-77-B", 8.0
    Robot r1 = new Robot("Rover", "RX-77-B", 8.0);
    Robot r2 = new Robot("Unit", "TK-21", 3.0);

    System.out.println(r1); // returns?    

    Robot r3 = r1;
    System.out.println(r3);

    r3.setName(r1);
    r1.turnOn();
    System.out.println(r1.getName());
    //System.out.println(r1.isOn());
    }
}