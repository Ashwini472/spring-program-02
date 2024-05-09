package in.sp.bean;

public class student {
	private int roll;
	private String name;
	private String email;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void display()
	{
		System.out.println("rollno:"+roll);
		System.out.println("name:"+ name);
		System.out.println("email:"+ email);
	}
	
}
