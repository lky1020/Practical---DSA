
package fraction;

public interface FractionInterface{
    /*
    int getNumerator()
    Description: Return current numerator value
    Precodition: numerator declare in int type
    Postcondition: The numerator value remain unchanged
    Return: int value of numerator
    */
    public int getNumerator();
    
    /*
    int setNumerator(int numerator)
    Description: Set numerator value with parameter value
    Precondition: Parameter is passed in int type
    Postcondition: The numerator value changed to the parameter value
    */
    public void setNumerator(int numerator);
    
    /*
    int getDenominator()
    Description: Return current denominator value
    Precodition: denominator declare in int type
    Postcondition: The denominator value remain unchanged
    Return: int value of denominator
    */
    public int getDenominator();
    
    /*
    int setNumerator(int numerator)
    Description: Set denominator value with parameter value
    Precondition: Parameter value is passed in int type 
    Postcondition: The denominator value changed to the parameter value
    */
    public void setDenominator(int denominator);
    
    /*
    int getNewNumerator()
    Description: Return current newNumerator value
    Precodition: newNumerator declare in int type
    Postcondition: The newNumerator value remain unchanged
    Return: int value of newNumerator
    */
    public int getNewNumerator();
    
    /*
    int setNewNumerator(int newNumerator)
    Description: Set newNumerator value with parameter value
    Precondition: Parameter value is passed in int type
    Postcondition: The newNumerator value changed to the parameter value
    */
    public void setNewNumerator(int newNumerator);
    
    /*
    int getNewDenominator()
    Description: Return current newDenominator value
    Precodition: newDenominator declare in int type 
    Postcondition: The newDenominator value remain unchanged
    Return: int value of newDenominator
    */
    public int getNewDenominator();
    
    /*
    int setNewDenominator(int newDenominator)
    Description: Set newDenominator value with parameter value
    Precondition: Parameter value is passed in int type 
    Postcondition: The newDenominator value changed to the parameter value
    */
    public void setNewDenominator(int newDenominator);
    
    /*
    FractionInterface getResultFraction()
    Description: Return current resultFraction Object
    Precodition: resultFraction declare in Fraction Object 
    Postcondition: The resultFraction value remain unchanged
    Return: Fraction Object  of resultFraction
    */
    public FractionInterface getResultFraction();
    
    /*
    setResultFraction(FractionInterface resultFraction)
    Description: Set resultFraction value with parameter value
    Precondition: Parameter value is passed in FractionInterface
    Postcondition: The resultFraction Object changed to the parameter value
    */
    public void setResultFraction(FractionInterface resultFraction);
    
    /*
    FractionInterface addition(FractionInterface fraction);
    Description: Add two fraction
    Precondition: Both fractions contain valid values 
    Postcondition: fraction remain unchanged
    Return: Result of the addition of two fraction
    */
    public FractionInterface addition(FractionInterface fraction);
    
    /*
    FractionInterface subtraction(FractionInterface fraction);
    Description: Subtract two fraction
    Precondition: Both fractions contain valid values (denominator != 0)
    Postcondition: fraction remain unchanged
    Return: Result of the subtraction of two fraction
    */
    public FractionInterface subtraction(FractionInterface fraction);
    
    /*
    FractionInterface multiplication(FractionInterface fraction);
    Description: Multiply two fraction
    Precondition: Both fractions contain valid values (denominator != 0)
    Postcondition: fraction remain unchanged
    Return: Result of the multiplication of two fraction
    */
    public FractionInterface multiplication(FractionInterface fraction);
    
    /*
    FractionInterface division(FractionInterface fraction);
    Description: Divide two fraction
    Precondition: Both fractions contain valid values (denominator != 0)
    Postcondition: fraction remain unchanged
    Return: Result of the division of two fraction
    */
    public FractionInterface division(FractionInterface fraction);
    
    /*
    gcd(int a, int b)
    Description: Get Greatest Common Divisor of the fraction
    Precondition: a and b must exist(>= 1)
    Postcondition: numerator and denominator value remain unchanged
    Return: Greatest Common Divisor value is return
    */
    public int gcd(int a, int b);
    
    /*
    reduceFraction(int x, int y)
    Description: Get Simplest Fraction form
    Precondition: x and y must exist(>= 1)
    Postcondition: numerator and denominator assign with new value (simplest form)
    */
    public void reduceFraction(int x, int y);

    
}
