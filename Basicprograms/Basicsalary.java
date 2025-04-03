//Basic salary
class Basicsalary
{
	public static void main(String[]args)
{
	double basicsalary=15000;
	double Allowance=basicsalary*40/100;
	double Rent=basicsalary*20/100;
	double r=Allowance+Rent;
	double remainingsalary=basicsalary-r;
	System.out.println(remainingsalary);
}
}