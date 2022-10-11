import java.util.Scanner;
class evenodd{
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
