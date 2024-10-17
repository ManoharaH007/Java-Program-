class K2
{
		static int i = 100;
	public static void main(String[] args)
	{
		System.out.println("a:"+i);
		int i =10;
		System.out.println("b:"+i);
		 i =20;
		System.out.println("c:"+K2.i); // class name refernce 
		K2.i=200;
		System.out.println("c:"+K2.i);

	}
}
	



		