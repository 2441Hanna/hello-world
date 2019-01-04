package dto;

public class MovieMain {

	public static void main(String[] args) {
		MovieBookDTO m = new MovieBookDTO("root","박아무개",0123456,20,30);
		MoviePrint p = new MoviePrint();
		
		p.print(m);
		
			
	}

}
