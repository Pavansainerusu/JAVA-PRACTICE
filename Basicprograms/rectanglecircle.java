//The length & breadth of a rectangle and radius of a circle are input through the keyboard. Write a program to calculate the area & perimeter of the rectangle, and the area & circumference of the circle.

class rectanglecircle
{
	public static void main(String[]args)
	{
	int l=5,b=4,r=3;
	int rectangleArea=l*b;
	int rectanglePerimeter=2*(l+b);
	double circleArea=3.14*r*r;
	double circleCircumference=2*3.14*r;
	System.out.println("Rectangle area is"+rectangleArea);
	System.out.println("Rectangle perameteris"+rectanglePerimeter);
	System.out.println("circle area is"+circleArea);
	System.out.println("circleCircumference is"+circleCircumference);
	}
}y