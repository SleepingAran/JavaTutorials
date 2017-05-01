
public class CharacterAndStrings {
	static char letters[] = {'M','i','X','t','U','r','E'};
	public static void changeToLower()
	{
		//To lower
		char lowerLetters[] = letters ;
		int length = lowerLetters.length;
		for (int i = 0; i < length; i++)
		{
			lowerLetters[i] = Character.toLowerCase(lowerLetters[i]);
		}
		System.out.println("After to lower: " + new String(lowerLetters) + "\n");
	}
	
	public static void changeToUpper()
	{
		//To capital letter
		char upperLetters[] = letters ;
		int length = upperLetters.length;
		for (int i = 0; i < length; i++)
		{
			upperLetters[i] = Character.toUpperCase(upperLetters[i]);
		}
		System.out.println("After to upper: " + new String(upperLetters) + "\n");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = new String(letters);
		System.out.println("The original character is: " + result + "\n");
		changeToLower();
		changeToUpper();
		
	}

}
