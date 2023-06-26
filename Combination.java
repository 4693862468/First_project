import java.util.*;
class Combination
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
System.out.println("Enter A value");
int a = Integer.parseInt(scan.nextLine());
System.out.println("Enter B value");
int b = Integer.parseInt(scan.nextLine());
int sum = a + b;
System.out.println("The two numbers addition is :" +sum);
int mul = a*b;
System.out.println("The two numbers Multiplication is:" +mul);
int sub = a-b;
System.out.println("subtraction of  two numbers:" +sub);
int div = a/b;
System.out.println("Division of  two numbers:" +div);

}}