public class Challenge {
	public static String getWord(String left, String right) {
		
		left = left.substring(0, 1).toUpperCase() + left.substring(1);
		
		return left + right;
		
	}
}
