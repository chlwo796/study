package tempMemo;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] scoreArray = new int[4];
		System.out.print("이름입력>");
		String name = sc.nextLine();
		System.out.print("국어점수입력(0~100)>");
		scoreArray[0] = sc.nextInt();
		System.out.print("영어점수입력(0~100)>");
		scoreArray[1] = sc.nextInt();
		System.out.print("수학점수입력(0~100)>");
		scoreArray[2] = sc.nextInt();
		System.out.print("과학점수입력(0~100)>");
		scoreArray[3] = sc.nextInt();

		double ave = 0;
		int sum = 0;
		System.out.println("이름\t국어점수\t영어점수\t수학점수\t과학점수\t총점\t평균점수");
		System.out.print(name + "\t");
		for (int i = 0; i < scoreArray.length; i++) {
			sum += scoreArray[i];
			System.out.print(scoreArray[i] + "\t");
		}
		ave = sum / scoreArray.length;
		System.out.print(sum + "\t" + ave);
	}

}