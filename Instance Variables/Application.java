import java.util.Scanner;
class Test
{
	public static void main(String[]args)
	{
	System.out.println("Ride with Rider");
	int KUKATPALLY=40,KPHB=45,MIYAPUR=55,AMERPET=30,LBNAGAR=25,Total=0,Members=0,choice=0;
	String Suggestion=" ";
	Scanner s=new Scanner(System.in);
	do
	{
		System.out.println("Rides Available from Sec"+"\n1.KUKATPALLY\n2.KPHB\n3.MIYAPUR\n4.AMERPET\n5.LB NAGAR");
		System.out.println("Choose an Ride to Move");
		choice =s.nextInt();
		switch(choice)
		{
		case 1:
		{
			System.out.println("You choosed ride to KUKATPALLY "+"Total members");
			Members=s.nextInt();
			Total=Total+(Members*KUKATPALLY);
			break;
		}
		case 2:
		{
			System.out.println("You choosed ride to KPHB "+"Total members");
			Members=s.nextInt();
			Total=Total+(Members*KPHB);
			break;
		}
		case 3:
		{
			System.out.println("You choosed ride to MIYAPUR "+"Total members");
			Members=s.nextInt();
			Total=Total+(Members*MIYAPUR);
			break;
		}
		case 4:
		{
			System.out.println("You choosed ride to AMERPET "+"Total members");
			Members=s.nextInt();
			Total=Total+(Members*AMERPET);
			break;
		}
		case 5:
		{
			System.out.println("You choosed ride to LB NAGAR "+"Total members");
			Members=s.nextInt();
			Total=Total+(Members*LBNAGAR);
			break;
		}
		default:
		{
			System.out.println("Invalid Ride please enter valid one");
		}
}
		System.out.println("Give me your opinion");
		char dec=s.next().charAt(0);
		if(dec=='n')
		{
		System.out.println("Total Amount "+Total);
		break;
		}
		else
		System.out.println("Total Amount "+Total);
}	
while(true);
}
}

				