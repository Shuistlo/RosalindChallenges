/*
 *Problem
 *The GC-content of a DNA string is given by the percentage of symbols in the string that are 'C' or 'G'. For example, the GC-content of "AGCTATAG" is 37.5%. Note that the reverse complement of any DNA string has the same GC-content.
 *DNA strings must be labeled when they are consolidated into a database. A commonly used method of string labeling is called FASTA format. In this format, the string is introduced by a line that begins with '>', followed by some labeling information. Subsequent lines contain the string itself; the first line to begin with '>' indicates the label of the next string.
 *In Rosalind's implementation, a string in FASTA format will be labeled by the ID "Rosalind_xxxx", where "xxxx" denotes a four-digit code between 0000 and 9999.
 */
public class Computing_GC_Content {
	
	/*
	 * finds gcpercent
	 */
	public static double findGCContent(String gcText){
		String dnaOnly = gcText.substring(13);
		double dnaOnlyLength = dnaOnly.length() + 0.000000000;
		
		int gcCount = 0;
		//Rosalind_XXXX 13 characters
		for(int i = 0; i < dnaOnly.length(); i++){
			if((dnaOnly.charAt(i)=='G') || (dnaOnly.charAt(i)=='C')){
				gcCount++;
			}
		}
		return (gcCount/dnaOnlyLength)*100.000000;
	}

	/*
	 * finds it in an array
	 */
	public static String findGCContentTotal(String[] gcText){
		int i = 1;
		int greatestIndex = 1;
		int nextIndex = i+1;
		
		while(nextIndex < gcText.length){
			double current = findGCContent(gcText[greatestIndex]);
			double nextComparison = findGCContent(gcText[nextIndex]);
			if(current < nextComparison){
				greatestIndex = nextIndex;
			}
			nextIndex = nextIndex +1;
		}
		String highest = gcText[greatestIndex].substring(0, 13) + "\n" +findGCContent(gcText[greatestIndex]);
		return highest;
		
	}
	
	public static void main(String[] args) {
		
		TextConverter nTC = new TextConverter("C://Users//aredp//Downloads//rosalind_gc.txt"); //requires file name still
		String[] gcTextByData = nTC.getFile().split(">");
		for(int i = 0; i < gcTextByData.length; i++){
			gcTextByData[i]=gcTextByData[i].replace("\n", "").replace("\r", "");
		}
		System.out.println(findGCContentTotal(gcTextByData));
	}
}
