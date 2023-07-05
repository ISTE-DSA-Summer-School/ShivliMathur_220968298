import java.util.*;
class halfReverse {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        String reverse="";
        char ch;
        int i;
        for(i=0;i<str.length()/2;i++){
            ch=str.charAt(i);
            reverse=ch+reverse;
        }
        for(i=str.length()/2;i<str.length();i++){
            ch=str.charAt(i);
            reverse=reverse+ch;
        }
        System.out.println(reverse);
    }
}