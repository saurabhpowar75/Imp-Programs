package Program;

//WAP to Print the Count of Occurrence of a particular character in a String
public class CharacterOccurrenceString {

	public static void main(String[] args) {
		int count=CountOccurrence("shvzjvdcxvzzbn",'v');
		System.out.println("The Count of 'z' in the given String is "+count);
	}

	private static int CountOccurrence(String string, char c) {
		// TODO Auto-generated method stub
		int count=0;
		for (int i = 0; i < string.length(); i++) {
			if(string.charAt(i)==c)
			{
				count++;
			}
		}
		return count;
	}
}
