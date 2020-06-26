
package fraction;


public class Fraction implements FractionInterface {

    private int numerator ;
    private int denominator;
    
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

    @Override
    public void addition(int numerator2, int denominato2) {
        numerator = (getNumerator() * denominato2) + (getDenominator() * numerator2);
        denominator = getDenominator() * denominato2;
        reduceFraction(numerator, denominator);
    }

    @Override
    public void subtraction(int numerator2, int denominato2) {
        numerator = (getNumerator() * denominato2) - (getDenominator() * numerator2);
        denominator = getDenominator() * denominato2;
        reduceFraction(numerator, denominator);
    }

    @Override
    public void multiplication(int numerator2, int denominato2) {
        numerator = getNumerator() * numerator2;
        denominator = getDenominator() * denominato2;
        reduceFraction(numerator, denominator);
    }

    @Override
    public void division(int numerator2, int denominato2) {
        numerator = getNumerator() * denominato2;
        denominator = getDenominator() * numerator2;
        reduceFraction(numerator, denominator);
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
        
        this.numerator = x / d;
        this.denominator = y / d;
    }

    @Override
    public String toString(){
        if(denominator == 1){
            
            return numerator + "";
            
        }else{
            
            return numerator + "/" + denominator;
            
        }
        
    }

}
