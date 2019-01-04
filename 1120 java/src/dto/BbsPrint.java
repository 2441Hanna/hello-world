package dto;

public class BbsPrint {
	public void bbsPrint(BbsDTO bbs) {
		System.out.println("게시판 리스트");
		System.out.println(bbs.getId());
		System.out.println(bbs.getTitle());
		System.out.println(bbs.getContent());
		System.out.println(bbs.getDate());
		
		
	}
}
