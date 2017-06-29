/*
 * Problem
 * Given: Six nonnegative integers, each of which does not exceed 20,000. The integers correspond to the number of couples in a population possessing each genotype pairing for a given factor. In order, the six given integers represent the number of couples having the following genotypes:
 * 1. AA-AA
 * 2. AA-Aa
 * 3. AA-aa
 * 4. Aa-Aa
 * 5. Aa-aa
 * 6. aa-aa
 * Return: The expected number of offspring displaying the dominant phenotype in the next generation, under the assumption that every couple has exactly two offspring.
 */
public class Calculating_Expected_Offspring {
	public static double findExpected(int DD, int DH, int DR, int HH, int HR, int RR){
		double expectation = 0.0;
		expectation = DD*2;
		expectation = expectation + (DH*2);
		expectation = expectation + (DR*2);
		expectation = expectation + (HH*0.75*2);
		expectation = expectation + (HR*0.5*2);
		
		return expectation;
	}

	public static void main(String[] args) {
		TextConverter nTC = new TextConverter("C://Users//aredp//Downloads//rosalind_iev.txt"); //requires file name still
		String data = nTC.getFile();
		data = data.replace("\n", "").replace("\r", "");
		String[] dataString = data.split(" ");
		int[] dataInt = new int[dataString.length];
		for(int i = 0; i < dataString.length; i++){
			dataInt[i] = Integer.parseInt(dataString[i]);
		}
		System.out.println(findExpected(dataInt[0], dataInt[1], dataInt[2], dataInt[3], dataInt[4], dataInt[5]));
	}

}
