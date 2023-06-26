import java.util.*;
class EMICalculator
{
public static void main(String args[])
{
//create scanner class instance
Scanner scan = new Scanner(System.in);

System.out.println("Please enter loan amount");
int p = Integer.parseInt(scan.nextline());

System.out.println("Please enter rate of interest per annum");
//double pa = Double.parseDouble(scan.nextLine());

System.out.println("Please enter loan tenure in months");
int n = Integer.parseInt(scan.nextline());

//Convert rate of interest from annum to per month
double r = pa / 12 / 100;

//calculate emi
double emi = p * r * Math.pow(1+r), n) / (Math.pow(1+r), n) -1);
System.out.println("Emi is:" + emi);
}
}


