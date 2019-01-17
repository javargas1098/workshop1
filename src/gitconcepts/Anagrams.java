package gitconcepts;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagrams {
	static boolean isAnagram(String a, String b) {
        if (a.length() != b.length())
            return false;
        a.toLowerCase();
        b.toLowerCase();
        Map<Character, Integer> map = new HashMap<Character,Integer>();
        for (int i = 0; i < b.length(); i++) {
            char letra1 = b.charAt(i);

            if (!map.containsKey(letra1)) {
                map.put(letra1, 1);
            } else {
                Integer frecuencia = map.get(letra1);
                map.put(letra1, ++frecuencia);
            }
        }
        for (int i = 0; i < a.length(); i++) {
            char letra2 = a.charAt(i);

            if (!map.containsKey(letra2))
                return false;

            Integer frecuencia = map.get(letra2);
            if (frecuencia > 0) map.put(letra2,--frecuencia);
            else return false;
        }
        return true;
	}

	  public static void main(String[] args) {
	    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
	}


