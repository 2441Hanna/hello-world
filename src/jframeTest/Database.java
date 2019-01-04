package jframeTest;

public class Database {
	String id;
	String pw;
	String name;
	int age;
	String tel;
	
	public Database() {
		
	}

	public Database(String id, String pw, String name, int age, String tel) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Database [id=" + id + ", pw=" + pw + ", name=" + name + ", age=" + age + ", tel=" + tel + "]";
	}
	
	
	
}
