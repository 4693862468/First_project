/* This program is to demonstrate
* implicit and explicit type casting
*/

import java.util.*;

class TypeCasting
{
public static void main(String[] args)
{
//Convert int to long (Implicit type casting)
int x1 = 100;
double x2 = x1; 
System.out.println("After converting int to double:"+x2);

// convert double to int (Explicit)
double y1 = 44.78;
int y2 = (int)y1;
System.out.println("After converting double to int :"+y2);

//convert char to int (implicit)
char ch = 'R';
int i = ch;
System.out.println("After converting char to int :"+i);

//convert int to char (explicit)
int i1 = 99;
char c = (char) i1;
System.out.println("After converting int to char :"+c);

//convert float to short (explicit)
float f1 = 4.26f;
short s = (short)f1;
System.out.println("After converting float to short :"+s);

<<<<<<< Updated upstream
//convert float to short (explicit) // bug 200
float f4 = 10.27f;
short s = (short)f4;
System.out.println("After converting float to short :"+s);
=======
//convert int to char (explicit) // 100
int i5 = 100;
char c = (char) i5;
System.out.println("After converting int to char :"+c);
>>>>>>> Stashed changes
}
}

