package maraton;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.BufferedWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class NajboljiMaratonci {

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
		Path path = Paths.get("najboljiMaratonci.txt");
		BufferedWriter bw = Files.newBufferedWriter(path);
		bw.write("Najbolji ucesnici, sa vremenom manjim od 300 min su: ");
		bw.newLine();
		for (int j = 0; j < vrijeme.length; j++) {
			if (vrijeme[j] <= 300) {
				bw.write(ime[j] + ": " + vrijeme[j]);
				bw.newLine();
			}
			bw.flush();

		}
		System.out.println("Fajl kreiran.");

		fs.close();
	}

}
