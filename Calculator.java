import java.util.*;
class Calculator {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("1 for addition");
       System.out.println("2 for subtraction");
       System.out.println("3 for multiplication");
       System.out.println("4 for division");
       System.out.println("5 for remainder(modular)");

       int a = sc.nextInt();
       int b = sc.nextInt();
       int operator = sc.nextInt();
       
       switch(operator) {
           case 1 : System.out.println(a+b);
           break;
           case 2 : System.out.println(a-b);
           break;
           case 3 : System.out.println(a*b);
           break;
           case 4 : if(b == 0) {
                       System.out.println("Can't divide by 0");
                   } else {
                       System.out.println(a/b);
                   }
	    break;
           case 5 : if(b == 0) {
                       System.out.println("Can't divide by 0");
                   } else {
                       System.out.println(a%b);
                   }
	    break; 
           default : System.out.println("Choose from 1-5 0nly");
       }
   }
}
