package library;

import java.time.LocalDate;
import java.util.Scanner;

public class BookManager {

	private static final String[] ID = { "김지희", "박정은", "이수지" };
	private static final String[] PASSWORD = { "0104", "1111", "2222" };

	private Book[] books;
	private int bookSize; // 가지고있는 책 수

	private Member[] members;
	private int memberSize; // 가지고있는 회원 수
	Scanner sc;
	LocalDate now;

	public BookManager() {
		this.books = new Book[100];
		this.bookSize = 0;
		this.members = new Member[100];
		this.memberSize = 0;
	}

	public int login() {
		sc = new Scanner(System.in);
		System.out.print("ID: ");
		String id = sc.nextLine();
		System.out.print("PASSWORD: ");
		String password = sc.nextLine();

		int index = -1;
		for (int i = 0; i < ID.length; i++) {
			if (id.equals(ID[i])) {
				index = i;
			}
		}
		if (index < 0)
			return -1;
		if (password.equals(PASSWORD[index]))
			return index;
		return -2;
	}

	public void init() {
		add(new Book("봄봄", "김유정", "바.1.11", 1, "대출중(손석구/1월", 18));
		add(new Book("봄봄", "김유정", "바.1.12", 2, "대출중(이나연/1월", 20));
		add(new Book("봄봄", "김유정", "바.1.13", 11, "대출가능"));
		add(new Book("러브다이브", "아이브", "라.0.10", 11, "대출중(장원영/1월", 27));
		add(new Book("하입보이", "뉴진스", "하.1.13", 21, "대출가능"));
		add(new Book("더글로리", "송혜교", "다.1.13", 25, "대출중(박연진/1월", 10));

		add(new Member("손석구", 1));
		add(new Member("장원영", 0));
		add(new Member("박연진", 5));
		add(new Member("문동은", 0));
		add(new Member("주여정", 3));
		add(new Member("이나연", 0));
		add(new Member("장도연", 5));

	}

	private int getBookCount(String bookName) {
		int count = 0;
		for (int i = 0; i < bookSize; ++i)
			if (books[i].name.equals(bookName))
				count++;
		return count;
	}

	public Book[] findBook(String bookName) {
		int count = getBookCount(bookName);
		Book[] books = new Book[count];

		int index = 0;
		for (int i = 0; i < bookSize; ++i) {
			if (this.books[i].name.equals(bookName))
				books[index++] = this.books[i];
		}
		return books;

	}

	public void add(Book book) {
		Book[] olds = findBook(book.name);
		if (olds.length > 0) {
			book.duplicateNumber = olds.length + 1;
			if (olds.length == 1)
				olds[0].duplicateNumber = 1;
		}

		books[bookSize++] = book;
	}

	public void add(Member member) {
		members[memberSize++] = member;
	}

