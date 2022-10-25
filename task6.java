import java.util.Scanner;
class task6 {
    public static void main(String args[]) {
        while(true) {
         Scanner obj= new Scanner(System.in) ;
       int  chicken=100,mutton=150,beef=170,chips=90,icecream=70,ladyfinger=120,tea=50,choice;
       int quantity,total;
       System.out.println("############### WELLCOME TO DISCO RESTUARANT: ###############");
       System.out.println("  ");
       System.out.println("                1.CHICKEN                 =  100");
       System.out.println("                2.MUTTON                  =  150");
       System.out.println("                3.BEEF                    =  170");
       System.out.println("                4.PATOTOES CHIPS          =  90");
       System.out.println("                5.ICECREAM                =  70");
       System.out.println("                6.LADYFINGER              =  120");
       System.out.println("                7.TEA                     =  50");
       System.out.println("     ");
       System.out.println(" ENTER YOUR CHOICE PLEASE:");
       choice=obj.nextInt();
       switch(choice){
       case 1:
       System.out.println(" you selected CHIKHEN :");
       System.out.println(" ENTER Quantity:");
       quantity=obj.nextInt();
       total=quantity*chicken;
       System.out.println("==========================================================");
       System.out.println(" *******YOUR BILL IS********");
       System.out.println(total);
       break;

       case 2:
       System.out.println(" you selected MUTTON :");
       System.out.println(" ENTER Quantity:");
       quantity=obj.nextInt();
       total=quantity*mutton;
       System.out.println("==========================================================");
       System.out.println(" *******YOUR BILL IS********");
       System.out.println(total);
       break;

       case 3:
       System.out.println(" you selected BEEF :");
       System.out.println(" ENTER Quantity:");
       quantity=obj.nextInt();
       total=quantity*beef;
       System.out.println("==========================================================");
       System.out.println(" *******YOUR BILL IS********");
       System.out.println(total);
       break;

       case 4:
       System.out.println(" you selected PATOTOES CHIPS :");
       System.out.println(" ENTER Quantity:");
       quantity=obj.nextInt();
       total=quantity*chips;
       System.out.println("==========================================================");
       System.out.println(" *******YOUR BILL IS********");
       System.out.println(total);
       break;

       case 5:
       System.out.println(" you selected ICECREAM :");
       System.out.println(" ENTER Quantity:");
       quantity=obj.nextInt();
       total=quantity*icecream;
       System.out.println("==========================================================");
       System.out.println(" *******YOUR BILL IS********");
       System.out.println(total);
       break;

       case 6:
       System.out.println(" you selected LADYFINGER:");
       System.out.println(" ENTER Quantity:");
       quantity=obj.nextInt();
       total=quantity*ladyfinger;
       System.out.println("==========================================================");
       System.out.println(" *******YOUR BILL IS********");
       System.out.println(total);
       break;
       case 7:
       System.out.println(" you selected TEA :");
       System.out.println(" ENTER Quantity:");
       quantity=obj.nextInt();
       total=quantity*tea;
       System.out.println("==========================================================");
       System.out.println(" *******YOUR BILL IS********");
       System.out.println(total);
       break;
       default:
       System.out.println(" YOU ENTERED INVALID NUMBER");
       }
     }
  }
}