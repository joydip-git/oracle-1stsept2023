import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a sentence: ");
		String sentence = scanner.nextLine();
		scanner.close();
		Map<String, Integer> result = getWordFrequency(sentence);
		if (!result.isEmpty()) {
			result.entrySet().stream().forEach((entry) -> System.out.println(entry.getKey() + ":" + entry.getValue()));
		}
	}

	static Map<String, Integer> getWordFrequency(String sentence) {
		Map<String, Integer> wordFrequencyMap = new TreeMap<String, Integer>();

		Set<Character> separators = getSeparators(sentence);
		String regEx = generateRegEx(separators);
		String[] words = sentence.split(regEx); //"[ ,.]+"

		for (String word : words) {
			String lowercaseWord = word.toLowerCase();
			if (wordFrequencyMap.containsKey(lowercaseWord)) {
				int count = wordFrequencyMap.get(lowercaseWord);
				wordFrequencyMap.replace(lowercaseWord, ++count);
			} else {
				wordFrequencyMap.put(lowercaseWord, 1);
			}
		}
		return wordFrequencyMap;
	}

	static Set<Character> getSeparators(String sentence) {
		Set<Character> separators = new HashSet<Character>();
		for (int index = 0; index < sentence.length(); index++) {
			char character = sentence.charAt(index);
			if (!(Character.isLetter(character) || Character.isDigit(character))) {
				separators.add(character);
			}
		}
		separators.forEach(ch -> System.out.println(ch));
		return separators;
	}

	static String generateRegEx(Set<Character> delimiters) {
		//"[ ,.]+"
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		delimiters.forEach((ch) -> builder.append(ch));
		builder.append("]+");
		System.out.println(builder.toString());
		return builder.toString();
	}

}
