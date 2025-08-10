
public class Rational {

    private int numerator1, denominator1;

    public Rational() {
        this.numerator1 = 0;
        this.denominator1 = 1;
    }

    public Rational(int num, int den) {
        this.numerator1 = num;
        this.denominator1 = den;
    }

    public Rational(Rational other) {
        this.numerator1 = other.numerator1;
        this.denominator1 = other.denominator1;
    }

    public String Addition(Rational other) {
        if (this.denominator1 == 0 || other.denominator1 == 0) {
            System.out.println("Denominator cannot be zero. Please enter valid denominators.");
            return null;

        }
        int addNumerator = (this.numerator1 * other.denominator1) +(other.numerator1 * this.denominator1) ;
        int commonDenominator = this.denominator1 * other.denominator1;
        return "Addition is"+addNumerator + "/" + commonDenominator;
    }

    public String Subtraction(Rational other) {
        if (this.denominator1 == 0 || other.denominator1 == 0) {
            System.out.println("Denominator cannot be zero. Please enter valid denominators.");
            return null;

        }
        int subNumerator = (this.numerator1 * other.denominator1) -( other.numerator1 * this.denominator1);
        int commonDenominator = this.denominator1 * other.denominator1;
        return "Subraction is "+subNumerator + "/" + commonDenominator;
    }

    public String LCM(Rational other) {

        // formula for LCM of rational numberis lcm of numerator divide by gcd of denominators:
        int gcdDen = 1;
        for (int i = 1; i <= Math.min(this.denominator1, other.denominator1); i++) {
            if (this.denominator1 % i == 0 && other.denominator1 % i == 0) {
                gcdDen = i;
            }
        }

        int lcmNum = 1;
        for (int i = Math.max(this.numerator1, other.numerator1); i <= this.numerator1 * other.numerator1; i++) {
            if (i % this.numerator1 == 0 && i % other.numerator1 == 0) {
                lcmNum = i;
                break;
            }
        }
        // int lcmOfRational = lcmNum / gcdDen;
        return "LCM of " + this.numerator1 + "/" + this.denominator1 + " and " + other.numerator1 + "/" + other.denominator1 + " is " +lcmNum+"/"+gcdDen;

    }

    public int getNumerator1() {
        return numerator1;
    }

    public void setNumerator1(int numerator1) {
        this.numerator1 = numerator1;
    }

    public int getDenominator1() {
        return denominator1;
    }

    public void setDenominator1(int denominator1) {
        this.denominator1 = denominator1;
    }

    @Override
    public String toString() {
        return "NUMBER IS " + numerator1 + "/" + denominator1;
    }
}
