import java.util.Scanner;

class ArmstrongCheck_2{

    static Scanner scObj = new Scanner(System.in);

    static void ArmstCheck(int num){

        int[] dec = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        int buff = num;

        short i;
        for(i = 0; buff != 0 ; i++){
            dec[i] = buff%10;
            buff /= 10;
        }

        int answer = 0;
        for (int j : dec){
            answer += power(j, i);
        }

        if(num == answer)
            System.out.println("The number " + num + " satisfies the Armstrong rule");
        else
            System.out.println("The number " + num + " does not satisfies the Armstrong rule");

    }

    static int power(int b, int p){

        int cube = 1;
        for(short i = 0; i < p; i++)
            cube *= b;

        return cube;
    }

    public static void main(String[] args) {

		System.out.println("This program will check the numbers which follow the Armstrong rule.");
        System.out.print("Enter the limit: ");
        int num = scObj.nextInt();

        for(int i = 0; i <= num; i++)
			ArmstCheck(i);

    }
}
