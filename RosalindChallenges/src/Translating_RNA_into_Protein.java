/*
 *Problem
 *The 20 commonly occurring amino acids are abbreviated by using 20 letters from the English alphabet (all letters except for B, J, O, U, X, and Z). Protein strings are constructed from these 20 symbols. Henceforth, the term genetic string will incorporate protein strings along with DNA strings and RNA strings.
 *The RNA codon table dictates the details regarding the encoding of specific codons into the amino acid alphabet.
 */
 
public class Translating_RNA_into_Protein {

	//works
	public static boolean validateF(String maybeF){
		return maybeF.matches("UU[U|C]");
	}
	//works
	//warning contains C
	public static boolean validateL(String maybeL){
		return maybeL.matches("(CU[U|C|A|G])|(UU[A|G])");
	}
	//works
	//warning contains A
	public static boolean validateS(String maybeS){
		return maybeS.matches("(UC[U|C|A|G])|(AG[U|C])");
	}
	//works
	public static boolean validateY(String maybeY){
		return maybeY.matches("UA[U|C]");
	}
	
	public static boolean validateStop(String maybeStop){
		return maybeStop.matches("UA[A|G]|UGA");
	}
	
	public static boolean validateC(String maybeC){
		return maybeC.matches("UG[U|C]");
	}
	
	
	//W  - UGG and M - AUG special cases (only 1 combination)
	
	//===============================================AND SO THE C START BEGINS================================
	
	public static boolean validateP(String maybeP){
		return maybeP.matches("CC[U|C|A|G]");
	}
	
	public static boolean validateH(String maybeH){
		return maybeH.matches("CA[U|C]");
	}
	
	public static boolean validateQ(String maybeQ){
		return maybeQ.matches("CA[A|G]");
	}

	//warning contains A
	public static boolean validateR(String maybeR){
		return maybeR.matches("CG[C|G|U|A]|AG[A|G]");
	}
	
	public static boolean validateI(String maybeI){
		return maybeI.matches("AU[U|C|A]");
	}
	
	public static boolean validateT(String maybeT){
		return maybeT.matches("AC[A|U|C|G]");
	}
	
	public static void main(String[] args) {
		System.out.println(validateF("UUA"));
		System.out.println(validateS("AGA"));
	}
}
