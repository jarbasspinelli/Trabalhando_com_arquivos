import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program_one {

	public static void main(String[] args) {
		
		String pdf = "c:\\temp\\criandodoc.doc";
		
		try ( BufferedWriter br = new BufferedWriter(new FileWriter(pdf)) ) {
			
			br.write("<oi, tudo bem!!!!/>");
			br.write("<c:\\temp\\jarbas.jpg/>");
		}
		catch (IOException e) {
			e.getStackTrace();
		}

	}

}
