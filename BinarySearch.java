public class BinarySearch{
    public static int binSearch(int[] arr,int key){
        int min=0;
        int max=arr.length-1;
        int mid;
        while (max>=min){
          mid=(max+min)/2;
          if (key==arr[mid]){
            return mid;
          }
          else if (key>arr[mid]){
            min=mid+1;
          }
          else {
            max=mid-1;
          }
        }
        return -1;
      }
      public static void main(String[] args) {
        int[] arr={1,3,5,6,7,9,5,6,7,8};
        System.out.println(binSearch(arr,5));
        System.out.println(binSearch(arr,4));
      }
}