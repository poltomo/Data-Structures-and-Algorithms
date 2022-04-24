public class InsertionSort{
  public static void insertionSort(int[] arr){
    int temp;
    for (int i=1;i<arr.length;i++){
      for(int j=i;j>0;j--){
        if (arr[j]<arr[j-1]){
          temp=arr[j];
          arr[j]=arr[j-1];
          arr[j-1]=temp;
        }
      }
    }
  }
      public static void main(String[] args) {
        int[] arr={4,2,3,1,5};
        insertionSort(arr);
        for (int i=0;i<arr.length;i++){
          System.out.println(arr[i]);
        }
      }
}