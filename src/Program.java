import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		File file = new File("c:\\temp\\CARDAPIO FLASH BURG.txt");
		Scanner sc = null;
		
		try {
		sc = new Scanner(file);
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		// outro metodo para ler arquivos.
		
		try (BufferedReader sr = new BufferedReader(new FileReader(file))) {
			while (sr.readLine() != null) {
				sr.readLine();
				System.out.println(sr);
				}
			}
			catch (IOException e) {
				e.getStackTrace();
			}
	}

}
