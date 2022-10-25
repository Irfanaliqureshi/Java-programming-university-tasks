// Create a program using every single operator we have learned till now.
import java.util.Scanner;
  class Task3.java{
public static void main(String[] args) {
Scanner obj=new Scanner(System.in);int a,b,c;
System.out.println("Arithmatic and assigment Operators");
System.out.println("Enter the first number ");
a=obj.nextInt();
System.out.println("Enter the second number ");
b=obj.nextInt();
c=a+b;
System.out.println("addition\n"+c);
c=a-b;
System.out.println("substraction\n"+c);
c=a*b;
System.out.println("multiplcation\n"+c);
c =a/b;
System.out.println("dividion\n"+c);
c=a%b;
System.out.println("Modulus\n"+c);
System.out.println("Now we will practise  relational and condational operators ");	
System.out.println("Enter the first number ");
a=obj.nextInt();
System.out.println("Enter the second number ");
b=obj.nextInt();
if(a==b)
System.out.println(" Using Equal operator");	
else  if(a>b)
System.out.println(" Using Greater than  operator");
else  if (b>a)	
System.out.println(" Using less than  operator");	
System.out.print("");
a=obj.nextInt();
System.out.print("");
b=obj.nextInt();
if(a==b)
System.out.println(" Using Equal operator");	
else if (a!=b)
System.out.println(" Using not  Equal operator");
else  if(a>b)
System.out.println(" Using Greater than  operator");
else  if (a<b)	
System.out.println("using less than operator");
else if (a!=b)
System.out.println(" Using not  Equal operator");
System.out.print("");
a=obj.nextInt();
System.out.print("");
b=obj.nextInt();	
if(a==b)
System.out.println(" Using Equal operator");	
else  if(a>b)
System.out.println(" Using Greater than operator");
else  if (b>a)
System.out.println("using less than operator ");
else if (a!=b)
System.out.println(" Using not  Equal operator");
System.out.print("");
a=obj.nextInt();
System.out.print("");
b=obj.nextInt();	
if(a==b)
System.out.println(" Using equal operator");	
else  if(a>b)
System.out.println(" Using Greater than operator");
else  if (b>a)	
System.out.println(" Using less than operator ");
else if (a!=b)
System.out.println(" Using not  Equal operator");
else 
System.out.print("please enter only integers ");
System.out.println("  logical operators ");			
System.out.println("Enter the first number ");
a=obj.nextInt();
System.out.println("Enter the second number ");
b=obj.nextInt();
if ( a ==a || b== b)
System.out.println(" using or logical operator  ");
System.out.println("that were Arithamtic ,Relational ,condational and logical  operators\n basic operators in java language hope you enjoyed it  ");
}
