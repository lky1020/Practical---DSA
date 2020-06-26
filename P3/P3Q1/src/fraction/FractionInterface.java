
package fraction;

public interface FractionInterface{
    //Numerator
    public int getNumerator();
    public void setNumerator(int numerator);
    
    //Denominator
    public int getDenominator();
    public void setDenominator(int denominator);
    
    //Arithmetic Operations
    public void addition(int numerator2, int denominato2);
    public void subtraction(int numerator2, int denominato2);
    public void multiplication(int numerator2, int denominato2);
    public void division(int numerator2, int denominato2);
    
    //Simplest form
    public int gcd(int a, int b);
    public void reduceFraction(int x, int y);

}
