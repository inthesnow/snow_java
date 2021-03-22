package collection.set;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.text.html.parser.Entity;

public class HashMapEx {
	public static void main(String[] args) {
	
		//Map - (키, 값)을 쌍으로 저장하는 구조, 키값은 고유하다
		//HashMap<K, V> map new HashMap<>(); 가능
		Map<Integer, String> map = new HashMap<>();
		
		//map에 추가하는 기능 put(키, 값)
		map.put(1, "hong");
		map.put(2, "lee");
		map.put(3, "kill");
		map.put(4, "shin");
	
		System.out.println("맵의 크기" + map.size());
		System.out.println(map.toString());
		
		//map에 같은 키에 저장시 같은 키의 값을 수정
		map.put(4, "kim");
		System.out.println(map.toString());
		
		//map에 저장된 value얻기 get(key)
		System.out.println("1번키에 해당하는 값 : " + map.get(1));
		//map의 값을 순차적으로 확인하고싶다면
		//keySet, entrySet을 이용해서 set형태로 바꿔서 사용
		Set<Integer> keySet = map.keySet(); //key만 뽑아서 Set으로 변경
		for(Integer i : keySet) {
			System.out.println(map.get(i));
		}
		Set<Entry<Integer, String>> entSet = map.entrySet();
		for(Entry<Integer, String> e:entSet) {
			//Entry안에 getKey(), getValue()를 이용해서 키값을 각각 얻을 수 있습니다.
			System.out.println(e.getKey()+":"+e.getValue());
		}
		//map의 있는 key여부 확인 containsKey(key)
		if(map.containsKey(3)) {//key사있다면t, 없으면f
			System.out.println("no.3 is free");			
		}
		
		//remove(key)
		map.remove(4);
		System.out.println(map.toString());
		
	}
}
