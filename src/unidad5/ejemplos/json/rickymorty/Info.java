package unidad5.ejemplos.json.rickymorty;

public class Info {

	private int count;
	
	private int pages;

	public Info(int count, int pages) {
		super();
		this.count = count;
		this.pages = pages;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
	
	
}
