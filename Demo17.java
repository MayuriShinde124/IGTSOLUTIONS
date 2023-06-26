class Emp
{
	Emp(int id,String name,int age,int salary,String desig,String pan)
	{
		System.out.println(" yes perfect HR");
	}
	Emp(int id,String name,String project,String loc)
	{
		System.out.println(" yes perfect Manager");
	}
}
class Demo17
{
	public static void main(String ar[])
	{
		Emp e=new Emp(12,"mayuri",22,35000,"trainee","pune");
		Emp e1=new Emp(12,"pooja","IQD","pune");
	}
}


//HR :id,name,age,salary,loc
//Manager:id,name,project,lcation