import java.util.*;
class reverse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//Size of array
        int arr[]=new int[n];
        int temp,j=n-1;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();//getting array elements
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);//printing array elements
        }
        System.out.println();
        for(int i=0;i<n/2;i++){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);//printing array elements
        }
    }
}