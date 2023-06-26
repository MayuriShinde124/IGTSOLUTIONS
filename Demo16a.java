class Draw
{
   Draw()
   { 
     this(100); //call Draw(int a) // also should be at 1st line
     System.out.println("Draw()");
   }
   Draw(int a)
   {
      this(100,200); // call should be 1st stmt in constructor
      System.out.println("Draw() area of square"+(a*a));  
   }
   Draw(int l, int b)
   {
      System.out.println("Draw() area of rectangle"+(l*b));  
   }
}



class Demo16a
{
public static void main(String args[])
{
Draw d = new Draw(); //calling multi-const using one obj using this
//Draw d1 = new Draw(2);
//Draw d2 = new Draw(2,4);
}
}