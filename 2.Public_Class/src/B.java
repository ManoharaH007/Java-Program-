class B 
{
	String userName;
	int userRegisterNo;

	B(String theUserName, int theUserRegisterNo)
	{
		this.userName = theUserName;
		this.userRegisterNo = theUserRegisterNo;
	}

		public static void main(String[] args) 
	{
		B b1 = new B("vijay", 101);
		System.out.println(b1);
	}
}
