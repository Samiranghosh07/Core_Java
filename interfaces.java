package abstractclass;

interface BiCycle{
	void speedBreak(int decrement);
	void speedUp(int increment);
}

interface BiCycle2{
	void speedBreak2();
	void speedUp2();
}
class Hero implements BiCycle, BiCycle2{
	
	int speed = 45;
	public void speedBreak(int decrement) {
	    speed = speed - decrement;
	    System.out.println("speed break : " + speed);
	}
	
	public void speedUp(int increment) {
	    speed = speed + increment;
	    System.out.println("speed up : " + speed);
	}
	
	public void speedBreak2() {
	    System.out.println("speed break : " );
	}
	
	public void speedUp2() {
	    System.out.println("speed up : " );
	}
}


public class interfaces {

	public static void main(String[] args) {
		
      Hero h1 = new Hero();
      h1.speedBreak(12);
      h1.speedUp(12);
      h1.speedBreak2();
      h1.speedUp2();
	}

}
