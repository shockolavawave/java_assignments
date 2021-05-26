public class base_frequency
{
    public static void main(String[] args)
    {
        String seq = "AGTCAacgTAGtAGCcgTAgA";

        int len = seq.length();
        int a_count = 0;
        int g_count = 0;
        int t_count = 0;
        int c_count = 0;

        System.out.println("\nThe sequence is: ");


        System.out.print(seq.toUpperCase());

        int i;

        //counting bases
        for(i=0;i<(seq.length());i++)
        {
            if(seq.charAt(i)=='A'||seq.charAt(i)=='a')
                a_count++;

            if(seq.charAt(i)=='G'||seq.charAt(i)=='g')
                g_count++;

            if(seq.charAt(i)=='T'||seq.charAt(i)=='t')
                t_count++;

            if(seq.charAt(i)=='C'||seq.charAt(i)=='t')
                c_count++;

        }

        //percent of adenine bases
        float a_per = ((float)a_count/len)*100;

        //percent of guanine bases
        float g_per = ((float)g_count/len)*100;

        //percent of thymine bases
        float t_per = ((float)t_count/len)*100;

        //percent of cytosine bases
        float c_per = ((float)c_count/len)*100;

        System.out.print('\n');

        System.out.println("\nBASE           PERCENT");
        System.out.println("Adenine      " + a_per + "%");
        System.out.println("Guanine      " + g_per + "%");
        System.out.println("Thymine      " + t_per + "%");
        System.out.println("Cytosine     " + c_per + "%");

        //finding maximum frequency
		float max1 = Math.max(a_per,g_per);
        float max2 = Math.max(max1,t_per);
        float max_f = Math.max(max2,c_per);

        if(max_f==a_per)
            System.out.println("\nThe highest frequency is of A(adenine)");

        if(max_f==g_per)
            System.out.println("\nThe highest frequency is of G(guanine)");

        if(max_f==t_per)
            System.out.println("\nThe highest frequency is of T(thymine)");

        if(max_f==c_per)
            System.out.println("\nThe highest frequency is of C(cytosine)");

        //finding minimum frequency
		float min1 = Math.min(a_per,g_per);
        float min2 = Math.min(min1,t_per);
        float min_f = Math.min(min2,c_per);

        if(min_f==a_per)
            System.out.println("The lowest frequency is of A(adenine)");

        if(min_f==g_per)
            System.out.println("The lowest frequency is of G(guanine)");

        if(min_f==t_per)
            System.out.println("The lowest frequency is of T(thymine)");

        if(min_f==c_per)
            System.out.println("The lowest frequency is of C(cytosine)");
    }
}
