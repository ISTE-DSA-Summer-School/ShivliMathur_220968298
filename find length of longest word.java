import java.util.*;
class longestWord {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        str=str+" ";
        String wcheck="";
        char ch;
        int i,s=0;
        int l;
        for(i=0;i<str.length();i++){
            ch=str.charAt(i);
            if(ch!=' '){
                wcheck=wcheck+ch;
            }
            else{
                l=wcheck.length();
                if(l>s){
                s=l;
               }
               wcheck="";
            }
        }
        
        System.out.println(s);
    }
}