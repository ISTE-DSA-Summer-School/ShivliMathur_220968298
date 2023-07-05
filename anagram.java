import java.util.*;
class anagram {
    public static boolean checkanagram(String str1,String str2){
        int i,j;
        boolean b=false;
        char ch;
        if(str1.length()!=str2.length())
        b=false;
        else{
            for(i=0;i<str1.length();i++){
               ch=str1.charAt(i);
                for(j=0;j<str2.length();j++){
                   if(ch==str2.charAt(j)){
                    b=true;
                    break;
                   }
                   else
                   b=false;
                }
            }
 
        }
        return b;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter string 1");
        String str1=sc.nextLine();
        System.out.println("Enter string 2");
        String str2=sc.nextLine();
        boolean c=checkanagram(str1,str2);
        System.out.println(c);
    }
}