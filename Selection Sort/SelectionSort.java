import java.util.*;
public class SelectionSort{
    static int[] selectionsort(int[] a,int n){
       for(int i=0;i<n-1;i++){
           int min=a[i];
           for(int j=i+1;j<n;j++){
               if(a[j]<min){
                   int temp=a[i];
                   a[i]=a[j];
                   a[j]=temp;
               }
           }
       }
        return a;
    }
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] sortedArray=selectionsort(arr,n);
        for(int i:sortedArray){
            System.out.print(" "+i);
        }
        sc.close();
    }
}