class A
{
void m()
{
System.out.println("Class A");
}
}


class B extends A
{
void n()
{
System.out.println("Class B");
}
}


class C extends B
{
void o()
{
System.out.println("Class C");
}
}

public class Multilevel
{
public static void main( String args[]) 
{
C  c=new  C();
 c.m();
 c.n();
 c.o();
}
}

