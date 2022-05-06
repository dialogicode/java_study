package me.gof_design_pattern.structural.bridge;

// 출판사와 가격정보도 출력 기능 추가
public class Publication extends Draft {
	private String publisher;
	private int cost;
	
	public Publication(String title, String author, String[] content, String publisher, int cost) {
		super(title, author, content);
		this.publisher = publisher;
		this.cost = cost;
	}

	private void printPublicationInfo() {
		System.out.println("#" + publisher + " $"+cost);
	}

	@Override
	public void print(Display display) {
		super.print(display);
		printPublicationInfo();
	}

}
