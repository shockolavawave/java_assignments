public class Percent {
    public static void main(String[] args) {

        int sub1 = 50;
        int sub2 = 40;
        int sub3 = 40;
        int sub4 = 60;
        int sub5 = 30;
        int max = 300;

        float percent = ((float)(sub1 + sub2 + sub3 + sub4 + sub5)/max)*100;

        System.out.println("The percentage of the five subjects is " + percent + "%");
        
        if(percent > 50){
			System.out.println("The student has passed.");
		}else{
			System.out.println("The student has failed.");
		}
	}
}
