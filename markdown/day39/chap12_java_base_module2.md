2023년 2월 26일 일요일

---

## chap.12 java.base module2

### 7. 수학 클래스

- Math 클래스는 수학 계산에 사용할 수 있는 메소드를 제공하며, 모두 정적메소드 이므로 Math클래스로 바로 사용이 가능하다.
- Math 클래스의 주요 메소드

  ```java
  // 절대값
  int v1 = Math.abs(-5);
  double v2 = Math.abs(-3.14);

  // 올림값
  double v3 = Math.ceil(5.3);
  double v4 = Math.ceil(-5.3);

  // 버림값
  double v5 = Math.floor(5.3);
  double v6 = Math.floor(-5.3);

  // 최대값
  int v7 = Math.max(5, 9);
  double v8 = Math.max(5.3, 2.8);

  // 최소값
  int v9 = Math.min(5, 9);
  double v10 = Math.min(5.3, 2.5);

  // 랜덤값
  double v11 = Math.random();

  // 반올림값
  long v12 = Math.round(5.3);
  long v13 = Math.round(5.7);
  ```

- MathExample 예제

  ```java
  package javaChap12.example05;

  public class MathExample {
      public static void main(String[] args) {

          double v1 = Math.ceil(5.3);
          double v2 = Math.floor(5.3);
          System.out.println(v1);
          System.out.println(v2);

          // 최대값
          double v3 = Math.max(3, 8);
          double v4 = Math.min(3, 8);
          System.out.println(v3);
          System.out.println(v4);

          double v5 = 12.7849;
          double temp1 = v5 *100;
          double temp2 = Math.round(temp1);
          double result = temp2/100.0;
          System.out.println(result);
      }
  }
  ```

- `random()` 메소드는 0.0과 1.1사이의 double 타입 난수를 리턴한다.
  `int num = (int) (Math.random()*n) + start;`
- java.util.Random 클래스를 이용하는 방법
  - `Random()` : 현재 시간을 이요해서 종자값을 자동 설정한다
  - `Random(long seed)` : 주어진 종자값을 사용한다.
- 종자값(seed) : 난수를 만드는 알고리즘에 사용되는 값으로, 종자값이 같으면 같은 난수를 얻는다.
- Random 클래스의 주요 메소드

  - `boolean nextBoolean()` : boolean 타입의 난수를 리턴
  - `double nextDouble()` : double 타입의 난수를 리턴(0.0<= ~ < 1.0)
  - `int nextInt()` : int 타입의 난수를 리턴(-2^32<= ~ <=2^32-1)
  - `int nextInt(int n)` : int 타입의 난수를 리턴(0<= ~ < n)

- RandomExample 예제

  ```java
  package javaChap12.example05;

  import java.util.Arrays;
  import java.util.Random;

  public class RandomExample {
      public static void main(String[] args) {
          int[] selectNumber = new int[6];
          Random random = new Random(3);
          System.out.print("선택번호 : ");

          for(int i = 0;i<selectNumber.length;i++) {
              selectNumber[i] = random.nextInt(45) + 1;
              System.out.print(selectNumber[i] + " ");
          }
          System.out.println();

          int[] winningNumber = new int[6];
          // 종자값을 다르게 하여 선택번호와 당첨번호는 각각 다르게 나온다.
          random = new Random(5);
          System.out.print("당첨번호 : ");

          for(int i = 0;i<winningNumber.length;i++) {
              winningNumber[i] = random.nextInt(45) + 1;
              System.out.print(winningNumber[i] + " ");
          }
          System.out.println();

          Arrays.sort(selectNumber);
          Arrays.sort(winningNumber);
          boolean result = Arrays.equals(selectNumber, winningNumber);
          System.out.print("당첨 여부 : ");
          if(result) {
              System.out.println("1등에 당첨되셨습니다.");
          }else {
              System.out.println("당첨되지 않았습니다.");
          }
      }
  }
  ```

### 8. 날짜와 시간 클래스

- 자바는 컴퓨터의 날짜 및 시각을 읽을 수 있도록 java.util 패키지에서 Date와 Calendar 클래스를 제공한다.
- 날짜와 시간을 조작할 수 있도록 java.time 패키지에서 LocalDateTime 등의 클래스를 제공한다.
- Date 클래스 : 날짜 정보를 전달하기 위해 사용
- Calendar 다양한 시간대별로 날짜와 시간을 얻을 때 사용
- LocalDateTime : 날짜와 시간을 조작할 때 사용

