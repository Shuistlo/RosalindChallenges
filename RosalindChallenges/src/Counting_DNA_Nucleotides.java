/*
 * Problem
 *A string is simply an ordered collection of symbols selected from some alphabet and formed into a word; the length of a string is the number of symbols that it contains.
 *An example of a length 21 DNA string (whose alphabet contains the symbols 'A', 'C', 'G', and 'T') is "ATGCTTCAGAAAGGTCTTACG."
 *Given: A DNA string ss of length at most 1000 nt.
 *Return: Four integers (separated by spaces) counting the respective number of times that the symbols 'A', 'C', 'G', and 'T' occur in ss.
 */
public class Counting_DNA_Nucleotides {
	
	/*
	 * counts characters
	 */
	public static String getCounts(String nucleoData){
		int aCount = 0;
		int cCount = 0;
		int gCount = 0;
		int tCount = 0;		
		
		for(int i = 0; i < nucleoData.length(); i++){
			switch (nucleoData.substring(i,i+1)){
				case "A": aCount++;
						break;
				case "C": cCount++;
						break;
				case "G": gCount++;
						break;
				case "T": tCount++;
						break;
			}
		}
		String counts = aCount + " " + cCount + " " + gCount + " " + tCount;
		return counts;
	}
	
	public static void main(String[] args) {
		textConverter nTC = new textConverter("C://Users//aredp//Downloads//rosalind_dna.txt"); //requires file name still
		System.out.println(getCounts(nTC.getFile()));
	}
}
