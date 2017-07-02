import java.util.ArrayList;

public class Enumerating_Gene_Orders {
	private static ArrayList<String> comboList = new ArrayList<String>();
	
	//number of possible permutations
	public static int calcPerm(int Perm){
		int i = Perm-1;
		while(i >0){
			Perm = Perm * (i);
			i--;
		}
		return Perm;
	}
	
	//makes first string
	public static String genPossib(int Perm){
		String inOrder = Perm + "";
		int i = Perm-1;
		while(i >0){
			inOrder = inOrder + i + "";
			i--;
		}
		return inOrder;
	}
	
	//creats perms
    public  static void perm1(String s) { 
    	perm1("", s); 
    }
    
    //creates perms
    private static void perm1(String prefix, String s) {
        int n = s.length();
        if (n == 0) comboList.add(prefix);
        else {
            for (int i = 0; i < n; i++)
               perm1(prefix + s.charAt(i), s.substring(0, i) + s.substring(i+1, n));
        }
    }
    
    //makes readable from perms
    public static String convertString(ArrayList<String> n){
    	String fullList = "";
    	for(String s: n){
    		String f = "";
    		for(int i = 0; i < s.length(); i++){
    			f = f + s.substring(i, i+1)+ " ";
    		}
    		fullList = fullList + f + "\n";
    	}
    	return fullList;
    }
	
	public static void main(String[] args) {
		TextConverter nTC = new TextConverter("C://Users//aredp//Downloads//rosalind_perm.txt"); //requires file name still
		String data = nTC.getFile();
		data = data.replace("\n", "").replace("\r", "");
		
		System.out.println(calcPerm(Integer.parseInt(data)));
		String first = genPossib(Integer.parseInt(data));
		perm1(first);
		System.out.println(convertString(comboList));
	}

}
