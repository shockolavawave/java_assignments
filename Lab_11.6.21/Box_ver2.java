import java.util.Scanner;

class Box{

    int w;
    int h;
    int d;

    int volume(){
        return (w*h*d);
    }
	
	Box(int w, int h, int d){
		this.w = w;
		this.h = h;
		this.d = d;
	}
}

class mainBox{
    public static void main(String[] args) {

        Scanner scObj = new Scanner(System.in);

        Box boxObj = new Box(10, 10, 10);

        System.out.println("The default values are:\n" +
                           "width  = " + boxObj.w + " units" + '\n' +
                           "height = " + boxObj.h + " units" + '\n' +
                           "width  = " + boxObj.d + " units" + '\n');

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