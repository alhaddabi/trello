package trello;

import java.util.ArrayList;

import java.util.Scanner;

public class HashMap {

	public static void main(String[] args) {

// TODO Auto-generated method stub

		String[] namerr = { "adnan", "adnan", "oman","muscat","Abdullah","muscat" };

		ArrayList<String> result = Count(namerr);

		for (String sArr : result) {

			System.out.println(sArr);

		}

	}

	public static ArrayList<String> Count(String[] names) {

		ArrayList<String> result = new ArrayList<>();

		for (String listName : names) {

			int count = 0;

			for (String n : names) {

				if (listName.equals(n)) {

					count++;

				}

			}

			result.add(listName + " is repeated " + count + " times");

		}

		return result;

	}

}