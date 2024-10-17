class E
{
	int i;
	public String toString()
	{
		return "i =" +i;
	}
	}

class F
{
	int j;
	E etype;
	public String toString()
	{
		return "j =" +j+ ","+ etype;// its called E class 

}
}
class M4
{
	public static void main(String[] args)
	{
		E e1 =new E();
		e.i = 10;
		F f1 = new F();
		f1.j =20;
		f1.etype=e1;
		System.out.println(e1);
		System.out.println(f1);

{
}