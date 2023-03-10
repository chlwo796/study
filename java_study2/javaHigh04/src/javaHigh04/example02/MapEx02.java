package javaHigh04.example02;

import java.util.HashMap;
import java.util.Map;

public class MapEx02 {

	public static void main(String[] args) {
		// 전화번호 -> 포인트, 주소 조회

		Map<String, Data> shopMap = new HashMap<String, Data>();
		Shop shop1 = new Shop("1111", new Data(100, "미사1동"));
		Shop shop2 = new Shop("1234", new Data(80, "미사12동"));
		Shop shop3 = new Shop("2222", new Data(90, "미사3동"));
		Shop shop4 = new Shop("2345", new Data(100, "미사4동"));
		Shop shop5 = new Shop("3333", new Data(70, "미사5동"));
		
		shopMap.put(shop1.getPhone(), shop1.getData());
		shopMap.put(shop2.getPhone(), shop2.getData());
		shopMap.put(shop3.getPhone(), shop3.getData());
		shopMap.put(shop4.getPhone(), shop4.getData());
		shopMap.put(shop5.getPhone(), shop5.getData());
		
		System.out.println(shopMap.get(shop1.getPhone()));
		Data shop1Data = shopMap.get(shop1.getPhone());
		System.out.println("고객 핸드폰 번호 " + shop1.getPhone());
		System.out.println("고객 포인트 " + shop1Data.getPoint());
		System.out.println("고객 주소 " + shop1Data.getAddress());
		
		Data shop4Data = shopMap.get(shop4.getPhone());
		System.out.println("고객 핸드폰 번호 " + shop4.getPhone());
		System.out.println("고객 포인트 " + shop4Data.getPoint());
		System.out.println("고객 주소 " + shop4Data.getAddress());
	}

}
