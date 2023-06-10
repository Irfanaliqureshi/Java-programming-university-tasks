import java.util.Scanner;
class conversion{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);{
												System.out.println("============ENTER YOUR CHOICE============");
										            System.out.println("        1.DECIMAL TO BINARRY");
										            System.out.println("        2.DECIMAL TO OCTAL ");
										            System.out.println("        3.DECIMAL TO HEXADECIMAL");
										            System.out.println("        4.BINARRY TO DECIMAL  ");
										            System.out.println("        5.BACK ");
										            System.out.println("enter your choice");
										            int conversion=sc.nextInt();
										            if(conversion==1){
										            	char a='y';
										            	while(a=='y' || a=='Y'){
										            		System.out.println("YOU SELECTED DECIMAL TO BINARRY :");
										            		System.out.println("ENTER ANY DECIMAL NUMBER :");
										            		int c=sc.nextInt();
										            		System.out.println(Integer.toBinaryString(c));
										            		System.out.println("DO YOU WANT TO CONTINUE :[Y/N]");
										            		a=sc.next().charAt(0);
										            	}
										            }
										             if(conversion==2){
										            	char a='y';
										            	while(a=='y' || a=='Y'){
										            		System.out.println("YOU SELECTED BINARRY TO DECIMAL :");
										            		System.out.println("ENTER ANY BINARRY NUMBER :");
										            		String binnarystring=sc.next();
										            		System.out.println(Integer.parseInt(binnarystring));
										            		System.out.println("DO YOU WANT TO CONTINUE :[Y/N]");
										            		a=sc.next().charAt(0);
										            	}
										            }
	}


	


	}
	}