1. Date 클래스

- Date는 날짜를 표현하는 클래스로 객체 간에 날짜 정보를 주고 받을 때 사용되며, Date 클래스에는 여러 개의 생성자가 선언되어 있지만, 대부분 Deprecated(더 이상 사용되지 않음)되어 `Date()` 기본 생성자만 주로 사용된다.
- Date() 생성자는 컴퓨터의 현재 날짜를 읽어 Date 객체로 만든다.

  `Date now = new Date();`

- 현재 날짜를 문자열로 얻고 싶다면 `toString()` 메소드를 사용할 수 있지만, 영문으로 출력되기 때문에 원하는 형식으로 출력하고 싶다면, `SimpleDateFormat` 클래스와 함께 사용해야 한다.

- DateExample 예제

  ```java
  package javaChap12.example06;

  import java.text.SimpleDateFormat;
  import java.util.Date;

  public class DateExample {
      public static void main(String[] args) {
          Date now = new Date();
          String now1 = now.toString();
          System.out.println(now1);
          System.out.println(now);

          SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
          String now2 = sdf.format(now);
          System.out.println(now2);
      }
  }
  ```

2. Calendar 클래스

- Calendar 클래스는 달력을 표현하는 추상 클래스이며, Calendar 클래스의 정적 메소드인 `getInstance()` 메소드를 이용하면 컴퓨터에 설정되어 있는 시간대(TimeZone)을 기준으로 Calendar 하위 객체를 얻을 수 있다.

  `Calendar now = Calendar.getInstance();`

- Calendar가 제공하는 날짜와 시간에 대한 정보를 얻기 위해서는 `get()`메소드를 이용하고, `get()` 메소드의 매개값으로 Calendar에 정의된 상수를 주면 상수가 의미하는 값을 리턴한다.

  ```java
  int year = now.get(Calendar.YEAR);1   // 년도를 리턴
  int month = now.get(Calendar.MONTH) + 1;  // 월(0~11)을 리턴
  int day = now.get(Calendar.DAY_OF_MONTH); // 일을 리턴
  int week = now.get(Calendar.DAY_OF_WEEK); // 요일을 리턴
  int amPm = now.get(Calendar.AM_PM);   // 오전/오후를 리턴
  int hour = now.get(Calendar.HOUR);    // 시를 리턴
  int minute = now.get(Calendar.MINUTE);    // 분을 리턴
  int second = now.get(Calendar.SECOND);    // 초를 리턴
  ```

- CalendarExample 예제

  ```java
  package javaChap12.example06;

  import java.util.Calendar;

  public class CalendarExample {
      public static void main(String[] args) {
          Calendar now = Calendar.getInstance();

          int year = now.get(Calendar.YEAR);
          int month = now.get(Calendar.MONTH) + 1;
          int day = now.get(Calendar.DAY_OF_MONTH);
          int week = now.get(Calendar.DAY_OF_WEEK);

          String strWeek = null;

          switch (week) {
          case Calendar.MONDAY: {
              strWeek = "월";
              break;
          }
          case Calendar.TUESDAY: {
              strWeek = "화";
              break;
          }
          case Calendar.WEDNESDAY: {
              strWeek = "수";
              break;
          }
          case Calendar.THURSDAY: {
              strWeek = "목";
              break;
          }
          case Calendar.FRIDAY: {
              strWeek = "금";
              break;
          }
          case Calendar.SATURDAY: {
              strWeek = "토";
              break;
          }
          default: {
              strWeek = "일";
          }

          }//end switch
          int amPm = now.get(Calendar.AM_PM);
          String strAmPm = null;
          if(amPm == Calendar.AM) {
              strAmPm = "오전";
          }else {
              strAmPm = "오후";
          }
          int hour = now.get(Calendar.HOUR);
          int minute = now.get(Calendar.MINUTE);
          int second = now.get(Calendar.SECOND);

          System.out.println(year + "년");
          System.out.println(month + "월");
          System.out.println(day + "일");
          System.out.println(strWeek + "요일");
          System.out.println(strAmPm);
          System.out.println(hour + "시");
          System.out.println(minute + "분");
          System.out.println(second + "초");
      }
  }
  ```

