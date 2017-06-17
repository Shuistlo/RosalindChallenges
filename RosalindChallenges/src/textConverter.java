import java.io.*;

/*
 * takes a text file and reads it into a string
 */


public class textConverter{
	private String filePath;
	private String stringFile;
	
	public textConverter(String nFilePath){
		this.filePath = nFilePath;
		this.stringFile = "";
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                //System.out.println(line); // prints file line by line
                stringFile = stringFile + line + "\n";
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public String getFile(){
		return this.stringFile;
	}
}

