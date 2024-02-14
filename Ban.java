import java.util.ArrayList;
import java.util.List;

class Ban {
	private List<Person> persons;

	public Ban() {
		persons = new ArrayList<>();
	}

	public void add(Person person) {
		this.persons.add(person);
	}

	// 총 평균
	public int getAvg() {
		int sum = 0;
		for (int i = 0; i < persons.size(); i++) {
			sum += persons.get(i).getAvg();
		}
		return sum / persons.size();
	}

	// 국어 총점..
	public int getKorAvg() {
		int sum = 0;
		for (int i = 0; i < persons.size(); i++) {
			sum += persons.get(i).getKorAvg();
		}
		return sum / persons.size();
	}

	// 반 총점
	public int getBanTotal() {
		int sum = 0;
		for (int i = 0; i < persons.size(); i++) {
			// 각 학생의 총점을 더한다.
			sum += persons.get(i).getTotal();
		}
		// ?? 이건 평균인데???
		return sum / persons.size();
	}

	// 석차는..
	// 석차 구하기
//	public int getRank() {
//
//		
//		for (int i = 0; i < persons.size(); i++) {
//			int temp = persons.get(i).getTotal();
//			for (int j = i - 1 - 1; j > 0; j--) {
//				if (temp < persons.get(j).getTotal()) {
//					// 이건 뭐지???
//					persons.get(j + 1).getTotal() = persons.get(j).getTotal();
//				} else {
//					break;
//				}
//				// 이건 뭐지???
//				persons.get(j + 1).getTotal() = temp;
//			}
//		}
//		// 리턴이 int형인데 toString은 뭐지??
//		return persons.toArray().toString();
//	}
}

class Person {
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	// 역사는 그냥 복잡하니깐 뺍시다.

	// 생성자
	public Person(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	// 각 과목 점수를 리턴하는 메소드
	public int getKorean() {
		return this.kor;
	}

	public int getEnglish() {
		return this.eng;
	}

	public int getMath() {
		return this.math;
	}

	// 총점을 리턴하는 메소드
	public int getTotal() {
		return this.kor + this.eng + this.math;
	}

	// 평균을 리턴하는 메소드
	public int getAvg() {
		return (this.kor + this.eng + this.math) / 3;
	}

	// 국어 평균을 리턴하는 메소드(??????)
	public int getKorAvg() {
		return this.kor;
	}

	// 석차를 리턴하는 메소드(????)
	public int getRank() {
		return this.kor + this.eng + this.math;
	}
}

// package 내에서 같은 클래스 이름은 존재할 수 없다.
// public class는 클래스 파일명과 일치해야 한다. 
public class Program {
	public static void main(String[] args) {
		Ban ban = new Ban();
		ban.add(new Person("a", 70, 50, 60));
		ban.add(new Person("b", 70, 50, 60));
		ban.add(new Person("c", 70, 50, 60));
		ban.add(new Person("d", 70, 50, 60));
		ban.add(new Person("e", 70, 50, 60));
		ban.add(new Person("f", 70, 50, 60));
		ban.add(new Person("g", 70, 50, 60));
		ban.add(new Person("h", 70, 50, 60));
		ban.add(new Person("i", 70, 50, 60));
		ban.add(new Person("j", 70, 50, 60));
	}
}
