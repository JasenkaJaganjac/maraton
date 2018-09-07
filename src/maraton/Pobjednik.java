/*Napisati program koji prolazi kroz fajl maraton.txt i ispisuje ime i vrijeme ucesnika 
 * koji je najbrze istrcao maraton.
*/
package maraton;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class Pobjednik {

	public static void main(String[] args) throws IOException {
		File file = new File("maraton.txt");
		Scanner fs = new Scanner(file);
		String pobjednik = fs.next();
		int minVrijeme = fs.nextInt();
		while (fs.hasNext()) {
			String ucesnik = fs.next();
			int vrijeme = fs.nextInt();
			if (vrijeme < minVrijeme) {
				minVrijeme = vrijeme;
				pobjednik = ucesnik;
			}
		}
		System.out.println("Pobjednik maratona je " + pobjednik + " sa vremenom od " + minVrijeme + " minuta.");
		fs.close();
	}

}
