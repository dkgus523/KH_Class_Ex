package sec01.exam06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		//Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//객체 저장
		map.put("아현이", 85);
		map.put("윤지양", 80);
		map.put("서우씨", 95);
		System.out.println("총 Entry 수 : " + map.size());

		//객체를 하나씩 처리
		Set<String> keySet = map.keySet();
		Iterator<String> KeyIterator = keySet.iterator();
		while(KeyIterator.hasNext()) {
			String key = KeyIterator.next();
			Integer value = map.get(key);
			System.out.println(key + ":" + value);
		}
	}

}
