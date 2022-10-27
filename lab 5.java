import java.util.Scanner;
class lab5
 {
  public static void main(String[] args) 
  { 
   Scanner in=new Scanner(System.in);
   String username="irfanali",password="12345678";
   int choice;
   System.out.println("Enter username");
   username=in.next();
   System.out.println("Enter password");
   password=in.next();
   if(username.equals("irfanali@gmail.com")&&password.equals("12345678"))
   {
   System.out.println("Login Success \n Wellcome to Rishta website:");}
   else {
   System.out.println("Login Failed!!!");
   System.out.println("        ");
   System.out.println(" *********LOGIN HINT:**********");
   System.out.println("Forgotten email or password Don't worry . we will help you in Signing in :\nPLEASE Select the choice in which you want hint:");
   System.out.println("1.Email \n2.Password \n3.Email and Password both");
   choice=in.nextInt();
   switch (choice) {
   case 1:
   System.out.println(" Your Email is \n irfanali@gmail.com");
     System.out.println("Enter username");
   username=in.next();
   System.out.println("Enter password");
   password=in.next();
   if(username.equals("irfanali@gmail.com")&&password.equals("12345678"))
   System.out.println("Login Success\n Wellcome to Rishta Website:");
   break;
     case 2:
   System.out.println(" Your Password is \n 12345678");
     System.out.println("Enter username");
   username=in.next();
   System.out.println("Enter password");
   password=in.next();
   if(username.equals("irfanali@gmail.com")&&password.equals("12345678"))
   System.out.println("Login Success\n Wellcome to Rishta website:");
   break;
    case 3:
   System.out.println("Your Password is \n 12345678\nYour Email is \n irfanali@gmail.com: ");
     System.out.println("Enter username");
   username=in.next();
   System.out.println("Enter password");
   password=in.next();
   if(username.equals("irfanali@gmail.com")&&password.equals("12345678"))
   System.out.println("Login Success \n Wellcome to Rishta website:");
   break;
   
   default:
   System.out.println("Login again failed We APOLOGISE you please try next time:");}
   }
  }
 }
}
  
 
