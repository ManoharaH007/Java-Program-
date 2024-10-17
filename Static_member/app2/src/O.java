class N
{
    static int i = 10;
    static
    {
		System.out.println("N-SIB");
    }
}
class O
{
     static
     {
		System.out.println("O-SIB");
     }
	 public static void main(String[] args)
	 {
         System.out.println("O-main-b");
         System.out.println(N.i);
         System.out.println(N.i);
         System.out.println(N.i);
         System.out.println("O-main-e");
	 }
}

// all the static block will be executed from top bottom only once for one 
//execution,before the main method
// static blocks should be out side main method or any other method but within the class
// -we can have any no.of static  blocks
//static blocks can be kept