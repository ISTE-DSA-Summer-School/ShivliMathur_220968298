import java.util.*;
class reverseString {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        String reverse="";
        char ch;
        int i;
        for(i=0;i<str.length();i++){
            ch=str.charAt(i);
            reverse=ch+reverse;
        }
        System.out.println(reverse);
    }
}