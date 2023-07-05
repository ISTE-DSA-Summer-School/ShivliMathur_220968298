import java.util.*;
class nonRepeated {
    public static char nonRepeat(String str){
        int i,j,s=0;
        char ch=' ';
        for(i=0;i<str.length();i++){
            ch=str.charAt(i);
            if(str.indexOf(ch)==str.lastIndexOf(ch)){
                s=0;
                break;
            }
            else
            s++;
        }
        return ch;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        char c=nonRepeat(str);
        System.out.println(c);
    }
}