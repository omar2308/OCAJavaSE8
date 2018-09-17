package ocajavase8.chp05;

public abstract class Whale {
	  abstract void sing();  // DOES NOT COMPILE
}

class HumpbackWhale extends Whale {
	  protected void sing() {
	    System.out.println("Humpback whale is singing");
	  }
	}

