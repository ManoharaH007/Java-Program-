class D
{
	static int i; //exe with "0" only
	static
	{
		i =10; // after i =10;
}
public static void main(String[] args)
	{
	System.out.println(i);//10
	}
}

// all the static block will be executed from top bottom only once for one 
//execution,before the main method
// static blocks should be out side main method or any other method but within the class
// -we can have any no.of static  blocks
//static blocks can be kept