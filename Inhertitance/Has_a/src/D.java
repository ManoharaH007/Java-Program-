class A
{
	int i;
	void test1()
	{
		System.out.println("A-test1");
	}
}
class D
{
	A obj;
	void test2() //reference load with the Null value
	{
		System.out.println("D-test2");
		//System.out.println(obj.i);
		//obj.test1();
	}
	public static void main(String[] args) 
	{
		D d1 = new D();
		System.out.println(d1.obj);
		d1.test2();
	}
}
