package codewars;

public class DnaStrand {
    public static String makeComplement(String dna) {

        StringBuilder newDna = new StringBuilder();

        for (int i = 0; i < dna.length(); i++) {

            if (dna.charAt(i) == 'T') {
                newDna.append('A');
            }

            if (dna.charAt(i) == 'A') {
                newDna.append('T');
            }

            if (dna.charAt(i) == 'C') {
                newDna.append('G');
            }

            if (dna.charAt(i) == 'G') {
                newDna.append('C');
            }
        }
        System.out.println(newDna);

        return newDna.toString();
    }
}
