
import java.util.ArrayList;

public class WebPage {
	public String url;
	public String name;
	private Fetch fetch;
	public double score;

	public WebPage(String url, String name) {
		/* Debug */
//		System.out.println(">> WebPage(" + url + ", " + name + ")");
		/* Debug */
		this.url = url;
		this.name = name;
	}

	public Fetch getFetch() {
		return this.fetch;
	}

	public void toFetch() throws Exception {
		this.fetch = new Fetch(this.url);
//		this.fetch;
	}

	public boolean setScore(ArrayList<Keyword> keywords) {
		/* Debug *///
//		System.out.println("[" + this.getClass() + "] " + this + ".setScore(" + keywords + ")");
		/* Debug */
		score = 0;
		if (this.fetch == null) {
			try {
				toFetch();
			} catch (Exception e) {
				System.err.println(e.getMessage());
//				e.printStackTrace();
				return false;
			}
		}
		System.out.print("[" + this.getClass() + "] (" + this.name + ").setScore");
//		System.out.println("[" + this.getClass() + "] for (Keyword k : " + keywords + ")");
		for (Keyword k : keywords) {
//			System.out.println("[" + this.getClass() + "] for (Keyword " + k + " : " + keywords + ")");
			score += k.weight * getFetch().countKeyword(k); // 權重＊次數
		}
		System.out.println(" " + score);
		return true;
	}

	@Override
	public String toString() {
		return "WebPage[" + this.name + ", " + this.url + "]";
	}
}
