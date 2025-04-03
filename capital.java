class capital
{
	public static void main(String[]args)
{
	char input='a';
	char output;
	if(Character.isLowerCase(input)){
		output = (char)('Z'-(input-'a'));
	}
	else if(Character.isUpperCase(input)){
		output = (char)('z'-(input-'Z'));
	}
	else{
		output = input;
}
	System.out.println("input"+input);
	System.out.println("output"+output);

	
	
}
}
	