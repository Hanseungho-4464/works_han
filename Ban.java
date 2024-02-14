package works_han;
import java.util.ArrayList;
import java.util.List;

public class Ban {
	private List<Person> persons;
	public Ban() {
		persons = new ArrayList<>();
	}
	public void add(Person person) {
		this.persons.add(person);
	}
	public int getAvg() {
		int sum = 0;
		for(int i=0;i<persons.size();i++) {
			sum += persons.get(i).getAvg();
		}
		return sum / persons.size();
	}
	public int getKorAvg() {
		int sum = 0;
		for(int i=0;i<persons.size();i++) {
			sum += persons.get(i).getKorAvg();
		}
		return sum / persons.size();
	}
	public int getBanTotal() {
		int sum = 0;
		for(int i=0;i<persons.size();i++) {
			sum += persons.get(i).getTotal();
		}
		return sum / persons.size();
	}
	public int getRank() {
		for(int i = 0; i < persons.size(); i++) {
			int temp = persons.get(i).getTotal();
			for(int j = i - 1 - 1; j > 0; j--) {
				if(temp < persons.get(j).getTotal()) {
					persons.get(j + 1).getTotal() = persons.get(j).getTotal();
				}else {
					break;
				}
				persons.get(j + 1).getTotal() = temp;
			}
		}
		return persons.toArray().toString();
	}
}
class Person{
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int history;
	public Person(String name, int kor, int eng, int math, int history) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.history = history;
	}
	public int getKorean() {
		return this.kor;
	}
	public int getEnglish() {
		return this.eng;
	}
	public int getMath() {
		return this.math;
	}
	public int getTotal() {
		return this.kor + this.eng + this.math + this.history;
	}
	public int getAvg() {
		return (this.kor + this.eng + this.math + this.history)/4;
	}
	public int getKorAvg() {
		return this.kor;
	}
	public int getRank() {
		return this.kor + this.eng + this.math + this.history;
	}
}
class Program{
	public static void main(String[] args) {
		Ban ban = new Ban();
		ban.add(new Person("a",70,50,60,10));
		ban.add(new Person("b",70,50,60,10));
		ban.add(new Person("c",70,50,60,10));
		ban.add(new Person("d",70,50,60,10));
		ban.add(new Person("e",70,50,60,10));
		ban.add(new Person("f",70,50,60,10));
		ban.add(new Person("g",70,50,60,10));
		ban.add(new Person("h",70,50,60,10));
		ban.add(new Person("i",70,50,60,10));
		ban.add(new Person("j",70,50,60,10));
	}
}

