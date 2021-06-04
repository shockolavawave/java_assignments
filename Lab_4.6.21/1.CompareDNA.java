import java.util.Scanner;

class CompareDNA{

    static Scanner scObj = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter first sequence  : ");
        String seq1 = scObj.nextLine();

        System.out.print("Enter second sequence : ");
        String seq2 = scObj.nextLine();

        seq1 = seq1.toUpperCase();
        seq2 = seq2.toUpperCase();

        if(seq1.length() == seq2.length()){
            if(seq1.equals(seq2))
                System.out.println("The entered sequences are identical.");
            else
                System.out.println("The entered sequences are not the same.");
        }else
            System.out.println("The entered sequences are not of equal length\nHence they are not same.");
    }
}
