package ThreadMain;

class A implements Runnable{
	
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("From Class A i= "+ i);
		}
		System.out.println("Exit from Class A");
	}
}

class B implements Runnable{
	
	public void run() {
		for(int j=0; j<5;j++) {
			System.out.println("From Class B j= "+ j);
		}
		System.out.println("Exit from Class B");
	}
}

public class Runnablethread {

	public static void main(String[] args) {
		
       A a1 = new A();
       B b1 = new B();
       Thread th1 = new Thread(a1);
       Thread th2 = new Thread(b1);
       
       th1.start();
       //th1.setPriority(5);
       th2.start();
       //th2.setPriority(10);
	}

}
