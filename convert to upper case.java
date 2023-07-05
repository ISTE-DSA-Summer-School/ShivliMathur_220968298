import java.util.*;
class convertToUpperCase {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        String up="";
        char ch;
        int i;
        for(i=0;i<str.length();i++){
            if(str.charAt(i)!=' ')
            ch=(char)((int)str.charAt(i)-32);
            else
            ch=' ';
            up=up+ch;
        }
        System.out.println(up);
    }
}