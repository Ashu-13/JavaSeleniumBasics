import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OccurenceOfWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Hare Rama Hare Rama Rama Rama HareHareKrishna Hare Krishna Hare KrishnaHareKrishna Krishna HareHaress";
		Map<String, Integer> wordFrequencyMap = getWordFrequency(text);
		
		for(Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
			System.out.println(entry.getKey()+" : "+ entry.getValue());
		}
		
		

	}
	
	/*
	 * public static void method1(String s) {
	 * 
	 * Pattern p = new Pattern(s); Matcher m = p.matcher("hare");
	 * 
	 * 
	 * 
	 * }
	 */
	
	
	public static Map<String, Integer> getWordFrequency(String text){
		String[] words = text.split("\\s+");
		Map<String, Integer> wordFrequencyMap = new HashMap<>();
		
		for(String word: words) {
			word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
			
		if(!word.isEmpty()){
			if(wordFrequencyMap.containsKey(word)) {
				wordFrequencyMap.put(word,  wordFrequencyMap.get(word));
			}
			else {
				wordFrequencyMap.put(word,1);
			}
			for(int i =1; i<word.length();i++) {
				String subWord = word.substring(0,i);
				if(wordFrequencyMap.containsKey(subWord)) {
					wordFrequencyMap.put(subWord, wordFrequencyMap.get(subWord)+1);
				}
				else {
					wordFrequencyMap.put(subWord, 1);
				}
			}
		}
		
	}
return wordFrequencyMap;
}
}
