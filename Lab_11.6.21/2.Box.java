import java.util.Scanner;

class Box{

    int w = 10;
    int h = 10;
    int d = 10;

    int volume(){
        return (w*h*d);
    }

    public static void main(String[] args) {

        Scanner scObj = new Scanner(System.in);

        Box boxObj = new Box();

        System.out.println("The default values are:\n" +
                           "width  = " + boxObj.w + " units" + '\n' +
                           "height = " + boxObj.h + " units" + '\n' +
                           "depth  = " + boxObj.d + " units" + '\n');

        System.out.println("The volume using default values is: " + boxObj.volume() + " cubic units" + '\n');

        System.out.println("Enter new values:");
        System.out.print("width  = ");
        boxObj.w = scObj.nextInt();
        System.out.print("height = ");
        boxObj.h = scObj.nextInt();
        System.out.print("depth  = ");
        boxObj.d = scObj.nextInt();

        System.out.println('\n' + "The volume of the box is " + boxObj.volume() + " cubic units");

    }
}
