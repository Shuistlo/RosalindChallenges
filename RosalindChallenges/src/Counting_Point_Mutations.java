/*
 * Problem
 *Figure 2. The Hamming distance between these two strings is 7. Mismatched symbols are colored red.
 *Given two strings ss and tt of equal length, the Hamming distance between ss and tt, denoted dH(s,t)dH(s,t), is the number of corresponding symbols that differ in ss and  t
 */
public class Counting_Point_Mutations {

	/*
	 * finds mutations
	 */
	public static int findMutations(String strand1, String strand2) {
		int mutations = 0;
		for(int i =0; i < strand1.length(); i++){
			if(!strand1.substring(i, i+1).equals(strand2.substring(i,i+1))){
				mutations++;
			}
		}
		return mutations;
	}
	
	public static void main(String[] args) {
		
		textConverter nTC = new textConverter("C://Users//aredp//Downloads//rosalind_hamm.txt"); //requires file name still
		String[] mutations = nTC.getFile().split("\n");
		
		System.out.println(findMutations(mutations[0], mutations[1]));
	}
}
