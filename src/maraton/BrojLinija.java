package maraton;

import java.net.URL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BrojLinija {

	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.textfiles.com/science/astronau.txt");

		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		int brojLinija = 0;
		while (br.readLine() != null) {
			brojLinija++;
		}
		System.out.println("broj linija u dokumentu je: " + brojLinija);

	}

}
