package maraton;

import java.io.IOException;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class SortiranaImena {

	public static void main(String[] args) throws IOException {
		File file = new File("imena.txt");
		int n = 25;
		String[] ime = new String[n];
		Scanner fs = new Scanner(file);
		int i = 0;
		while (fs.hasNext()) {
			ime[i] = fs.nextLine();
			i++;
		}
		Arrays.sort(ime);
		System.out.println("Imena sortirana po abecedi: ");
		for (int j = 0; j < ime.length; j++) {
			System.out.println(ime[j]);
		}
		fs.close();
	}

}
