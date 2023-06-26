import java.io.*;
class A
{
    void abc()throws MaxAgeException
    {
        for(int age=0;age<=100;age++)
        {
            if(age ==60)throw new MaxAgeException("please check age once again ...!");
            System.out.println("AGE : "+age);
        }
    }
}
class Demo34MaxAge
{
    public static void main(String ar[]) 
    {
        try
        {    
            A a=new A();
            a.abc();
        }
        catch(MaxAgeException e)
        {
            System.out.println(e);
        }    


    }
}
class MaxAgeException extends Exception 
{
    MaxAgeException(String msg)
    {
        super(msg);
    }
}