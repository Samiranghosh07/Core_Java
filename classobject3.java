package classobject3;


class Employee{
	
	private double id;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String n) {
		this.name=n;
	}
	public double getId() {
		return id;
	}
	public void setId(double i) {
		this.id=i;
	}
	
	
}


public class classobject3 {

	//main function
	public static void main(String[] args) {
		Employee e1 =  new Employee();
		e1.setName("James Bond");
		System.out.println("Name :" + e1.getName());
		e1.setId(0.007);
		System.out.println("Id :" + e1.getId());

	}


}
