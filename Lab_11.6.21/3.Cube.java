import java.util.Scanner;

class Square{

    int num;

    int square(){
        return (num*num);
    }
}

class Cube extends Square{

    static Scanner scObj = new Scanner(System.in);

    public static void main(String[] args) {

        Square sqaObj = new Square();

        System.out.print("Enter a number: ");
        sqaObj.num = scObj.nextInt();

        System.out.println("The square of " + sqaObj.num + " is " + sqaObj.square() + '\n' +
                           "and its cube is " + (sqaObj.num * sqaObj.square()));

    }
}
