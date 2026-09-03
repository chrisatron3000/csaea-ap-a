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

        boolean f = false; boolean t = true;

        // predict output: true or false?
        System.out.println(!f); // predicted true
        System.out.println(f && t); // predicted false,both have to be true for it to be true
        System.out.println(f || t); // True, inversion of && if there is atleast 1 true it is true
        System.out.println(f || t && !f); // true

        System.out.println(f && t); //short curcuts after checking e --- java does not need to check f
        // this is because the nature of AND and e is already false so that is the only answer
        System.out.println(t || (f && t)); //short circuits after checking the first t.

        // CASTING (term for converting)
        
        int g = (int) 5.5; //converts what would be a decimal down into an integer by rounding down

        System.out.println(g); // comes out as five as 5.5 is invalid

        double h = (double) 5/6;
        System.out.println(h);

        // STRINGS

        String s1 = "Goodnight ";

        String s2 = "and ";

        String s3 = "Goodbye";

        String result = s1 + s2 + s3;

        result += ", cowboy?";

        // /n prints out a new line and does not show in string


        System.out.println(result + "\n");

        // you can use compund modifiers with strings

        //ARRAYS
        //if you declare an array of intigers the contents must ALL be integers

        int[] arry1 = new int[10];
        System.out.println(arry1);

        System.out.println("length:" + arry1.length);

        arry1[0] = 11;
        arry1[1] = 2;

        System.out.println("Remainder: " + arry1[0] % arry1[1]);

        int[] arry2 = {34, 52, 3, 64, 32};
        System.out.println("arry2:" + arry2);

        //2D ARRAYS (grid or table like)

        int[][] arrygrid1 = new int[4][3]; //first bracket his how many rows you have (top bottom), second bracket is how many collums you have (up down)
        
        // The output of the line above would be:
        
        // 0 0 0
        // 0 0 0
        // 0 0 0
        // 0 0 0

        System.out.println("ROWS: " + arrygrid1.length);
        System.out.println("COLLUMS: " + arrygrid1[0].length);
        //collums go from the top (0) and decend down (1, 2, 3... ect)
    }

}
