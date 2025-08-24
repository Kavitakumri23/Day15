import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {-50, 6,4,23,12};
       bubble(arr);
        // direct print array
//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        boolean swapped;
        for(int i=0; i<arr.length; i++){
            swapped = false;
            for(int j=1; j<arr.length-i; j++){
                if(arr[j] < arr[j-1]){
                    //SWAP
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] =temp;
                    swapped = true;
                }
            }
            if(!swapped){  // !false = true
                break;
            }
        }
    }
}
