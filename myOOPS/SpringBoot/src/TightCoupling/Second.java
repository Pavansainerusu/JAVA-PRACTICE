package TightCoupling;
class Second {
	First first=new First();
	Third third=new Third();
	Fourth fourth=new Fourth();
	public static void main(String args[]) {
		System.out.println("iam second");
	}
	public void method1() {
		first.method1();
		third.method1();
		fourth.method1();
	}

}
