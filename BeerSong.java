public class BeerSong {
  public static void main (String[] args) {
    int beerNum = 99;
    String word = "bottles";

    while (beerNum > 0) { // while there are bottles of beer...

      if (beerNum == 1) {
        word = "bottle"; // redefines 'word' to eq bottle
      } // end if


      System.out.println(beerNum + " " + word + " of beer on the wall,");
      System.out.println(beerNum + " " + word + " of beer.");
      System.out.println("Take one down,");
      System.out.println("pass it around,");
      beerNum = beerNum - 1;
      System.out.println(beerNum + " " + word + " of beer on the wall.");
      System.out.println(" ");

      if (beerNum > 0) {
        System.out.println(" ");
      } else {
        System.out.println("No more bottles of beer on the wall!");
      } // end if
    } // end while
  } // end main
} // end BeerSong