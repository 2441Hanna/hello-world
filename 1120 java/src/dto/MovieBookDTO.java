package dto;

public class MovieBookDTO {
	private String id;
	private String name;
	private int tel;
	private int startT;
	private int seatNum;
	
	public MovieBookDTO() {
		// TODO Auto-generated constructor stub
	}

	public MovieBookDTO(String id, String name, int tel, int startT, int seatNum) {
		this.id = id;
		this.name = name;
		this.tel = tel;
		this.startT = startT;
		this.seatNum = seatNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public String getId() {
		return id;
	}

	public int getStartT() {
		return startT;
	}

	public int getSeatNum() {
		return seatNum;
	}
	
	
	

}
