public class SelectionSort{
    public static void selectionSort(int[] arr){
        int n=arr.length;
        int min;
        int temp;
        for (int i=0;i<n-1;i++){
          min=i;
          for (int j=i+1;j<n;j++){
            if (arr[j]<arr[min]){
              min=j;
            }
          }
          temp=arr[i];
          arr[i]=arr[min];
          arr[min]=temp;
          
        }
      }
      public static void main(String[] args) {
        int[] arr={4,2,3,1,5};
        selectionSort(arr);
        for (int i=0;i<arr.length;i++){
          System.out.println(arr[i]);
        }
      }
}