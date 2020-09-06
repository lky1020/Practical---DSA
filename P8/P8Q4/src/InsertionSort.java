
public class InsertionSort {
    
    public static void main(String[] args){
        Integer[] arr = new Integer[]{8, 2, 6, 4, 9, 7, 1};
        
        insertionSort(arr);
        
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
    public static <T extends Comparable<T>> void insertionSort(T[] arr){
        int length = arr.length;
        
        for(int i = 1; i < length; i++){
            T firstUnsorted = arr[i];
            insertInOrder(firstUnsorted, arr, i - 1);
        }
        
    }
    
    public static <T extends Comparable<? super T>> void insertInOrder(T element, T[] arr, int end){
        int index = end;
        
        while((index >= 0) && (element.compareTo(arr[index]) <= -1)){
            arr[index + 1] = arr[index];
            index--; //minus index because previous got + 1
        }
        
        arr[index + 1] = element;
    }
}