- 알고 싶은 시간대의 TimeZone 객체를 얻어, `getInstance()` 메소드의 매개값으로 넘겨주면, 미국/로스앤젤레스와 같은 다른 시간대의 Calendar를 얻을 수 있다.

  ```java
  Timezone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
  Calendar now = Calendar.getInstance(timeZone);
  ```

- LosAngelesExample 예제

  ```java
  package javaChap12.example06;

  import java.util.Calendar;
  import java.util.TimeZone;

  public class LosAngelesExample {
      public static void main(String[] args) {
          TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
          Calendar now = Calendar.getInstance(timeZone);

          int amPm = now.get(Calendar.AM);
          String strAmPm = null;
          if (amPm == Calendar.AM) {
              strAmPm = "오전";
          } else {
              strAmPm = "오후";
          }
          int hour = now.get(Calendar.HOUR);
          int minute = now.get(Calendar.MINUTE);
          int second = now.get(Calendar.SECOND);

          System.out.println(strAmPm);
          System.out.println(hour + "시");
          System.out.println(minute + "분");
          System.out.println(second + "초");

      }
  }
  ```

- PrintTimeZoneID 예제

  ```java
  package javaChap12.example06;

  import java.util.TimeZone;

  public class PrintTimeZoneID {
      public static void main(String[] args) {
          String[] availableIDs = TimeZone.getAvailableIDs();
          for(String id : availableIDs) {
              System.out.println(id);
          }
      }
  }
  ```

3. 날짜와 시간 조작

- Date와 Calendar는 날짜와 시간 정보를 얻기에는 충분하지만, 날짜와 시간을 조작할 수는 없다.
- java.time 패키지의 LocalDateTime 클래스가 제공하는 메소드를 이용하면 쉽게 날짜와 시간을 조작할 수 있다.
  - `minusYears(long)` : 년 빼기
  - `minusMonths(long)` : 월 빼기
  - `minusDays(long)` : 일 빼기
  - `minusWeeks(long)` : 주 빼기
  - `plusYears(long)` : 년 더하기
  - `plussMonths(long)` : 월 더하기
  - `plusWeeks(long)` : 주 더하기
  - `plussDays(long)` : 일 더하기
  - `minusHours(long)` : 시간 빼기
  - `minusMinutes(long)` : 분 빼기
  - `minusSeconds(long)` : 초 빼기
  - `minusNanos(long)` : 나노초 빼기
  - `plusHours(long)` : 시간 더하기
  - `plusMinutes(long)` : 분 더하기
  - `plusSeconds(long)` : 초 더하기
- LocalDataTime 클래스를 이용해서 현재 컴퓨터의 날짜와 시간을 얻는 방법

  `LocalDateTime now = LocalDateTime.now();`

- DateTimeOperationExample 예제

  ```java
  package javaChap12.example06;

  import java.time.LocalDateTime;
  import java.time.format.DateTimeFormatter;

  public class DateTimeOperationExample {
      public static void main(String[] args) {
          LocalDateTime now = LocalDateTime.now();
          DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
          System.out.println(now.format(dtf));

          LocalDateTime result1 = now.plusYears(1);
          System.out.println("1년 더하기 : " + result1.format(dtf));

          LocalDateTime result2 = now.minusHours(1);
          System.out.println("1시간 빼기 : " + result2.format(dtf));

          LocalDateTime result3 = now.plusDays(6);
          System.out.println("6일 더하기 : " + result3.format(dtf));
      }
  }
  ```

4. 날짜와 시간 비교

- LocalDateTime 클래스는 날짜와 시간을 비교할 수 있는 메소드도 제공한다.

  - `boolean isAfter(other)` : 이후 날짜인지
  - `boolean isBefore(other)` : 이전 날짜인지
  - `boolean isEqual(other)` : 동일 날짜인지
  - `long until(other, unit)` : 주어진 단위(unit) 차이를 리턴

- 특정 날짜와 시간으로 LocalDateTime 객체를 얻는 방법
  `LocalDateTime target = LocalDateTime.of(year, month, dayOfMonth, hour, minute, second);`

