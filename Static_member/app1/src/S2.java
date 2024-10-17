class S2
{
	static int i ;
	static int j = i =10; // compound assigment is possible for static variables at the classe context,
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
	}
}
