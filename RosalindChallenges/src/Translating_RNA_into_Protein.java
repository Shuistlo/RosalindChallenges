/*
 *Problem
 *The 20 commonly occurring amino acids are abbreviated by using 20 letters from the English alphabet (all letters except for B, J, O, U, X, and Z). Protein strings are constructed from these 20 symbols. Henceforth, the term genetic string will incorporate protein strings along with DNA strings and RNA strings.
 *The RNA codon table dictates the details regarding the encoding of specific codons into the amino acid alphabet.
 */
 
public class Translating_RNA_into_Protein {

	//matches u
	public static String findUMatch(String maybeU){
		String match = "";
		if(maybeU.matches("UU[U|C]")){
			match = "F";
		}
		if(maybeU.matches("UU[A|G]")){
			match = "L";
		}
		if(maybeU.matches("(UC[U|C|A|G])|(AG[U|C])")){
			match = "S";
		}
		if(maybeU.matches("UA[U|C]")){
			match = "Y";
		}
		if(maybeU.matches("UA[A|G]|UGA")){
			match = "stop";
		}
		if(maybeU.matches("UG[U|C]")){
			match = "C";
		}
		if(maybeU.matches("UGG")){
			match = "W";
		}
		return match;
	}

	//matches c
	public static String findCMatch(String maybeC){
		String match = "";
		if(maybeC.matches("CC[U|C|A|G]")){
			match = "P";
		}
		if(maybeC.matches("CA[U|C]")){
			match = "H";
		}
		if(maybeC.matches("CG[C|G|U|A]|AG[A|G]")){
			match = "R";
		}
		if(maybeC.matches("CA[A|G]")){
			match = "Q"; //CA[A|G]
		}
		if(maybeC.matches("CU[U|C|A|G]")){
			match = "L";
		}
		return match;
	}
	
	//matches a
	public static String findAMatch(String maybeA){
		String match = "";
		if(maybeA.matches("AU[U|C|A]")){
			match = "I";
		}
		if(maybeA.matches("AC[A|U|C|G]")){
			match = "T";
		}
		if(maybeA.matches("AA[U|C]")){
			match = "N";
		}
		if(maybeA.matches("AA[A|G]")){
			match = "K";
		}
		if(maybeA.matches("(UC[U|C|A|G])|(AG[U|C])")){
			match = "S";
		}
		if(maybeA.matches("CG[C|G|U|A]|AG[A|G]")){
			match = "R";
		}
		if(maybeA.matches("AUG")){
			match = "M";
		}
		return match;
	}
	
	//matches g
	public static String findGMatch(String maybeG){
		String match = "";
		if(maybeG.matches("GU[U|A|C|G]")){
			match = "V";
		}
		if(maybeG.matches("GC[U|A|C|G]")){
			match = "A";
		}
		if(maybeG.matches("GA[U|C]")){
			match = "D";
		}
		if(maybeG.matches("GA[A|G]")){
			match = "E";
		}
		if(maybeG.matches("GG[A|G|C|U]")){
			match = "G";
		}
		return match;
	}
	
	//finds match
	public static String findMatch(String rna){
		String match = "";
		switch(rna.charAt(0)){
			case 'A': match = findAMatch(rna);
					break;
			case 'C': match = findCMatch(rna);
					break;
			case 'G': match = findGMatch(rna);
					break;
			case 'U': match = findUMatch(rna);
					break;
		}
		return match;
	}
	
	public static void main(String[] args) {
		TextConverter nTC = new TextConverter("C://Users//aredp//Downloads//rosalind_prot.txt"); //requires file name still
		String rna = nTC.getFile().replace("\n", "").replace("\r", "");
		String shortHand = "";
		System.out.println(findUMatch("UUC"));
		int i = 0;
		while(((i+3) < rna.length()) || ((i+3) == rna.length())){
			shortHand = shortHand + findMatch(rna.substring(i, i+3));
			i +=3;
		}
		System.out.println(shortHand);
	}
}

