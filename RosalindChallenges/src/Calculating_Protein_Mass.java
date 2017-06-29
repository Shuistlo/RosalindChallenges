import java.util.HashMap;

/* 
 * Problem
 * In a weighted alphabet, every symbol is assigned a positive real number called a weight. A string formed from a weighted alphabet is called a weighted string, and its weight is equal to the sum of the weights of its symbols.
 * The standard weight assigned to each member of the 20-symbol amino acid alphabet is the monoisotopic mass of the corresponding amino acid.
 */
public class Calculating_Protein_Mass {
	
	public static void main(String[] args) {
		HashMap<String, Double> protMass = new HashMap<String, Double>();
		protMass.put("A",71.03711);
		protMass.put("C", 103.00919);
		protMass.put("D", 115.02694);
		protMass.put("E", 129.04259);
		protMass.put("F", 147.06841);
		protMass.put("G", 57.02146);
		protMass.put("H", 137.05891);
		protMass.put("I", 113.08406);
		protMass.put("K", 128.09496);
		protMass.put("L", 113.08406);
		protMass.put("M", 131.04049);
		protMass.put("N", 114.04293);
		protMass.put("P", 97.05276);
		protMass.put("Q", 128.05858);
		protMass.put("R", 156.10111);
		protMass.put("S", 87.03203);
		protMass.put("T", 101.04768);
		protMass.put("V", 99.06841);
		protMass.put("W", 186.07931);
		protMass.put("Y", 163.06333);
		
		TextConverter nTC = new TextConverter("C://Users//aredp//Downloads//rosalind_prtm.txt"); //requires file name still
		String data = nTC.getFile();
		data = data.replace("\n", "").replace("\r", "");
		double totalMass = 0.0;
		int i = 0;
		while(i< data.length()){
			String inQuestion = data.substring(i, i+1);
			totalMass = totalMass + protMass.get(inQuestion);
			i++;
		}
		System.out.println(totalMass);
	}

}
