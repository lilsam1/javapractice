package ch_08_inheritance;

public class Pet {
	private String name;		// 애완동물 이름
	private String masterName;	// 주인 이름
	
	public Pet(String name, String masterName) {	// 생성자
		this.name = name;		// 애완동물 이름
		this.masterName = masterName;		// 주인 이름
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMasterName() {
		return masterName;
	}

	public void setMasterName(String masterName) {
		this.masterName = masterName;
	}
	
	public void introduce() {	// 자기소개
		System.out.println("내 이름은 " + name + "입니다");
		System.out.println("주인님은 " + masterName + "입니다");
	}
	
	
	
	

}
