package dto;

public class MoviePrint {

	public void print(MovieBookDTO m) {
		System.out.println("당신이 예약한 정보");
		System.out.println("====================");
		System.out.println("ID : "+m.getId());
		System.out.println("NAME : "+m.getName());
		System.out.println("TEL : "+m.getTel());
		System.out.println("상영시간 : "+m.getStartT());
		System.out.println("좌석번호 : "+m.getSeatNum());
	}

}
