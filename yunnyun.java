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
		String week_list[] = { "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일" };
		int mon_list[] = { 31, feb, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, };
		// 불필요한 변수
		// int month_total = 0;
		int total_days = 0;
		int day_of_the_week;
		// 불필요한 변수
		//int year_total = 0;
		// 불필요한 변수
		//int month_y = 0;
		// 이 배열은 왜 있는거임?
		// int[] month_yy = new int[10000];

		// 1년부터 구하려는 연도의 전년까지의 일수를 구함
		for (int j = 1; j < year; j++) {
			// 윤년 계산식
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				total_days += 366;
			} else {
				total_days += 365;
			}
			//year_total += month_y;
			// month_yy[j] = month_y;
			// year_total = year_total + month_yy[j];
		}
		// 올해가 윤년인지 확인하는 식
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			feb = 29;
		}
		// 입력한 전월까지의 일수를 구함
		for (int i = 1; i < month; i++) {
			total_days += mon_list[i - 1];
			//month_total = month_total + mon_list[i - 1];
		}
		//total_days = year_total + month_total + day;
		// 오늘 일 수를 더함
		total_days += day;
		// 연도까지의 일수 + 월까지의 일수 + 일수를 더함
		System.out.println("total_days = " + total_days);

		// 총 일수를 7로 나눈 나머지를 구함
		day_of_the_week = total_days % 7;
		// 나머지가 요일이 됨
		System.out.println(day_of_the_week);
		System.out.println("입력하신 날의 요일은 " + week_list[day_of_the_week] + "입니다");
	}
}
