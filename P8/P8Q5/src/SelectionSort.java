
public class SelectionSort {
    public static void main(String[] arge){
        Integer[] arr = new Integer[]{ 15, 8, 10, 2, 5};
        
        selectionSort(arr, arr.length);
        
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
    public static <T extends Comparable<T>>
        void selectionSort(T[] a, int n){
            selectionSort(a, 0, n - 1);
        }
    
    private static <T extends Comparable<? super T>> 
        void selectionSort(T[] a, int first, int last){
            
            if(first < last){
                int indexOfSmallest = first;
                T min = a[first];
                
                for(int i = first + 1; i <= last; i++){
                    
                    if(a[i].compareTo(min) <= -1){
                        min = a[i];
                        indexOfSmallest = i;
                    }
                    
                }
                
                //Swap
                a[indexOfSmallest] = a[first];
                a[first] = min;

                selectionSort(a, first + 1, last);
            }
        }
}
