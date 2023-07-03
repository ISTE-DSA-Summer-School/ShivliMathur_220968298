import java.util.*;
class sorting {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//Size of array
        int ar[]=new int[n];
        int arr[]=new int[n];
        int temp;
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();//getting array elements
        }
        for(int i=0;i<n;i++){
            arr[i]=ar[i];//creating another array with same elements to alter
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);//printing array elements
        }
        System.out.println();
        //Bubble sort
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }  
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);//printing array elements
        }
        System.out.println();
        for(int i=0;i<n;i++){
            arr[i]=ar[i];//creating another array with same elements to alter
        }
        //Selection sort
        for(int i=0;i<n-1;i++){
            int smallest=i;
            for(int j=i+1;j<n;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
                temp=arr[smallest];
                arr[smallest]=arr[i];
                arr[i]=temp;  
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);//printing array elements
        }
        System.out.println();
        for(int i=0;i<n;i++){
            arr[i]=ar[i];//creating another array with same elements to alter
        }
        //Insertion sort
        for(int i=1;i<n;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0&& current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }  
            arr[j+1]=current;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);//printing array elements
        }
    }
}