package gitconcepts;

import java.io.*;
import java.util.*;

public class Read {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		int x = 1;
		while (sc.hasNextLine()) {

			System.out.println(x++ + " " + sc.nextLine());

		}
	}
}
