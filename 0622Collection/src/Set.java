import java.util.HashSet;

public class Set {
	public static void main(String[] args) {
		
		//함수 : equals(), hashCode(), removeAll(), contains(값), remove(값), add(), size()
		
		String[] alphabet = {"a","b","c","d","e","f","g","g","a"};
		
		// HashSet
		HashSet<String> alphabetSet = new HashSet<>();
		HashSet<String> alphabetSet2 = new HashSet<>();
		
		for(String spell : alphabet) {
			alphabetSet.add(spell);
			alphabetSet2.add(spell);
		}
		
		// add, remove
		alphabetSet.add("z");
//		alphabetSet.add("Z");
//		alphabetSet.add("X");
//		alphabetSet.add("Y");
		alphabetSet.remove("z");
		// 해시코드 출력
		System.out.println(alphabetSet.hashCode());
		System.out.println(alphabetSet2.hashCode());
		// 안에 있는 원소 값이 동일 하면 hashcode는 동일
		
		
		// contains, size, equals
		System.out.println(alphabetSet);
		System.out.println(alphabetSet.contains("b"));
		System.out.println(alphabetSet.size());
		System.out.println(alphabetSet.equals(alphabetSet2));
		alphabetSet2.add("z");
		System.out.println(alphabetSet.equals(alphabetSet2));
		// set을 get을 할 이유가 없다.
		// 주 목적 : 존재하나?
		
		
		
		
	}
}
