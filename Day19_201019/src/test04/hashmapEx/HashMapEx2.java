package test04.hashmapEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx2 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("���ڹ�", 90);
		map.put("���ڹ�", 100);
		map.put("���ڹ�", 100);
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("�̸� : " + e.getKey() + ", ���� : " + e.getValue());
		}

	}

}
