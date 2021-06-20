package ArithPack;

// compile the package first

import java.util.Scanner;

class Arithmetic{

    double AddTwo(double a, double b){
        return (a + b);
    }

    double SubTwo(double a, double b){
        return (a - b);
    }

    double MulTwo(double a, double b){
        return (a * b);
    }

    double DivTwo(double a, double b){
        return (a / b);
    }

    double ModTwo(double a, double b){
        return (a % b);
    }

    public static void main(String[] args) {

        Scanner scObj = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        double a = scObj.nextDouble();
        double b = scObj.nextDouble();

        Arithmetic clObj = new Arithmetic();

        System.out.println();
        System.out.println("The addition of " + a + " and " + b + " is       " + clObj.AddTwo(a, b));
        System.out.println("The subtraction of " + a + " and " + b + " is    " + clObj.SubTwo(a, b));
        System.out.println("The multiplication of " + a + " and " + b + " is " + clObj.MulTwo(a, b));
        System.out.println("The division of " + a + " by " + b + " is        " + clObj.DivTwo(a, b));
        System.out.println("The modulo of " + a + " to " + b + " is          " + clObj.ModTwo(a, b));

    }

}
