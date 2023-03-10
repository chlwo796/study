package javaHigh03.example05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetEx04 {
	public static void main(String[] args) {
		Set<Fare> fareSet = new HashSet<Fare>();

		fareSet.add(new Fare("502", 1, 423, 25000));
		fareSet.add(new Fare("303", 7, 725, 35000));
		fareSet.add(new Fare("403", 2, 222, 40000));
		fareSet.add(new Fare("503", 2, 438, 25000));
		fareSet.add(new Fare("503", 3, 417, 35000));
		fareSet.add(new Fare("504", 4, 248, 45000));
		fareSet.add(new Fare("504", 4, 248, 45000));

		// 전체출력, toString 활용해보기
		Iterator<Fare> it = fareSet.iterator();
		System.out.println("호수\t가족수\t전기사용량\t공동요금");
		while (it.hasNext()) {
			Fare fare = it.next();
			System.out.println(fare.getNumber() + "\t" + fare.getFamilyNumber() + "\t" + fare.getElectricity() + "\t"
					+ fare.getFee());
		}
		// 호수검색->전기사용량
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		System.out.print("호수를 입력하세요>");
		String searchNumber = sc.nextLine();

		it = fareSet.iterator();
		while (it.hasNext()) {
			Fare fare = it.next();
			if (fare.getNumber().equals(searchNumber)) {
				System.out.println("호수 : " + searchNumber + ", 전기사용량 : " + fare.getElectricity());
				check = false;
			}
		}
		if (check) {
			System.out.println("찾으시는 호수 " + searchNumber + "은/는 없습니다.");
		}
		// 최대전기사용량->호수, 가족수
		// Fare의 주소를 참조하는 변수 따로 선언
		Fare maxFare = null;
		int maxElectricity = 0;
		it = fareSet.iterator();
		while (it.hasNext()) {
			Fare fare = it.next();
			if (maxElectricity < fare.getElectricity()) {
				maxElectricity = fare.getElectricity();
				maxFare = fare; // 주소를 기억,저장하여 바로 사용한다.
			}
		}
		System.out.println("최대전기사용량 " + maxFare.getElectricity() + "의 가구는 " + maxFare.getNumber() + "호, 가족수 : "
				+ maxFare.getFamilyNumber());

		// 최소 공동요금 -> 공동요금 500원추가 -> 최소공동요금데이터가 여러개라면 배열로 만들어볼 수도 있다.
		int minFee = Integer.MAX_VALUE;
		System.out.println(minFee);
		it = fareSet.iterator();
		while (it.hasNext()) {
			Fare fare = it.next();
			if (minFee > fare.getFee()) {
				minFee = fare.getFee();
			}
		}
		System.out.println("최소 공동요금 : " + minFee);
		int additionalFee = 500;
		it = fareSet.iterator();
		while (it.hasNext()) {
			Fare fare = it.next();
			if (minFee == fare.getFee()) {
				fare.setFee(fare.getFee() + additionalFee);
				System.out.println("공동요금 " + additionalFee + "원 추가하였습니다.");
				System.out.println("호수\t가족수\t전기사용량\t공동요금");
				System.out.println(fare.getNumber() + "\t" + fare.getFamilyNumber() + "\t" + fare.getElectricity()
						+ "\t" + fare.getFee());
			}
		}
		// 전기사용량 평균, 공동요금 평균
		int sumElectricity = 0;
		int sumFee = 0;
		
		System.out.println("호수\t가족수\t전기사용량\t공동요금");
		it = fareSet.iterator();
		while (it.hasNext()) {
			Fare fare = it.next();
			sumElectricity += fare.getElectricity();
			sumFee += fare.getFee();
			System.out.println(fare.getNumber() + "\t" + fare.getFamilyNumber() + "\t" + fare.getElectricity() + "\t"
					+ fare.getFee());
		}
		double aveElectricity = (double) sumElectricity / fareSet.size();
		double aveFee = (double) sumFee / fareSet.size();
		System.out.println("전기사용량 평균 : " + aveElectricity + ", 공동요금 평균 : " + aveFee);

	}
}
