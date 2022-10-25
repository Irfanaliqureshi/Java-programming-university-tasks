import java.util.Scanner;
class task8
{
	public static void main(String[]args)
	{ while(true){
		Scanner in=new Scanner(System.in);
		int x;
		int y;
		int add,substract,multiplication,choice;
		float division;
		System.out.println("enter the the first element :");
		x=in.nextInt();
		System.out.println("enter the the second element :");
		y=in.nextInt();
        System.out.println("  ");
		System.out.println("============ENTER YOUR CHOICE============");
        System.out.println("        1.ADDITION");
        System.out.println("        2.SUBSTRACTION");
        System.out.println("        3.MULTIPLICATION");
        System.out.println("        4.DIVISION");
       		 choice=in.nextInt();
       		 switch( choice){
    		  case 1:  
      		  System.out.println(" you selected ADDITION");
      		  add=x+y;
       		 System.out.println(add);
                break;
                case 2:  
      		  System.out.println(" you selected SUBSTRACTION");
      		  substract=x-y;
       		 System.out.println(substract);
                break;
                case 3:  
      		  System.out.println(" you selected MULTIPLICATION");
      		  multiplication=x*y;
       		 System.out.println(multiplication);
                break;
                case 4:  
      		  System.out.println(" you selected DIVISION");
      		  division=x/y;
       		 System.out.println(division);
                break;
                default:
                System.out.println(" you ENTERED invalid CHOICE:");
	}
   }
}
}
