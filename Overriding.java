class PC
{

void m()
{
System.out.println("Hello");
}

int n(int x,int y)
{
int z=x+y;
System.out.println(z);
return z;
}

}

class CC extends PC
{

void m()
{
System.out.println("Hiiiiii");
}

double l(double a,double b)
{
double c=a-b;
System.out.println(c);
return c;
}

}

public class Overriding
{
public static void main(String args[])
{
//PC pc=new PC();
//pc.m();
//pc.n(2,4);

CC cc=new CC();
cc.m();
cc.l(3.5,2.5);
cc.n(2,4);
cc.m();
} 
}


























