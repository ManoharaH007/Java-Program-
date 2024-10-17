class P
{
	static
	{
		System.out.println("P-SIB");
	}
	static void test1()
	{
		System.out.println("from test1");
	}
}
class Q
{
	public static void main(String[] args)
	{
		System.out.println("------");
		P.test1();
		P.test1();
		P.test1();
		System.out.println("------");
	}
	static
	{
		System.out.println("Q-SIB");
	}
}

// all the static block will be executed from top bottom only once for one 
//execution,before the main method
// static blocks should be out side main method or any other method but within the class
// -we can have any no.of static  blocks
//static blocks can be kept