
//final class Car -can't be inherited
class Car
{
 final int speed =200;
 final void run()
{
System.out.println("Hi run method with speed of 200");
}
}

class Maruti extends Car
{
 //void run()
//   {
//       System.out.println("Hi run method with speed of 200");//Final method can't be override
//    }
}


class Demo25
{
public static void main(String args[])
{
Car c = new Car();
c.run();
System.out.println("Speed :"+ c.speed);

//c.speed=2000; //we can't modify the final variable
System.out.println("Speed:"+ c.speed);

Maruti m = new Maruti();
m.run();

} 
}
 