import java.util.Scanner;

class PrintName{

    static Scanner scObj = new Scanner(System.in);

    static void Ntimes(String name, int num){

        for(int i = 0; i < num; i++)
            System.out.println(name);
    }

    public static void main(String[] args) {

        System.out.print("Enter you name: ");
        String name = scObj.nextLine();

        System.out.print("Enter the number of times you want to print: ");
        int num = scObj.nextInt();

        Ntimes(name, num);
    }
}
