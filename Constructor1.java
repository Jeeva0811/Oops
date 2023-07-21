public class Constructor1
{
int id;
double total;
int grade;

Constructor1()
{
id=20;
total=6;
}
void sum()
{
int sum=id+grade;
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
Constructor1 ram=new Constructor1();
Constructor1 sam=new Constructor1();
Constructor1 teja=new Constructor1();
ram.sum();
ram.sub();
sam.sub();
teja.mul();
ram=null;
}

}

