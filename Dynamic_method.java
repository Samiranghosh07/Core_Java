package Dynamic_method;

class Tv{
	
	public void f1() {
		System.out.println("Hi, I am in f1 with class Tv");
	}
}

class SmartTv extends Tv{
	
	@Override
	public void f1() {
		System.out.println("Hi, I am in f1 with class SmartTv");
	}
}


public class Dynamic_method {

	public static void main(String[] args) {
		
		Tv s1 = new SmartTv(); //dynamic Method 
		s1.f1();
        
	}

}
