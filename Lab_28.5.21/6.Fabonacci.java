public class Fabonacci {
    public static void main(String[] args) {

        int i;
        long prev = 0, next = 1, buff;
        for(i = 0; i<51 ; i++){
            System.out.println("The size of the side is " + prev + " units");
            buff = next + prev;
            next = prev;
            prev = buff;
        }
    }
}
