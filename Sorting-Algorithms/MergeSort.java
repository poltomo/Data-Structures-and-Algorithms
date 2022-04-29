class MergeSort{
    public static void mergeSort(int[] arr){
        int n = arr.length; // array length
        if (n<2){
            return; // array has 1 element, so return
        }
        int mid = n/2; // middle index

        int[] arrLeft = new int[mid];
        int[] arrRight = new int[n-mid];

        for (int i=0;i<mid;i++){
            arrLeft[i]=arr[i];
        }
        for (int i=mid;i<n;i++){
            arrRight[i-mid]=arr[i];
        }

        mergeSort(arrLeft);
        mergeSort(arrRight);

        merge(arr, arrLeft, arrRight); // merge
    }
    private static void merge(int[] arr, int [] arrLeft, int[] arrRight){
        int nLeft = arrLeft.length;
        int nRight = arrRight.length;

        int i=0, j=0, k=0;

        while (i<nLeft && j<nRight){
            if (arrLeft[i]<=arrRight[j]){
                arr[k]=arrLeft[i];
                i++;
            }
            else {
                arr[k]=arrRight[j];
                j++;
            }
            k++;
        }
        while (i<nLeft){
            arr[k]=arrLeft[i];
            i++;
            k++;
        }
        while (j<nRight){
            arr[k]=arrRight[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args){
        int[] arr = {9,0,8,1,7,2,6,3,5,4};
        mergeSort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
