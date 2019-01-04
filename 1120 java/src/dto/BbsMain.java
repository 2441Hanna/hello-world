package dto;

public class BbsMain {

	public static void main(String[] args) {
		BbsDTO bbs = new BbsDTO("id123", "title : thats it!", "content is hear", "date");
		BbsPrint p = new BbsPrint();
		
		p.bbsPrint(bbs);
	}

}
