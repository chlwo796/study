2023년 1월 31일 화요일

---

- 자바 : 객체지향 프로그램
  - 부모(상위)객체 : 역할명시, 메소드 형태, 추상메소드
  - 자식(하위)객체 : 역할 수행하는 코드 작성(실제프로그램 작성)
- 데이터베이스 : 데이터 저장소(오라클, mysql, mongo 등)
- 부모클래스 : 데이터베이스 읽기 `void read();` 데이터베이스 저장 `void save();` 등 메소드만 명시
- 자식클래스 : 다양한 데이터베이스 중에 특정 데이터베이스만 연결하여 void read(); overriding 하여 재정의해준다.
- 요구사항에 따라 프로그래밍을 효율적으로 할 수 있다.

### 다형성

- 상속의 연장개념
- `Animal animal = new Cat();`
- 자색클래스에 있는 것 중 overriding은 사용하지만, overriding되지 않은 메소드랑 field는 사용할 수 없다.(다운캐스팅, 타입변환으로 사용 가능)
- `toString()` : Object라는 부모의 메소드이며, overriding한 후 참조변수만 입력하면 자동으로 x.toString() 메소드를 호출한다.

- 다형성문제 풀어오기. 1331번 문제 2개
- html 하기
- 부모생성자 없으면 자식에게간다..?
