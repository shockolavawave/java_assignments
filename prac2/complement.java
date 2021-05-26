public class complement
{
    public static void main(String[] args)
    {
        String seq1 = "ACGTCGATtacGatATgCTATCgTACgatACGtac";

        String seq2 = seq1.toUpperCase();
		
	seq2 = seq2.replace('A','x');
        seq2 = seq2.replace('T','A');
        seq2 = seq2.replace('x','T');
		
        seq2 = seq2.replace('G','x');
        seq2 = seq2.replace('C','G');
        seq2 = seq2.replace('x','C');

        System.out.print('\n');
        System.out.println("The original sequence is:   " + seq1.toUpperCase());
        System.out.println("The complement sequence is: " + seq2);	//touppercase not needed

    }
}
