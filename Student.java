package Clone;

public class Student implements Cloneable {

	String name;

	public Student(String name) {
		super();
		this.name = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
		

	// 밑에는 시동부 위에는 인터페이스를 가져와서 클론을 만드는 부분을 필드값과 생성자 생성 clone오버라이딩을 통해서 클론만들기 클론의 기본 타입은 protected
	//타입이라는거 단축기 말고 직접 쓸수 있도록 연습하기
	
	
	public class objectDemo{
	
	
	public static void main(String[] args) {
		Student s1 = new Student("gogogo");
		try {
			Student s2 = (Student)s1.clone();
			System.out.println(s1.name);
			System.out.println(s2.name);
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	
	}
	
}





}
