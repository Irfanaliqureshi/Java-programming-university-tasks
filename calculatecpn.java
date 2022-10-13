import java.util.*;
class calculatecpn {
 public  static void main(String[] args) {
 Scanner obj=new Scanner(System.in);
double matric,enter,test;
double a,b,c,cpn;
System.out.println("enter your matric marks");
matric=obj.nextDouble();
matric=matric/850*100;
System.out.println("enter your enter marks");
enter=obj.nextDouble();
enter=enter/1100*100;
System.out.println("enter your entry test marks");
test=obj.nextDouble();
test=test/100*100;
cpn=(matric/100)*10+(enter/100)*30+(test/100)*60; 
 System.out.println(cpn);
  }
}
