import java.util.*;
class Conversion
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
System.out.println("Please enter celsius");
int celcius = Integer.parseInt(scan.nextLine());
double farenheit = (celcius*1.8)+32;
System.out.println("In fahrenhiet:" +farenheit);

}
}
