package tempMemo;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] scoreArray = new int[4];
		System.out.print("�̸��Է�>");
		String name = sc.nextLine();
		System.out.print("���������Է�(0~100)>");
		scoreArray[0] = sc.nextInt();
		System.out.print("���������Է�(0~100)>");
		scoreArray[1] = sc.nextInt();
		System.out.print("���������Է�(0~100)>");
		scoreArray[2] = sc.nextInt();
		System.out.print("���������Է�(0~100)>");
		scoreArray[3] = sc.nextInt();

		double ave = 0;
		int sum = 0;
		System.out.println("�̸�\t��������\t��������\t��������\t��������\t����\t�������");
		System.out.print(name + "\t");
		for (int i = 0; i < scoreArray.length; i++) {
			sum += scoreArray[i];
			System.out.print(scoreArray[i] + "\t");
		}
		ave = sum / scoreArray.length;
		System.out.print(sum + "\t" + ave);
	}

}