- DateTimeCompareExample 예제

  ```java
  package javaChap12.example06;

  import java.time.LocalDateTime;
  import java.time.format.DateTimeFormatter;
  import java.time.temporal.ChronoUnit;

  public class DateTimeCompareExample {
      public static void main(String[] args) {
          DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");

          LocalDateTime startDateTime = LocalDateTime.of(2023, 1, 1, 0, 0, 0);

          System.out.println("시작일 : " + startDateTime.format(dtf));

          LocalDateTime endDateTime = LocalDateTime.of(2023, 12, 31, 0, 0, 0);

          System.out.println("종료일 : " + endDateTime.format(dtf));

          if(startDateTime.isBefore(endDateTime)) {
              System.out.println("진행중입니다.");
          }else if(startDateTime.isEqual(endDateTime)) {
              System.out.println("종료합니다.");
          }else if(startDateTime.isAfter(endDateTime)) {
              System.out.println("종료했습니다.");
          }
          long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
          long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
          long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
          long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
          long remainMinute = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
          long remainSecond = startDateTime.until(endDateTime, ChronoUnit.SECONDS);

          System.out.println("남은 해 : " + remainYear);
          System.out.println("남은 월 : " + remainMonth);
          System.out.println("남은 일 : " + remainDay);
          System.out.println("남은 시간 : " + remainHour);
          System.out.println("남은 분 : " + remainMinute);
          System.out.println("남은 초 : " + remainSecond);
      }
  }
  ```

### 9. 형식 클래스

- Format(형식) 클래스는 숫자 또는 날짜를 원하는 형태의 문자열로 변환해주는 기능을 제공한다.
- Format 주요 클래스
  - `DecimalFormat` : 숫자를 형식화된 문자열로 변환
  - `SimpleDateFormat` : 날짜를 형식화된 문자열로 변환

1. DecimalFormat

- DecimalFormat은 숫자를 형식화된 문자열로 변환하는 기능을 제공하며, 다음과 같은 패턴을 사용한다.

  ![](https://mblogthumb-phinf.pstatic.net/20160107_271/rain483_1452157680736vtAjv_PNG/1.PNG?type=w2)

- 패턴 정보와 함께 DecimalFormat 객체를 생성하고 `format()` 메소드로 숫자를 제공하면 패턴에 따른 형식화된 문자열을 얻을 수 있다.

  ```java
  DecimalFormat df = new DecimalFormat("#,###.0");
  String result = df.format(1234567.89);
  ```

- DecimalFormatExample 예제

  ```java
  package javaChap12.example07;

  import java.text.DecimalFormat;

  public class DecimalFormatExample {
    public static void main(String[] args) {
      double num = 1234567.89;

      DecimalFormat df;

      df = new DecimalFormat("#,###");
      System.out.println(df.format(num));

      df = new DecimalFormat("#,###.00");
      System.out.println(df.format(num));
    }
  }
  ```

1. SimpleDateFormat

- SimpleDateFormat은 날짜를 형식화된 문자열로 변환하는 기능을 제공하며, 다음과 같은 패턴을 사용한다.

  ![](https://mblogthumb-phinf.pstatic.net/20160107_61/rain483_14521583552198iIfo_PNG/3.PNG?type=w2)

- 패턴에는 자리수에 맞게 기호를 반복해서 작성할 수 있으며, 패턴 정보와 함께 SimpleDateFormat 객체를 생성하고 `format()` 메소드로 날자를 제공하면 패턴과 동일한 문자열을 얻을 수 있다.

  ```java
  SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
  String strDate = sdf.format(new Date());
  ```

- SimpleDateFormatExample 예제

  ```java
  package javaChap12.example07;

  import java.text.SimpleDateFormat;
  import java.util.Date;

  public class SimpleDateFormatExample {
    public static void main(String[] args) {
      Date now = new Date();

      SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
      System.out.println(sdf.format(now));

      sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
      System.out.println(sdf.format(now));

      sdf = new SimpleDateFormat("오늘은 E요일");
      System.out.println(sdf.format(now));
      // D = 월 구분이 없는 일(1~365)
      sdf = new SimpleDateFormat("올해의 D번째 날");
      System.out.println(sdf.format(now));

      sdf = new SimpleDateFormat("오늘은 M월의 W번재 주");
      System.out.println(sdf.format(now));
    }
  }
  ```
