/*
 * Problem
 *In DNA strings, symbols 'A' and 'T' are complements of each other, as are 'C' and 'G'.
 *The reverse complement of a DNA string ss is the string scsc formed by reversing the symbols of ss, then taking the complement of each symbol (e.g., the reverse complement of "GTCA" is "TGAC").
 *Given: A DNA string ss of length at most 1000 bp.
 *Return: The reverse complement scsc of ss.
 */
public class Complementing_a_Strand_of_DNA {

	/*
	 * gets complement
	 */
	public static String getComplement(String nucleoData){
		String complement = "";
		for(int i = nucleoData.length()-1; i > -1 ; i--){
			switch (nucleoData.substring(i,i+1)){
				case "A": complement = complement + "T";
						break;
				case "C": complement = complement + "G";
						break;
				case "G": complement = complement + "C";
						break;
				case "T": complement = complement + "A";
						break;
			}
		}
		return complement;
	}
	
	public static void main(String[] args) {
		TextConverter nTC = new TextConverter("C://Users//aredp//Downloads//rosalind_revc.txt"); //requires file name still
		System.out.println(getComplement(nTC.getFile()));
	}
}
