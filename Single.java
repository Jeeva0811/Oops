class RBI
{
double minBalance=2000.0;
double balance=10000.0;

double credit(double amount)
{
balance =balance+amount;
System.out.println("balance  after credit-->"+balance);
return balance;
}

double debit(double amount)
{
balance =balance-amount;
System.out.println("balance  after debit-->"+balance);
return balance;
}

}

class SBI extends RBI
{

double rateOfInterest(double amount)
{
double interestAmount = amount*(18.0/100.0);
System.out.println("interestAmount -->"+interestAmount);
return interestAmount;
}

}

public class Single
{
public static void main(String jeeva[])
{
SBI sbi = new SBI();
sbi.credit(10000.0);
sbi.rateOfInterest(1000.0);
}

}
