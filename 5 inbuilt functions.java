import java.util.*;
class inbuilt {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        System.out.println("String length:"+str.length());
        System.out.println("Last Character:"+str.charAt(str.length()-1));
        System.out.println("Index of a:"+str.indexOf('a'));
        System.out.println("adding JAZZED to string:"+str.concat(" JAZZED"));
        System.out.println("First word:"+str.substring(0,str.indexOf(" ")));
    }
}