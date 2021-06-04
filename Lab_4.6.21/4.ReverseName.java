import java.util.Scanner;

class ReverseName{

    static Scanner scObj = new Scanner(System.in);

    static void NameRev(String name){

        for(int i = (name.length()-1) ; i >= 0; i--)
            System.out.print(name.charAt(i));
    }

    public static void main(String[] args) {

        System.out.print("Enter your name: ");
        String name = scObj.nextLine();

        NameRev(name);
    }
}
