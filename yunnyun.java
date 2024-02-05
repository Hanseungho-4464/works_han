package works_han;
import java.util.Scanner;
public class yunnyun {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("년을 입력하세요 : ");
		int year = input.nextInt();
		System.out.println("월을 입력하세요 : ");
		int month = input.nextInt();
		System.out.println("일을 입력하세요 : ");
		int day = input.nextInt();
		
		int feb = 28;
		String week_list[] = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		int mon_list[] = {31,feb,31,30,31,30,31,31,30,31,30,31,};
		int month_total = 0;
		int total_days;
		int day_of_the_week;
		int year_total = 0;
		int month_y = 0;
		int[] month_yy = new int[10000];
		
		for(int j = 1; j < year; j++) {
			if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				month_y = 366;
			} else {
				month_y = 365;
			}
			month_yy[j] = month_y;
			year_total = year_total + month_yy[j];
		}
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			feb = 29;
		}
		for(int i = 1; i < month; i++) {
			month_total = month_total + mon_list[i - 1];
		}
		total_days = year_total + month_total + day;
		System.out.println("total_days = " + total_days);
		day_of_the_week = total_days % 7;
		System.out.println(day_of_the_week);
		System.out.println("입력하신 날의 요일은 " + week_list[day_of_the_week] + "입니다");
	}
}
