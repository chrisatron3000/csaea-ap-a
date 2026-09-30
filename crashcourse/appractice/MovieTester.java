package appractice;

class Movie {
   // declare instance variables here
	private String title;
	private int rating;
 
   // write the constructor here
	public Movie(String T, int R){


	this.title = T;
	this.rating = R;


}
 
   public void printInfo() {
      System.out.println(title + " — Rating: " + rating);
   }
}

public class MovieTester {
   public static void main(String[] args) {
      Movie one = new Movie("Inception", 9);
      Movie two = new Movie("Interstellar", 8);
      Movie three = new Movie("Tenet", 7);
      one.printInfo();
      two.printInfo();
      three.printInfo();
   }
}