	public void run(int managerIndex) {
		System.out.println(ID[managerIndex] + "사서님 환영합니다.");
		now = LocalDate.now();
		int month = now.getMonthValue();
		int today = now.getDayOfMonth();
		System.out.println("오늘은 " + month + "월 " + today + "일 독서퀴즈대회가 있는 날입니다.");
		int borrowCnt = 0;
		for (int i = 0; i < bookSize; i++) {
			if (!(this.books[i].state).equals("대출가능")) {
				borrowCnt++;
			}
		}
		System.out.println("오늘의 미납도서는 총 " + borrowCnt + "권 입니다.");

		boolean flage = true;
		while (flage) {
			System.out.println("-----------------------------------------");
			System.out.println("1. 검색 | 2. 신규도서추가 | 3. 회원관리 | 4. 미납도서확인");
			System.out.println("5. 주간인기도서 | 6. 행사관리 | 7. 종료 ");
			System.out.println("-----------------------------------------");
			System.out.print("메뉴선택>");
			String menu = sc.nextLine();
			switch (menu) {
			case "1":
				do {
					System.out.print("책이름입력>");
					String bookName = sc.nextLine();
					Book[] books = findBook(bookName);
					if (books.length == 0) {
						System.out.println("검색 결과가 없습니다.");
					} else {
						for (Book book : books) {
							if (!book.state.equals("대출가능")) {
								System.out.println(
										(book.duplicateNumber > 0 ? book.name + "(" + book.duplicateNumber + ")"
												: book.name) + "[" + book.author + "] / " + book.position + " / "
												+ book.state + " " + book.date + "일 반납예정)");
							} else {
								System.out.println(
										(book.duplicateNumber > 0 ? book.name + "(" + book.duplicateNumber + ")"
												: book.name) + "[" + book.author + "] / " + book.position + " / "
												+ book.state);
							}
						}
					}
					System.out.println("추가 검색 하시겠습니까? (Y/N)");
					String input = (sc.nextLine()).toUpperCase();
					if (input.equals("N")) {
						break;
					}
				} while (true);
				break;

			case "2":
				do {
					System.out.print("책이름입력>");
					String name = sc.nextLine();
					System.out.print("저자>");
					String author = sc.nextLine();
					System.out.print("위치>");
					String position = sc.nextLine();
					add(new Book(name, author, position, 0, "대출가능"));
					System.out.println("신간도서 '" + name + "[" + author + "]" + " / " + position + "' 추가되었습니다.");
					System.out.println("추가 입력 하시겠습니까? (Y/N)");
					String input = (sc.nextLine()).toUpperCase();
					if (input.equals("N")) {
						break;
					}
				} while (true);
				break;

			case "3":
				for (int i = 0; i < memberSize; i++) {
					if (members[i].lateCnt >= 5) {
						System.out
								.println(members[i].name + " " + "미납횟수: " + members[i].lateCnt + " >> 대출이 중단된 회원입니다.");
					} else {
						System.out.println(members[i].name + " " + "미납횟수: " + members[i].lateCnt);
					}
				}
				break;

			case "4":
				System.out.println("오늘은 " + month + "월 " + today + "일 대출기한을 넘긴 목록입니다.");
				for (int i = 0; i < bookSize; i++) {
					if (!(books[i].state).equals("대출가능")) {
						now = LocalDate.now();
						int lateDayCnt = today - books[i].date;
						if (lateDayCnt >= 7) {
							System.out.println(books[i].name + "[" + books[i].author + "] / " + books[i].state + " "
									+ books[i].date + "일) " + lateDayCnt + "일째 미반납중");
						}
					}
				}

				break;

			case "5":
				// 이 기능을쓰려면 책을 최소 책을 빌리는 기능이 필요 -> 빌린 기록 누적 -> 해당기간동안 누적순위 확인 근데 아직 실력이 안되어서..
				// 100퍼 구현은 못함
				Book[] collectedBooks = new Book[bookSize];
				int collectedBookIndex = 0;
				Book sameNameBook;
				for (int i = 0; i < bookSize; i++) {
					sameNameBook = null;
					for (int j = 0; j < collectedBookIndex; ++j)
						if (collectedBooks[j].name.equals(books[i].name)) {
							sameNameBook = collectedBooks[j];
							break;
						}
					if (sameNameBook == null) {
						collectedBooks[collectedBookIndex++] = new Book(books[i]);
					} else {
						sameNameBook.cnt += books[i].cnt;
					}
				}

				Book[] sortedBooks = new Book[collectedBookIndex];
				for (int i = 0; i < collectedBookIndex; ++i)
					sortedBooks[i] = collectedBooks[i];
				Book temp;
				for (int i = 0; i < collectedBookIndex; i++) {
					for (int j = i + 1; j < collectedBookIndex; j++) {
						if (sortedBooks[i].cnt <= sortedBooks[j].cnt) {
							temp = sortedBooks[j];
							sortedBooks[j] = sortedBooks[i];
							sortedBooks[i] = temp;
						}
					}
				}

				for (int i = 0; i < collectedBookIndex; i++) {
					System.out.println((i + 1) + "위: " + sortedBooks[i].name + "[" + sortedBooks[i].author + "] / "
							+ sortedBooks[i].cnt);
				}
				break;

			case "6":
				do {
					System.out.print("날짜(월)>");
					String month1 = sc.nextLine();
					System.out.print("날짜(일)>");
					int inputDay = Integer.parseInt(sc.nextLine());
					System.out.print("행사이름>");
					String eventName = sc.nextLine();

					System.out.println(month1 + "월 " + inputDay + "일 에 " + eventName + "를(을) 추가할까요?(Y/N)");
					String input = sc.nextLine().toUpperCase();
					;
					if (input.equals("Y")) {
						System.out.println(month1 + "월 " + inputDay + "일 에 " + eventName + "를(을) 알려드리겠습니다.");
					}

					System.out.println("추가 입력 하시겠습니까? (Y/N)");
					input = sc.nextLine().toUpperCase();
					if (input.equals("N")) {
						break;
					}

				} while (true);

				break;

			case "7":
				flage = false;
				break;

			default:
				System.out.println("메뉴를 다시 선택해주세요. ");
			}

		}
	}

}
