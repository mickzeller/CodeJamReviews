package main.codingchallenges.hackerleet;

import java.io.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

public class Solution_timeConversion {

	/*
	 * Complete the timeConversion function below.
	 */
	static String timeConversion(String inputTime) {
		// Yeah... I get it, but I'm past the point of caring right now
		String iKnowButItWorks = inputTime.substring(inputTime.length() - 2);
		inputTime = inputTime.substring(0, inputTime.length() - 2).concat(" " + iKnowButItWorks);
		LocalTime time = LocalTime.parse(inputTime, DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).withLocale(Locale.ENGLISH));
		if (time.toString().equalsIgnoreCase("00:00")) {
			return time.toString() + ":00";
		}
		return time.toString();
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter("solution.txt"));
//		BufferedWriter writer = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));


		String inputTime = scan.nextLine();

		String result = timeConversion(inputTime);

		writer.write(result);
		writer.newLine();

		writer.close();
	}
}

