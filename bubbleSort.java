package sorting;

public class bubbleSort {

    public static void bubblesort(int arr[]){

        // outer loop 
        for(int turn=0 ; turn<arr.length -1 ; turn++){
         // inner loop 
         for(int j = 0; j<arr.length-1- turn ; j++){
            if ( arr[ j] < arr[j+1]){
       // swap  
             int temp = arr[j];
             arr[j] = arr[j+1];
             arr[j=1] = temp;
         


            } 
        }
    }
}

    public static void PrintArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
        
    public static void main(String[] args) {
        int arr[] = { 5, 4, 2, 6, 1, 3 };

        bubblesort(arr);
        PrintArr(arr);
    }
}