import java.lang.StringBuilder;

public class Main {
	public static void main(String[] args) {
		System.out.println(toCamelCase("the-stealth-warrior"));
	}
	
  public  static String toCamelCase(String s){
      StringBuilder newString = new StringBuilder();
      String[] words = s.contains("_") ? s.split("_") : s.split("-");
      boolean first = true;
      for (String word : words) {
            if ( first ) {
                newString.append(word);
                first = false;
            } else {
                char fisrtLetter = Character.toUpperCase(word.charAt(0));
                newString.append(fisrtLetter).append(word.substring(1));
            }
      }
        
        return newString.toString();
      
  }
}
