public class Main {
    public static void main(String[] args) {
        
        Rational num1=new Rational(5,6); 
        Rational num2=new Rational(7,9); 

        System.out.println(num1.Addition(num2));
        System.out.println(num1.Subtraction(num2));
        System.out.println(num1.LCM(num2));
    }
}
