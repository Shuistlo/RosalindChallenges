/*
 * Problem:
 * Given: Three positive integers kk, mm, and nn, representing a population containing k+m+nk+m+n organisms: kk individuals are homozygous dominant for a factor, mm are heterozygous, and nn are homozygous recessive.
 * Return: The probability that two randomly selected mating organisms will produce an individual possessing a dominant allele (and thus displaying the dominant phenotype). Assume that any two organisms can mate.
 */
public class Mendels_First_Law {
	
	 //RR RD homR*hetero*2
	 //RR RR homR*(homR-1)*4
	 //RD RR homR*hetero*2
	 //RD RD hetero*(hetero-1)
	public static double findPrb(int homD, int hetero, int homR){
		 double prb = 0.0;
		 double total = homD+hetero+homR;
		 total = total*(total -1)*4; //total number of possible offspring	 
		 
		 double recessiveOnly = hetero*(hetero -1);
		 recessiveOnly = recessiveOnly + homR*hetero*2;
		 recessiveOnly = recessiveOnly + homR*(homR-1)*4;
		 recessiveOnly = recessiveOnly + homR*hetero*2;
		 
		 double tops = total - recessiveOnly;
		 prb = tops/total;
		 
		 return prb;
	}

	public static void main(String[] args) {
		TextConverter nTC = new TextConverter("C://Users//aredp//Downloads//rosalind_iprb.txt"); //requires file name still
		String[] gcTextByData = nTC.getFile().split(" ");
		for(int i = 0; i < gcTextByData.length; i++){
			gcTextByData[i]=gcTextByData[i].replace("\n", "").replace("\r", "");
		}
		System.out.println(findPrb(Integer.parseInt(gcTextByData[0]), Integer.parseInt(gcTextByData[1]), Integer.parseInt(gcTextByData[2])));
	}

}
