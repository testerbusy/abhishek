package stringAssignemnts;

public class StringClass {

	public static void main(String[] args) {
		String s = "Marolix";
		String nam = "Sampath Marolix";
		String lap = " let me trim myself ";
		String w = new String(s);
		System.out.println(w.concat(" company "));
		System.out.println("Length of the String : "+w.length());
		//Index is always length-1(Starts from 0)
		System.out.println(w.substring(0, 3));
		String[] na = nam.split(" ");
		System.out.println(na[1]);
		System.out.println(s.equals(na[0]));
		System.out.println(nam.replace("Sampath", "Sampath from Cuddappa").toUpperCase());
		System.out.println(nam.toUpperCase());
		System.out.println(nam.toLowerCase());
		System.out.println(lap);
		System.out.println(lap.trim());
		System.out.println(lap.contains("trim"));
		System.out.println(s.isEmpty());
		if(s.isEmpty()==false) {
			System.out.println(s.concat(" technologies"));
		}
		else {
			
		}
		/*
		 * length
		 * format
		 * substring
		 * contains
		 * join
		 * equal
		 * isEmpty
		 * replace
		 * split
		 * indexOf
		 * toLowercase
		 * UpperCase
		 * trim
		 * valueOf
		 * compare
		 */
		
		/*
		 * String Builder and String Buffer--> mutable
		 */
		/*String Buffer methods
		 * append(s)
		 * insert()
		 * replace
		 * delete
		 * reverse
		 * chatAt
		 * length
		 * Substring
		 */
		/* String Builder methods
		 * append
		 * insert
		 * replace
		 * delete
		 * reverse
		 * charAt
		 * length
		 * subString
		 */
		/* Difference between String Builder and String Buffer
		 * String Buffer is threadSafe --> String Builder is not ThreadSafe
		 * String Buffer is less efficiency than StringBulder(StringBuilder is more efficient)
		 * StrinBuffer was introduced in java1.0
		 * StringBuilder is in java1.5
		 */
		
	}
}
