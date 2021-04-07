import java.util.*;
public class Main{
    static int[] insertionsort(int[] a,int n){
      for(int i=1;i<n;i++){
          int key=a[i];
          int j=i-1;
          while( j>=0 && a[j]>key){
              a[j+1]=a[j];
              j=j-1;
          }
          a[j+1]=key;
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
        int[] sortedArray=insertionsort(arr,n);
        for(int i:sortedArray){
            System.out.print(" "+i);
        }
        sc.close();
    }
}