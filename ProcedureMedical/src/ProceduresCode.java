import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.net.URL;
import java.util.Scanner;
import javax.swing.*;
import java.applet.*;
import java.awt.*;

public class ProceduresCode  {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {

		System.out.println("Welcome to Procedure Medical. Please enter the number corresponding with your specialty:\n\nDermatology [ 1 ]\n");
		Scanner n = new Scanner(System.in);
		String input = n.nextLine();
		String procedureCodes = null;
		String procname = null;
		String proc = null;
//##############################################################################################################################################################								
		if(input.equals("1")) {
			//System.out.println("Enter the number corresponding to the type of Dermotology procedure\n\nBiopsy [ 1 ]\n\n");
			//proc = n.nextLine();	
			//if(input.equals("1")) {
				procedureCodes = "dermCodes.txt";
				
			//}
			
		}
//##############################################################################################################################################################								
		String end = "";
		while(!end.equals("n")) {
		System.out.println("enter the name of the procedure to the closest of your ability");
		procname = n.nextLine();
		int length = procname.length();
		File filetoread = new File(procedureCodes); //procedurecodes.txt must be located in the project
		Scanner inp = new Scanner(filetoread); //folder of the active project – refresh if needed
		String buffer = "";
		PrintWriter newwords = new PrintWriter("lowercase.text"); //lowercase.txt will be added
//##############################################################################################################################################################								
		
		while (inp.hasNext()) { //to the same classes folder
			buffer = inp.nextLine();
			for(int k = 0; k< buffer.length() - length+1; k++) {

				if ( buffer.substring(k, k+length).equals(procname)) {//if buffe4r = proc
					//you may need to refresh to see it
					System.out.println(buffer.toLowerCase()+ "\n");
					newwords.println(buffer.toLowerCase());}
			}
		}
		
		inp.close(); //it is critical to close these files
		newwords.close(); //when you are done with them
		System.out.println("\n\nwould you like to search again? (y/n)\n\n");
		end = n.nextLine();

		}
	}
}
 