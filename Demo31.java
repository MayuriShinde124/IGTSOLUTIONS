interface University
{
   //University(){}
   //int a;
   //void xyz(){}
   public void exam();
   void result();
}

class IITB implements University
{
   public void exam()
   {
     //Online
   }
   public void result()
   {
     //Mail
   }
}

class IITD implements University
{
    public void exam()
   {
     //Ofline
   }
   public void result()
   {
     //Web
   }
}

class IITM implements University
{
   public  void exam()
   {
     //Ofline
   }
   public void result()
   {
     //Newspaper
   }

}


class Demo31
{
public static void main(String args[])
{

}
}