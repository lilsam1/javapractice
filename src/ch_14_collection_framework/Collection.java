package ch_14_collection_framework;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 컬렉션 프레임워크
		 자바에서 제공하는 라이브러리. 자료구조를 사용해 객체들을 효율적으로 사용할 수 있도록 인터페이스와 구현 클래스를 java.util 패키지에서 제공
		 
		 *자료구조: 프로그램 실행 중 메모리에 자료를 유지, 관리하기 위해 사용
		 
		 컬렉션: 객체의 저장 - 메모리에
		 프레임워크: 사용 방법을 정해 놓은 라이브러리
		 
		 Collection 인터페이스와 Map 인터페이스 기반의 구조로 이루어져 있음
		 	하나의 자료를 모아서 관리하는데 필요한 기능을 제공하는 Collection 인터페이스
		 	쌍으로 된 자료들을 관리하ㅡㄴ데 유용한 기능을 제공하는 Map 인터페이스
		 	
		 1.Collection 인터페이스
		 	List 인터페이스 : 순서가 있는 자료 관리. 중복 허용. 인터페이스 구현 클래스 - ArrayList, Vector, LinkedList, Stack,Queue
		 	Set 인터페이스 : 순서가 정해져 있지않음. 중복 허용 X. 인터페이스 구현 클래스 - HashSet, TreeSet
		 	
		 1)List 컬렉션
		 	객체를 배열과 비슷하게 인덱스로 관리
		 	배열과의 차이점은 저장 용량(capacity)이 자동으로 증가하며 객체를 저장할 때 자동으로 인덱스가 부여
		 	추가, 삭제, 검색을 위한 다양한 메서드를 제공
		 	객체 자체를 저장하는 것이 아닌 객체의 번지를 참조
		 	
		 	=1.ArrayList
		 	저장되는 객체 수가 늘어나면 용량이 자동으로 증가
		 	인덱스를 활용한 접근이 빠름
		 	
		 	=2.Vector
		 	ArrayList와 동일한 내부 구조. 멀티  스레드 환경에서 안전한게 객체의 추가, 삭제 가능
		 	
		 	=3.LinkedList
		 	ArrayList와 사용 방법은 동일하지만 내부 구조는 완전히 다름
		 	
		 	*차이점
		 	ArrayList는 내부 배열에 객체를 저장해서 관리, 검색이 빠르고 순차로 추가/삭제는 빠르지만 중간부터의 추가/삭제는 느림
		 	LinkedList는 인접 참조를 링크해서 체인처럼 관리, 중간에 자료를 추가하거나 삭제하는 경우 ArrayList보다 더 빠름
		 	
		 	사용하는 자료의 변동이 많은 경우 LinkedList가 효율적이지만, 자료 변동이 거의 없는 경우에는 배열이 효율적
		 
		 2)Set 컬렉션
		 	중복되지 않게 자료를 관리. 저장 순서가 유지되지 않고 인덱스 관리 x - for문 사용 불가. foreach는 사용가능
		 	객체를 중복해서 저장할 수 없고, 하나의 null만 저장할 수 있음
		 	
		 	=1.HashSet
		 	객체들을 순서 없이 저장하고 동일한 객체는 중복 저장 X. 출력 결과는 입력순서에 상관없이 나옴
		 	저장전에 1) 객체의 hashCode() 메서드를 호출해 해시코드를 얻고 해시코드가 동일하면 2) equlas()를 통해 두 객체를 비교함
		 	
		 	=2.TreeSet
		 	자료의 중복을 허용X. 출력 결과 값은 정렬해서 나옴
		 	
		 2.Map 인터페이스
		 	key-value의 쌍으로 표현되는 자료를 관리하는 메서드들이 선언되어 있음. 이 때 키 값은 중복될 수 없음
		 	
		 	ex)
		 	key	| value
		 	이름	| 손민수
		 	
		 	Map은 기본적으로 검색용 자료 구조
		 	어떤 key 값을 알고 있을 떄 value를 찾기 위한 구조
		 	
		 1) Map 컬렉션 : 검색을 위한 자료구조
		 	
		 	=1.HashMap
		 	
		 	=2.HashTable
		 	
		 	=3.TreeMap
		 */

	}

}
