package Com.Constructor_injection;

public class Faculty {
	int fac_id;
	String fac_name;
	double fac_salary;
	College college;
	public Faculty(int fac_id, String fac_name, double fac_salary, College college) {
		super();
		this.fac_id = fac_id;
		this.fac_name = fac_name;
		this.fac_salary = fac_salary;
		this.college = college;
	}

	@Override
	public String toString() {
		return "Faculty [fac_id=" + fac_id + ", fac_name=" + fac_name + ", fac_salary=" + fac_salary + ", college="
				+ college + "]";
	}

}
