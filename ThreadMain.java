package ThreadMain;
import java.lang.Thread;

class A extends Thread{
	public void run() {
		for(int i=0; i<5; i++) {
			if(i==1)
				Thread.yield();
				System.out.println("Hello from class A ==> i =" + i);
		}
		System.out.println("Exit from class A");
	}
}

class B extends Thread{
	public void run() {
		for(int j=0; j<5; j++) {
			if(j==2)
				try {
					Thread.sleep(15);
				} catch (InterruptedException e) {
					//e.printStackTrace();
				}
				System.out.println("Hello from class B ==> j =" + j);
		}
		System.out.println("Exit from class B");
	}
}

class C extends Thread{
	public void run() {
		for(int k=0; k<5; k++) {
			if(k==3)
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					//e.printStackTrace();
				}
				System.out.println("Hello from class C ==> k =" + k);
		}
		System.out.println("Exit from class C");
	}
}

public class ThreadMain {

	public static void main(String[] args) {
        
		A threadA = new A();
		B threadB = new B();
		C threadC = new C();
		
		/*set thread priority
		 Min_priority = 1
		 Normal_priority = 5
		 Max_priority = 100
		 */
		threadA.setPriority(1);
		threadA.setPriority(5);
		threadA.setPriority(10);
		
		
		System.out.println("Start threada");
		System.out.println("Start threadb");
		System.out.println("Start threadc");
		threadA.start();
		threadB.start();
		threadC.start();
	}

}
