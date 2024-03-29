2023년 5월 22일 월요일

---

## day 95

### 11회차 시험 정리

- 빌드 : 소스코드 파일들을 컴파일(2진수, 기계어로 번역)한 후 여러 개의 모듈을 묶어 실행 파일로 만드는 과정
- 빌드도구 : Ant, Maven, Gradle(안드로이드)
- 미들웨어 : 서로 다른 어플리케이션이 서로 통신하는데 사용되는 소프트웨어
- 형상관리(SCM : Software Configuration Management)
  - 핵심포인트 : 버전관리
  - 소프트웨어의 개발 과정에서 소프트웨어 변경 사항을 관리하기 위해 개발된 일련의 활동, Git, SVN(Subvision), CVN
- 외계인코드 : 프로그램의 로직이 복잡하여 이해하기 어려운 프로그램
- 스파게티 코드 : 컴퓨터 프로그램의 소스 코드가 복잡하게 얽힌 모습을 스파게티 면발에 비유한 표현, 프로그램의 구조가 잘못 설계되어 가독성이나 유지보수가 어려운 상태를 의미한다.

- DTO(Data Transfer Object) 또는 VO(Value Object) : 공통코드 조회를 위해 필요한 변수들을 정의하여 계층 간 데이터 교환을 위해 사용
- DAO(Data Access Object) : sql문을 구현한 xml 파일에서 해당 id값을 호출하여 데이터를 조회하거나 조작
- DTO/VO 구현 -> SQL문 구현 -> DAO구현 -> Service 구현 -> Controller 구현 -> 화면 구현
- MVC 1 방식 : jsp로만 구현한 웹 어플리케이션
- MVC 2 방식 : 클라이언트의 요청 처리, 응답 처리, 비지니스 로직 처리 부분을 모듈화한 구조
- MVC(Model, View, Controller) : 웹 어플리케이션을 비지니스 로직, 프레젠테이션 로직, 데이터로 분리하는 디자인 패턴

  - 비지니스 로직 : 어플리케이션의 데이터
  - 프레젠테이션 : 어플리케이션이 사용자에게 어떻게 표시되는지
  - 요청 처리 데이터 : 비지니스 로직과 프레젠테이션 파트를 함께 묶는 것

- Model : 어플리케이션의 데이터와 비지니스 로직을 담는 객체
- View : 사용자에게 모델의 정보(데이터)를 보여주는 역할
  - 비지니스 로직을 포함하지 않는다.
  - 하나의 모델을 다양한 뷰에서 사용
- Controller : 모델과 뷰 사이에서 발생하는 동작을 조정하는 역할, 웹으로부터 받은 요청에 가장 적합한 모델을 생성하는 것을 처리하는 역할과 사용자에게 응답하는 적절한 뷰를 선택하여 해당 모델을 전달하는 역할
- 단위모듈테스트 : 블랙박스테스트, 화이트박스 테스트
  - 블랙박스 : 개발 후기에 하는 테스트기법, 내부 로직확인 없이 입력값, 예상 결과값 확인(사용자입장)
  - 화이트박스 : 개발 초반에 하는 테스트기법, 내부 로직 확인(개발자입장)
- 테스트 구성요소

  - 식별자 : 항목 식별자, 일련번호
  - 테스트항목 : 테스트 대상(모듈 등)
  - 입력 명세 : 입력 데이터 또는 테스트 조건
  - 출력 명세 : 테스트케이스 수행시 예상되는 출력 결과
  - 환경설정 : 필요한 하드웨어나 소프트웨어의 환경
  - 특수 절차 요구 : 테스트 케이스 수행시 특별히 요구되는 절차
  - 의존성 기술 : 테스트 케이스 간의 의존성

- 로그(log) : 프로그램 개발이나 운영 시 발생하는 문제점을 추적하거나 운영 상태를 모니터링하기 위한 텍스트
  - Error : 요청을 처리하는 중 일반적인 에러가 발생한 상태
    - 프로그램 동장에 큰 문제가 발생했다는 것으로 즉시 문제를 조사해야 하는 것
  - Warn :프로그램 실행에는 문제가 없지만, 향후 시스템 에러의 원인이 될 수 있는 경고성 메시지
  - Info : 로그인, 상태 변경과 같은 정보성 메시지
  - Debug : 개발시 디버깅 용도로 사용할 메시지를 나타낸다.

---

### 제품소프트웨어 패키징

- 소프트웨어 패키징 : 배포용 설치 파일 만드는 것, 사용자 중심 패키징 수행
- 패키징 시 고려사항
  - 사용자의 시스템 환경(cpu, os(운영체제), 메모리)을 고려해서 최소환경을 정의
  - ui(사용자 환경)은 사용자가 눈으로 직접 확인할 수 있도록 시각적인 자료와 함께 제공하고 메뉴얼과 일치시켜 패키징
  - 소프트웨어는 단순히 패키징하여 배포하는 것으로 끝나는 것이 아니라 하드웨어와 함께 관리될 수 있도록 Managed Service 형태로 제공하는 것이 좋음
  - 사용자에게 배포되는 소프트웨어이므로 내부 콘텐츠에 대한 암호화 및 보안을 고려하여 다른 여러 콘텐츠 및 단말기 간 DRM(디지털 저작관 관리) 연동을 고려

---

### java 정리

- 객체지향프로그래밍(OOP)의 특징

  - 정보은닉(캡슐화)
  - 오버라이딩

- 메모리영역
  - 데이터영역(메소드,스태틱영역)
  - 스택영역
  - 힙영역(객체, JVM)

```java
package exam;

import java.util.Scanner;

public class FirstExam01 {
	// 필드 = 속성, 객체에 담기는 변수(힙)
//	int age;  // 필드, 멤버변수, 인스턴스변수
//	String name;

	// 자료형
	// 기본자료형 = byte, short, int, long, float, double, char
	// 참조자료형 = 배열, 열거, 클래스, String => 힙(JVM), 스택에는 위치(주소)를 저장
	public static void main(String[] args) {
		// 메인메소드 = 기능, 스택
		// int num = 10; // 지역변수

		Scanner scanner = new Scanner(System.in); // 시스템인풋스트림을 매개변수로 스캐너 생성
		// 생성자 = 객체 초기화 역할
		// 변수 선언
		int koreanScore = 0, englishScore = 0, mathScore = 0, sum = 0;
		double avg = 0.0;
		String koreanMessage = "국어점수를 입력해주세요.";
		String englishMessage = "영어점수를 입력해주세요.";
		String mathMessage = "수학점수를 입력해주세요.";
		String message = "국어, 영어, 수학 점수 입력"; // 클린코드 과정
		System.out.println(message);
		koreanScore = Integer.parseInt(scanner.next()); // next() String->int로 변환하여 저장
		englishScore = Integer.parseInt(scanner.next());
		mathScore = Integer.parseInt(scanner.next()); // 엔터키를 구분자로한다.
//		System.out.println(koreanMessage);
//		koreanScore = scanner.nextInt();
//		System.out.println(englishMessage);
//		englishScore = scanner.nextInt();
//		System.out.println(mathMessage);
//		mathScore = scanner.nextInt();
		sum = koreanScore + englishScore + mathScore;
		avg = (double) sum /3; // sum에 대한 형변환을 먼저 하여 double sum 을 3으로 나누어 소수점을 살림
		// avg = (double) (sum/3); 형변환을 나중에 하여 소수점이 없다.

		System.out.println("============================================");
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n", "홍길동", koreanScore, englishScore, mathScore, sum, avg);
		System.out.println("============================================");

	}
}
```
