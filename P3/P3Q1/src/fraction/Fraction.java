
package fraction;


public class Fraction implements FractionInterface {

    private int numerator ;
    private int denominator;
    
    //Result (storing the result of the arithmetric operation)
    private int newNumerator;
    private int newDenominator;
    private FractionInterface resultFraction; 
    
    public Fraction(){
        
    }
    
    public Fraction(int numerator, int demominator){
        this.numerator = numerator;
        this.denominator = demominator;
    }
    
    @Override
    public int getNumerator() {
        return this.numerator ;
    }

    @Override
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    @Override
    public int getDenominator() {
        return denominator;
    }

    @Override
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getNewNumerator() {
        return newNumerator;
    }

    public void setNewNumerator(int newNumerator) {
        this.newNumerator = newNumerator;
    }

    public int getNewDenominator() {
        return newDenominator;
    }

    public void setNewDenominator(int newDenominator) {
        this.newDenominator = newDenominator;
    }

    public FractionInterface getResultFraction() {
        return resultFraction;
    }

    public void setResultFraction(FractionInterface resultFraction) {
        this.resultFraction = resultFraction;
    }

    @Override
    public FractionInterface addition(FractionInterface fraction) {
        
        this.setNewNumerator((this.getNumerator() * fraction.getDenominator()) + (this.getDenominator() * fraction.getNumerator()));
        this.setNewDenominator(this.getDenominator() * fraction.getDenominator());

        reduceFraction(this.newNumerator, this.newDenominator);
        
        resultFraction = new Fraction(this.getNewNumerator(), this.getNewDenominator());
        return resultFraction;
    }

    @Override
    public FractionInterface subtraction(FractionInterface fraction) {
        this.setNewNumerator((this.getNumerator() * fraction.getDenominator()) - (this.getDenominator() * fraction.getNumerator()));
        this.setNewDenominator(this.getDenominator() * fraction.getDenominator());
        
        reduceFraction(this.newNumerator, this.newDenominator);
        
        resultFraction = new Fraction(this.getNewNumerator(), this.getNewDenominator());
        return resultFraction;
    }

    @Override
    public FractionInterface multiplication(FractionInterface fraction) {
        this.setNewNumerator(this.getNumerator() * fraction.getNumerator());
        this.setNewDenominator(this.getDenominator() * fraction.getDenominator());
        
        reduceFraction(this.newNumerator, this.newDenominator);
        
        resultFraction = new Fraction(this.getNewNumerator(), this.getNewDenominator());
        return resultFraction;
    }

    @Override
    public FractionInterface division(FractionInterface fraction) {
        this.setNewNumerator(this.getNumerator() * fraction.getDenominator());
        this.setNewDenominator(this.getDenominator() * fraction.getNumerator());
        
        reduceFraction(this.newNumerator, this.newDenominator);
        
        resultFraction = new Fraction(this.getNewNumerator(), this.getNewDenominator());
        return resultFraction;
    }
    
    @Override
    public int gcd(int a, int b) {
        if(b == 0){
            return a;
        }
        
        return gcd(b, a % b);
    }

    @Override
    public void reduceFraction(int x, int y) {
        int d = gcd(x, y);
        
        this.newNumerator = x / d;
        this.newDenominator = y / d;
    }

    @Override
    public String toString(){
        if(this.denominator == 1){
            
            return this.numerator + "";
            
        }else{
            
            return this.numerator + "/" + this.denominator;
            
        }
        
    }

}
