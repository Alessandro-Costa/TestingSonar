package reportID;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class main {
	public static void main(String[] args) throws IOException, InterruptedException {      
		String cmd = "git log";
		Runtime run = Runtime.getRuntime();
		Process pr = run.exec(cmd);
		pr.waitFor();
		BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
		String line = "";
		//String save1 = buf.readLine();
		//String save2 = buf.readLine();
		int count = 0;
		String Id = "";
		while ((line=buf.readLine())!=null) {
			if (count%5 == 0){
				Id = line;
			}
			if (count%5 == 4) {
				if (line.contains("added")){
					System.out.println(Id+"contains the word added");
				}
				
			}
		System.out.println(line);
		//String comment = line;
		}
		//System.out.println(save1);
		//System.out.println(save2);
		}
}
