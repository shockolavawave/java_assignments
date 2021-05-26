public class repeat_count
{
    public static void main(String[] args)
    {
        String seq1 = "AGTCatCCgatAcgtCCat", seq2 = "CAT";
        seq1 = seq1.toUpperCase();

        System.out.println("\nseq1 : " + seq1);
        System.out.println("seq2 : " + seq2);

        if(seq1.contains(seq2))
        {
            seq1 = seq1.replace(seq2, "x");

            int count = 0;
            int i;
            for(i=0;i<seq1.length();i++)
                if(seq1.charAt(i)=='x')
                    count++;

            System.out.println("\nThere are " + count + " repeats of seq2 found in seq1.");
        }
        else
            System.out.println("There are no repeats of seq2 in seq1");
    }
}
