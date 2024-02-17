import java.util.*;
class Operaciones{
    public double suma( double num1, double num2){
        return num1 + num2;
    }
    public double resta( double num1, double num2){
        return num1 - num2;
    }
    public double multiplicacion( double num1, double num2){
        return num1 * num2;
    }
    public double division( double num1, double num2){
        return num1 / num2;
    }
    public double modulo( double num1, double num2){
        return num1 % num2;
    }
}
public class Main
{
	public static void main(String[] args) {
	    Operaciones op = new Operaciones();
	    Scanner sc = new Scanner(System.in);
	    double x,y;
	    System.out.println("Escribe el primer número");
	    x = sc.nextDouble();
	    System.out.println("Escribe el segundo número");
	    y = sc.nextDouble();
	    System.out.println("Primer número: " + x);
	    System.out.println("Segundo número: " + y);
		System.out.println("Resutado de suma: "+ op.suma(x,y));
		System.out.println("Resutado de resta: "+ op.resta(x,y));
		System.out.println("Resutado de multiplicacion: "+ op.multiplicacion(x,y));
		System.out.println("Resutado de division: "+ op.division(x,y));
		System.out.println("Resutado de modulo: "+ op.modulo(x,y));
	}
}
