
public class TestSquareMatrix {
    public static void main(String[] args){
        SquareMatrixInterface squareMatrix = new SquareMatrix(2, 2);
        SquareMatrixInterface squareMatrix2 = new SquareMatrix(2, 2);
        squareMatrix.storeValue(1, 1, 1);
        squareMatrix.storeValue(1, 2, 2);
        squareMatrix.storeValue(2, 1, 3);
        squareMatrix.storeValue(2, 2, 4);
        
        squareMatrix2.storeValue(1, 1, 5);
        squareMatrix2.storeValue(1, 2, 6);
        squareMatrix2.storeValue(2, 1, 7);
        squareMatrix2.storeValue(2, 2, 8);
          
        //add
        int[][] array = squareMatrix2.getArray();
        
        squareMatrix.add(array);
        System.out.println(squareMatrix);
        
        //copy
        array = squareMatrix2.getArray();
        
        squareMatrix.copy(array);
        System.out.println(squareMatrix);
        
        //empty
        squareMatrix.makeEmpty(2);
        System.out.println(squareMatrix);
    }
}
