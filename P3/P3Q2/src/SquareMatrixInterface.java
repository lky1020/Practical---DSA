public interface SquareMatrixInterface {
    
    //Array
    public int[][] getArray();
    public void setArray(int[][] array);
    
    //Row
    public int getRow();
    public void setRow(int row);
    
    //Column
    public int getColumn();
    public void setColumn(int column);
    
    //sets the first m rows and columns to zero
    public void makeEmpty(int m);
    
    //stores value into the position at row i, column j.
    public void storeValue(int i, int j, int value);
    
    //adds two matrices together
    public void add(int[][] matrix);
    
    //copies one matrix into another
    public void copy(int[][] matrix);
}
