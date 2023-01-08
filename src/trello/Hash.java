package trello;

import java.util.HashMap;
import java.util.Map;

public class Hash {

	public static void main(String[] args) {

		String[] names = { "adnan", "oman", "adnan", "muscat", "muscat", "fatima", "fatima" };

		Map<String, Integer> nameCounts = new HashMap<>();

		for (String name : names) {

			if (!nameCounts.containsKey(name)) {

				nameCounts.put(name, 1);

			}

			else {

				nameCounts.put(name, nameCounts.get(name) + 1);
			}
		}

		for (Map.Entry<String, Integer> entry : nameCounts.entrySet()) {

			System.out.println(entry.getKey() + ": " + entry.getValue());

		}

	}

}