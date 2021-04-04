import java.util.*;
public class BubbleSort{
    static int[] bubblesort(int[] a,int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
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
        int[] sortedArray=bubblesort(arr,n);
        for(int i:sortedArray){
            System.out.print(" "+i);
        }
        sc.close();
    }
}