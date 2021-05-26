public class GC_percent
{
    public static void main(String[] args)
    {
        String seq = "AGTCACGCAtacgtAgcGTatgcAAaagaGtagc";

        int a_count = 0;
        int g_count = 0;
        int t_count = 0;
        int c_count = 0;

        System.out.print("\nThe sequence is: ");
        System.out.println(seq.toUpperCase());

        System.out.println("\n\nThe length of the sequence is " + seq.length() + '\n');
        
        int i = 0

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

        System.out.println("There are " + a_count + " adenine bases.");
        System.out.println("There are " + g_count + " guanine bases.");
        System.out.println("There are " + t_count + " thymine bases.");
        System.out.println("There are " + c_count + " cytosine bases.");

        float gc_per = ((float)(g_count+c_count)/seq.length())*100;

        System.out.println("\nThe GC percentage in the given sequence is " + gc_per + "%\n");

    }
}
