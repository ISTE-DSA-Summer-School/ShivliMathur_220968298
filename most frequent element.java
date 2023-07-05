import java.util.*;
class mostFrequent {
    public static char[] mostFreq(String str){
        int i,j,s=0,l=s,a=0;
        char ch;
        char c[]=new char[10];
        for(i=0;i<str.length();i++){
            ch=str.charAt(i);
            for(j=0;j<str.length();j++){
                if(ch==str.charAt(j))
                s++;
            }
            if(s>=l){
                l=s;
            }
            s=0;
        }
        for(i=0;i<str.length();i++){
            ch=str.charAt(i);
            for(j=i;j<str.length();j++){
                if(ch==str.charAt(j))
                s++;
            }
            if(s==l){
                c[a]=ch;
                a++;
            }
            s=0;
        }
        return c;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        char c[]=mostFreq(str);
        for(int i=0;i<c.length;i++){
            if(c[i]!=' ')
            System.out.print(c[i]);
        }
        
    }
}