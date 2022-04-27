class BinarySearchRec{
    public static int binSearch(int[] arr, int target, int min, int max){
    int mid = (min+max)/2;
    if (max<min){
      return -1;
    }
    if (target==arr[mid]){
      return mid;
    }
    else if (target<arr[mid]){
      return binSearch(arr, target, min, mid-1);
    }
    else if (target>arr[mid]){
      return binSearch(arr, target, mid+1, max);
    }
    return -1;
  }

  public static void main(String[] args) {
      int[] arr={0,1,2,3,4,5,6,7,8,9};
      //         0,1,2,3,4,5,6,7,8,9
      for (int num:arr){
          System.out.println(binSearch(arr,num,0,arr.length-1));
      }
      System.out.println(binSearch(arr,12,0,arr.length-1));
  }
}
