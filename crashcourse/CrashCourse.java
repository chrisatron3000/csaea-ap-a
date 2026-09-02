package crashcourse;

public class CrashCourse {     //Class header

    public static void main(String[] args) {

         // comments are made of 2 forward slashes

        /*This is a multiline commment with a star
        pesists through multiple lines */

        System.out.print("hello");
        System.out.println("world");
        System.out.println("gucci morty here");
        // the better of the prints is println because it prints on its own line
        // the greyed out letters are peramiters for the string argument

        //Variable declarations:
        //there are multiple types

        //PRIMITIVE VARIABLES:

        int a; //initalizes varible
        double b; //varible with decimal, float
        boolean c; //true or false;

        a = 4;
        b = 5.5;
        c = false; //lowercase unlike python

        //Arithmetic operators
        // + - / *
        // += -= /= %=

        int d = 3;
        d += 7; //updates variable with addition

        System.out.println("d = " + d); // example of dynamic print

        // increment and decrement by one:
        // ++ --
        d--;
        d++;
        d++;
        System.out.println("d is NOW " + d);

        //COMPARISONS (always return tru or false)
        // < > <= >= == !=
        System.out.println(4 < 5);
        System.out.println(7 == 4);
        System.out.println(1 != 5);
        System.out.println(4 <= 5);
        //examples of comparison (not all are included)

        //LOGICAL OPERATORS
        // in order of presedance: ! (NOT)  && (AND)  || (OR)
        //presedance meaning wich one is valued first in order of priority

        boolean e = false; boolean f = true;

        // predict output: true or false?
        System.out.println(!e); // predicted true
        System.out.println(e && f); // predicted false,both have to be true for it to be true
        System.out.println(e || f); // True, inversion of && if there is atleast 1 true it is true
        System.out.println(e || f && !e); // true

        System.out.println(e && f); //short curcuts after checking e --- java does not need to check f
        // this is because the nature of AND and e is already false so that is the only answer




     

    }

}
