import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 *Problem
 *Given two strings ss and tt, tt is a substring of ss if tt is contained as a contiguous collection of symbols in ss (as a result, tt must be no longer than ss).
 *The position of a symbol in a string is the total number of symbols found to its left, including itself (e.g., the positions of all occurrences of 'U' in "AUGCUUCAGAAAGGUCUUACG" are 2, 5, 6, 15, 17, and 18). The symbol at position ii of ss is denoted by s[i]s[i].
 *A substring of ss can be represented as s[j:k]s[j:k], where jj and kk represent the starting and ending positions of the substring in ss; for example, if ss = "AUGCUUCAGAAAGGUCUUACG", then s[2:5]s[2:5] = "UGCU".
 *The location of a substring s[j:k]s[j:k] is its beginning position jj; note that tt will have multiple locations in ss if it occurs more than once as a substring of ss
 */
public class Finding_a_Motif_in_DNA {
	
	//need the first substring +1
	public static String getMatch(String message, String regex){
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(message);
		String index = "";
		if(m.find()){
			index = (m.start()+1)+ "";
		}
		return index;
	}
	
	//adds blank characters
	public static String addCharacters(int characters, String nString){
		for(int i = 0; i < characters; i++){
			nString = " "+ nString;
		}
		return nString;
	}

	//finds a motif
	public static String findMotif(String dna, String regex){
		String isolation = "";
		String currentMatch = getMatch(dna, regex);
		
		while(currentMatch != ""){
			isolation = isolation + currentMatch + " ";
			dna = dna.substring(Integer.parseInt(currentMatch));
			dna = addCharacters(Integer.parseInt(currentMatch), dna);
			currentMatch = getMatch(dna, regex);
		}
		//1. find match
		//2. truncate string
		//3. add characters
		//repeat
		return isolation;
	}
	
	
	public static void main(String[] args) {
		TextConverter nTC = new TextConverter("C://Users//aredp//Downloads//rosalind_subs.txt"); //requires file name still
		String[] motTextByData = nTC.getFile().split("\n");
		System.out.println(findMotif(motTextByData[0], motTextByData[1]));
	}
}