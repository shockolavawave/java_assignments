import java.util.Scanner;

class ChangeCase{

    static Scanner scObj = new Scanner(System.in);

    static void toUpper(String text){
        System.out.println(text.toUpperCase());
    }

    static void toLower(String text){
        System.out.println(text.toLowerCase());
    }

    public static void main(String[] args) {

        System.out.print("Enter a string to change its case: ");
        String text = scObj.nextLine();

        System.out.print("Enter the case to which you want to convert to: ");
        String caSe = scObj.nextLine();

        switch(caSe){
            case "UPPER": case "upper": case "Upper": case "up": case "UP":
                toUpper(text);
            break;

            case "LOWER": case "lower": case "Lower": case "low": case "LOW":
                toLower(text);
            break;

            default:
                System.out.println("Invalid case.\nTry re-running.");
        }

    }
}
