
public class SquareMatrix implements SquareMatrixInterface{
    private int[][] array;
    private int row;
    private int column;
    
    public SquareMatrix(){}
    public SquareMatrix(int row, int column){
        // +1 to start at one
        this.row = row;
        this.column = column;
        
        array = new int[this.row + 1][this.column + 1];
    }
    
    public int[][] getArray() {
        return this.array;
    }

    public void setArray(int[][] array) {
        this.array = array;
    }

    public int getRow() {
        return this.row;
    }
    
    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return this.column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
    
    @Override
    public void makeEmpty(int m) {
        // 1 to start at one
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= m; j++){
                array[i][j] = 0;
            }     
        }
    }

    @Override
    public void storeValue(int i, int j, int value) {
        array[i][j] = value;
    }

    @Override
    public void add(int[][] matrix) {
        //i = 1 to start form 1
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= column; j++){
                array[i][j] += matrix[i][j];
            }
        }
    }

    @Override
    public void copy(int[][] matrix) {
        //i = 1 to start form 1
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= column; j++){
                array[i][j] = matrix[i][j];
            }
        }
    }

    @Override
    public String toString() {
        String str = "";
        
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= column; j++){
                str += String.format("%2d", array[i][j]) + " ";
            }
            
            str += "\n";
        }
        
        return str;
    }

}
