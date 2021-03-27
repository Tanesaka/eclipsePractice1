package jp.learningdesign.javastudy;

class Staff {
	String name;
	int staffid;
	String email;
	
	public void sayhello() {
		System.out.println("Hello " + this.name);
	}
}

public class StaffInfo {

	public static void main(String[] args) {
		Staff yamada = new Staff();
		yamada.name = "Taro Yamada";
		
		yamada.sayhello();

//		System.out.println(yamada.name);

	}

}
