import java.util.Arrays;

public class AminoacidSort {
    public static void main(String[] args) {

        String[] amino_acids = {"alanine", "cysteine", "aspartic acid", "glutamic acid", "phenylalanine",
                                "glycine", "histidine", "isoleucine", "lysine", "leucine",
                                "methionine", "asparagine", "glutamine", "arginine", "serine",
                                "threonine", "valine", "tryptophan", "tyrosine", "proline"};

        Arrays.sort(amino_acids);

        System.out.println("The amino acids in alphabetical order is: \n");

        int i;
        for(i = 0; i < amino_acids.length; i++){
            System.out.println(amino_acids[i]);
        }

    }
}
