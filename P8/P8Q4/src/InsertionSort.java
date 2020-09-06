
public class InsertionSort {
    
    public static void main(String[] args){
        int[] arr = new int[]{8, 2, 6, 4, 9, 7, 1};
        
        arr = insertionSort(arr);
        
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
    public static int[] insertionSort(int[] arr){
        int length = arr.length;
        
        for(int i = 1; i < length; i++){
            int firstUnsorted = arr[i];
            insertInOrder(firstUnsorted, arr, i - 1);
        }
        
        return arr;
    }
    
    public static void insertInOrder(int element, int[] arr, int end){
        int index = end;
        
        while((index >= 0) && (element < arr[index])){
            arr[index + 1] = arr[index];
            index--; //minus index because previous got + 1
        }
        
        arr[index + 1] = element;
    }
}
