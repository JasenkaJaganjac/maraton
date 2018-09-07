/*Napisati program koji prolazi kroz fajl maraton.txt, a zatim ispisuje imena ucesnika i 
 * njihova vremena sortirane prema vremenu koje su ostvarili od najmanjeg prema najvecem.*/
package maraton;

import java.io.File;
import java.util.Scanner;
import java.util.Arrays;
import java.io.IOException;

public class RangLista {

	public static void main(String[] args) throws IOException {
		File file = new File("maraton.txt");
		
		int n = 25;
		
		String[] ime = new String[n];
		int[] vrijeme = new int[n];
		Scanner fs = new Scanner(file);

		int i = 0;
		while (fs.hasNext()) {
			ime[i] = fs.next();
			vrijeme[i] = fs.nextInt();
			i++;
		}
		int rb = 1;
		int[] neSortirani = Arrays.copyOf(vrijeme, n);
		Arrays.sort(vrijeme);
		vrijeme = ukloniDuplikate(vrijeme);
		for (int k = 0; k < vrijeme.length; k++) {
			for (int j = 0; j < neSortirani.length; j++) {
				if (vrijeme[k] == neSortirani[j]) {
					System.out.println(rb + ". " + ime[j] + " " + neSortirani[j]);
					rb++;
				}
			}
		}
		System.out.println();
		fs.close();

	}

	public static int[] ukloniDuplikate(int[] niz) {
		int[] temp = new int[niz.length];
		for (int i = 0; i < niz.length - 1; i++) {
			if (niz[i] != niz[i + 1]) {
				temp[i] = niz[i];
			}
		}
		temp[niz.length - 1] = niz[niz.length - 1];
		return temp;
	}

}
