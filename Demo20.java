class Bank
{
	public int loan()
	{
		return 8;
	}
	
}
class SBI extends Bank
{
	
}
class Axis extends Bank
{
	public int loan()
	{
		//same method name but different implementation in child class .....!1 over riding 
		return 10;
	}
}
class Demo20
{
public static void main(String ar[])
{
	SBI s=new SBI();
	System.out.println(s.loan()+" % ");

	Axis a=new Axis();
	System.out.println(a.loan()+" % ");
}
}
