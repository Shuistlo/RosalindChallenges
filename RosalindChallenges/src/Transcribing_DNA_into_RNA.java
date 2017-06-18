/*
 * Problem
 *An RNA string is a string formed from the alphabet containing 'A', 'C', 'G', and 'U'.
 *Given a DNA string tt corresponding to a coding strand, its transcribed RNA string uu is formed by replacing all occurrences of 'T' in tt with 'U' in uu.
 *Given: A DNA string tt having length at most 1000 nt.
 *Return: The transcribed RNA string of tt.
 */
public class Transcribing_DNA_into_RNA {
	/*
	 * gets RNA
	 */
	public static String getRNA(String nucleoData){
		String rNA = "";
		for(int i = 0; i < nucleoData.length(); i++){
			if(nucleoData.substring(i,i+1).equals("T")){
				rNA = rNA + "U";
			}
			else{
				rNA = rNA + nucleoData.substring(i,i+1);
			}
		}
		return rNA;
	}
	
	public static void main(String[] args) {
		TextConverter nTC = new TextConverter("C://Users//aredp//Downloads//rosalind_rna.txt"); //requires file name still
		System.out.println(getRNA(nTC.getFile()));
	}

}
