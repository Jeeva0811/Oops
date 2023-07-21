public class Constructor
{
int id;
double total;
//int grade;

Constructor(int a,double b)
{
id=a;
total=b;
//grade=c;
}
void sum()
{
double sum=id+total;
System.out.println(sum);
}
void sub()
{
double sub=id-total;
System.out.println(sub);
}
void mul()
{
double mul=id*total;
System.out.println(mul);
}
public static void main(String arg[])
{
Constructor ram=new Constructor(23,20.0);
Constructor sam=new Constructor(8,1.0);
Constructor teja=new Constructor(15,10.0);
ram.sum();
ram.sub();
sam.sub();
teja.mul();
}

}

