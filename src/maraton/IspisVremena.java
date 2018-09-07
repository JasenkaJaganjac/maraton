package maraton;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class IspisVremena {

	public static void main(String[] args) throws IOException {
		System.out.print("unesi ime ucesnika: ");
		Scanner input = new Scanner(System.in);
		String imeUnos = input.next();
		File file = new File("maraton.txt");
		int n = 25; //broj ucesnika
		String[] ime = new String[n];
		int[] vrijeme = new int[n];
		Scanner fs = new Scanner(file);
		//pohrana imena i vremena u nizove
		int i = 0;
		while (fs.hasNext()) {
			ime[i] = fs.next();
			vrijeme[i] = fs.nextInt();
			i++;
		}
		
		
		for (int j = 0; j < n; j++) {
			if (imeUnos.equals(ime[j])) {
				System.out.println(imeUnos + " je bilo potrebno " + vrijeme[j] + " min da zavrsi maraton.");
				break;
			}
		}
		System.out.println("A prosjecno vrijeme koje je bilo potrebno ucesnicima da zavrse maraton iznosi: "
				+ prosjek(vrijeme) + " min.");
		fs.close();
		input.close();
	}
	
	
// prosjecno vrijeme (Zadatak 4)
	public static double prosjek(int[] niz) {
		int suma = 0;
		for (int i = 0; i < niz.length; i++) {
			suma += niz[i];
		}
		return (double) suma / niz.length;
	}
}
