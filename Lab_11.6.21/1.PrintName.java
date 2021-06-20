import java.util.Scanner;

class PrintName{

    static Scanner scObj = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter you first name: ");
        String f_name = scObj.nextLine();

        System.out.print("Enter you last name: ");
        String l_name = scObj.nextLine();

        String full_name = f_name + " " + l_name;

        System.out.println("Your full name is " + full_name);

    }
}
