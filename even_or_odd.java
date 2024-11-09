// A program which show's your variable stores even/odd number.
import java.util.Scanner;
class even_or_odd{
public static void main(String[] args) {
Scanner obj=new Scanner(System.in);
int a;
System.out.println("Enter any Number ");
a=obj.nextInt();	
if(a%2==0)
{
System.out.println("number is even");
}
else 
{
System.out.println("number is odd");
}
}
}
