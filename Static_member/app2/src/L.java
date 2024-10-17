class L
{
	static
	{
		System.out.println("SIB-L");
	}
	public static void main(String[] args)
	{
		System.out.println("L-main");
	}
}
class M
{
	static
	{
		System.out.println("SIB-M");
	}
	public static void main(String[] args)
	{
		System.out.println("M-main-begin");
		L.main(null);
		L.main(args);
		System.out.println("M-main-end");
	}
}
// all the static block will be executed from top bottom only once for one 
//execution,before the main method
// static blocks should be out side main method or any other method but within the class
// -we can have any no.of static  blocks
//static blocks can be kept