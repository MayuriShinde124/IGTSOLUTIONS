class Parent
{
	int site=5;
	int money=50000;
	String car="BMW";
	

}
class Child extends Parent
{
	int money=10000;
	void use()
	{
  		System.out.println("SITE : "+site);
		System.out.println("Child MONEY : "+money);
		System.out.println("Parent MONEY : "+super.money);
		System.out.println("BOTH : "+(super.money+money));
		System.out.println("CAR : "+car);

	}

}
class Demo8a
{

	public static void main(String ar[])
	{
		Child c=new Child();
		c.use();

	}

}