public class ArrayMean {
    public static void main(String[] args) {
        double[] arr= {12.34, 23.34, 34.45, 45.56, 56.67, 67.78, 78.89, 8.9, 31.32, 43.53};
        double sum = 0, average;

        short i;
        for(i = 0;i<(arr.length);i++){
            sum += arr[i];
        }

        average = sum/arr.length;

        System.out.println("The average of the elements of the array is " + average);

    }
}
