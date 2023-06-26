class A
{    
    private int id;
    private String name;
    private int age;
    void setId(int id)
    {
        this.id=id;
    }
    int getId()
    {
        return id;
    }
    void setAge(int age)
    {
        this.age=age;
    }
    int getAge()
    {
        return age;
    }
    void setName(String name)
    {
        this.name=name;
    }
    String getName()
    {
        return name;
    }
}
class Demo28
{
    public static void main(String ar[])
    {
        A a=new A();
        a.setId(10);
        System.out.println("ID : "+a.getId());
        a.setAge(20);
        System.out.println("AGE : "+a.getAge());
        a.setName("Ram");
        System.out.println("NAME :  "+a.getName());
    }
}