package jframeTest;

public class ApplePhone implements Phone {
  
	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("영상전화 하다.");
	}

	@Override
	public void text() {
		// TODO Auto-generated method stub
		System.out.println("멀티메일로 문자하다.");
	}

}
