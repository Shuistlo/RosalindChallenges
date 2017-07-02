import java.math.BigInteger;

/*
 * Problem
 *A sequence is an ordered collection of objects (usually numbers), which are allowed to repeat. Sequences can be finite or infinite. Two examples are the finite sequence (UTC) and the infinite sequence of odd numbers (1,3,5,7,9,…)(1,3,5,7,9,…). We use the notation anan to represent the nn-th term of a sequence.
 *A recurrence relation is a way of defining the terms of a sequence with respect to the values of previous terms. In the case of Fibonacci's rabbits from the introduction, any given month will contain the rabbits that were alive the previous month, plus any new offspring. A key observation is that the number of offspring in any month is equal to the number of rabbits that were alive two months prior. As a result, if FnFn represents the number of rabbit pairs alive after the nn-th month, then we obtain the Fibonacci sequence having terms FnFn that are defined by the recurrence relation (UTC) (with F1=F2=1F1=F2=1 to initiate the sequence). Although the sequence bears Fibonacci's name, it was known to Indian mathematicians over two millennia ago.
 *When finding the nn-th term of a sequence defined by a recurrence relation, we can simply use the recurrence relation to generate terms for progressively larger values of nn. This problem introduces us to the computational technique of dynamic programming, which successively builds up solutions by using the answers to smaller cases.
 */
public class Rabbits_and_Recurrence_Relations {

	//gets rabbits
	public static BigInteger getRabbits(int n, int k) {
		BigInteger initPairs = new BigInteger(n +"");
		BigInteger months = new BigInteger(k + "");
		
		BigInteger now = new BigInteger("1");
		BigInteger lastMonth = new BigInteger("1");
		BigInteger i = new BigInteger("2");
		BigInteger temp = new BigInteger("0");
		BigInteger constant = new BigInteger("1");
		
		while(i.intValueExact() < initPairs.intValueExact()){
			temp = now;
			now = now.add(lastMonth.multiply(months));
			lastMonth = temp;
			i.add(constant);
		}
		
		return now;
	}
	
	public static void main(String[] args) {
		System.out.println(getRabbits(5,3));
		System.out.println(getRabbits(36,3));
		
		TextConverter nTC = new TextConverter("C://Users//aredp//Downloads//rosalind_fib.txt"); //requires file name still
		String data = nTC.getFile();
		data = data.replace("\n", "").replace("\r", "");
		String[] dataString = data.split(" ");
		System.out.println(getRabbits(Integer.parseInt(dataString[0]), Integer.parseInt(dataString[1])));
	}

}
