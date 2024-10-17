class H
{
	static
	{
		System.out.println("H-SIB"); // static block method (Static init Block)
	}
	public static void main(String[] args)
	{
		System.out.println("H-main");
	}
}
// all the static block will be executed from top bottom only once for one 
//execution,before the main method
// static blocks should be out side main method or any other method but within the class
// -we can have any no.of static  blocks
//static blocks can be kept