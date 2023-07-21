public class Overloading
  {

   int sum(int x,int y)
      {
       int z=x+y;
       System.out.println(z);
       return z;
       }

   int sum(int x,int y,int z)
       {
        int i=x+y+z;
        System.out.println(i);
        return i;
       }

   public static void main(String args[])
       {
        Overloading overloading=new Overloading();
        overloading.sum(2,4,5);
        overloading.sum(1,5);
        }
   }
