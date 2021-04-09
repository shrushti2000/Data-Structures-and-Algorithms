public class MyClass {
    public static void main(String args[]) {
     int[] arr={29,40,1,30,22};
     int leng=arr.length;
     MyClass qsm=new MyClass();
     qsm.quickSortMiddle(arr,0,leng-1);
      printArray(arr);
    }
    int partition(int[] arr,int low,int high){
        int pivot=arr[(low+high)/2];
        while(low<=high){
            while(arr[low]<pivot){
                low++;
            }
            while(arr[high]>pivot){
                high--;
            }
            if(low<=high){
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
            }
        }
        return low;
    }
    void quickSortMiddle(int[] arr,int low,int high){
        int pi=partition(arr,low,high);
        if(low<pi-1){
            quickSortMiddle(arr,low,pi-1);
       }
       if(pi<high){
           quickSortMiddle(arr,pi,high);
       }
    }
     static void printArray(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}