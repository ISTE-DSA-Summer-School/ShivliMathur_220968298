import java.util.*;
class findWord {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        str=str+" ";
        System.out.println("Enter a word");
        String w=sc.nextLine();
        String wcheck="";
        char ch;
        int i,s=0;
        int l=w.length();
        for(i=0;i<str.length();i++){
            ch=str.charAt(i);
            if(ch!=' '){
                wcheck=wcheck+ch;
            }
            else{
                if(wcheck.contains(w)==true){
                s++;
               }
               wcheck="";
            }
        }
        
        System.out.println(s);
    }
}