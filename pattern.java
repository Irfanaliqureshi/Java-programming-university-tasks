import java.util.Scanner;
class pattern{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,size;
		System.out.println(" 1.SQUARE PATTERN");
		System.out.println(" 2.RIGHT TRIANGLE PATTERN");
		System.out.println(" 3.UPPER RIGHT  PATTERN");
		System.out.println(" 4. USA FLAG");
		System.out.println(" 5.MY NAME ");
		
		System.out.println("ENTER THE NUMBER");
		
		 n=sc.nextInt();


		System.out.println("ENTER THE SIZE OF PATTERN :");
		size=sc.nextInt();

if(n==1){
		for(int i=1;i<=size;i++)
		{
		for(int j=1;j<=size;j++)
			{
			System.out.print("*");
			}
			System.out.println();
		}
	}
if(n==2){
	for(int i=1;i<=size;i++)
		{
		for(int j=1;j<=i;j++)
			{
			System.out.print("*");
			}
			System.out.println();
		}

}
if(n==3){
	for(int i=1;i<=size;i++)
		{
		for(int j=5;j>=i;j--)
			{
			System.out.print("*");
			}
			System.out.println();
		}

}
if(n==4){
	int i,j,k;
	for(i=0;i<size;i++){
	System.out.println("* * * * * *  ==============================================");
	}
	for(j=0;j<5;j++){
	System.out.println("===========================================================");
	}
	for(i=0;i<30;i++){
	System.out.println("||");
	}
	System.out.println("NOTE: THERE ARE 50 STARS IN USA FLAG....");
}
if(n==5){
	int i,j,k;
	for(i=0;i<=size;i++){
	System.out.print("i");
	}

	for(j=0;j<=size;j++){

	System.out.println("  i");
	}
	for(k=0;k<=size;k++){
	System.out.print("i");
	}

}
		

		}

	}