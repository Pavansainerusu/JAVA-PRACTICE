package Com.Constructor_injection;

public class College {
	int roll;
	@Override
	public String toString() {
		return "College [roll=" + roll + ", name=" + name + ", college=" + college + "]";
	}
	public College(int roll, String name, String college) {
		super();
		this.roll = roll;
		this.name = name;
		this.college = college;
	}
	String name,college;
	

}
