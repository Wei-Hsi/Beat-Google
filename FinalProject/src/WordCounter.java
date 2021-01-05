

public class WordCounter {
	private String content;

	public WordCounter(Fetch fetch) {
		this.content = fetch.getContent();
	}

	public WordCounter(String content) {
		this.content = content;
	}

	public int countKeyword(String keyword) {
		content = content.toUpperCase();
		keyword = keyword.toUpperCase();

		int retVal = 0;
		int fromIdx = 0;
		int found = -1;

		while ((found = content.indexOf(keyword, fromIdx)) != -1) {
			retVal++;
			fromIdx = found + keyword.length();
		}

		return retVal;
	}
}
