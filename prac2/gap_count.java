public class gap_count
{
    public static void main(String[] args)
    {
        String seq = "ACGT-ac-tac--gta-tg-gcta";

        int len = seq.length();

        // counting gaps
        int i, count = 0;
        for(i=0;i<len;i++)
            if(seq.charAt(i)=='-')
                count++;

        System.out.println("\nThe sequence is:     " + seq.toUpperCase());

        System.out.println("\nThe number of gaps '-' is: " + count + '\n');
    }
}
