import java.util.Scanner;
class book{
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter first number");
		int b=sc.nextInt();
		System.out.println(a+" + "+b+" = "+(a+b));
		System.out.println(a+" - "+b+" = "+(a-b));
		System.out.println(a+" * "+b+" = "+a*b);
		System.out.println(a+" / "+b+" = "+a/b);
		System.out.println(a+" mod "+b+" = "+a%b);


	}
}