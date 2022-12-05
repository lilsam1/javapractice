package ch_06_method;

public class CallByRef_exam01 {
	/*참조에 의한 호출 방식
	매개변수의 타입이 참조형 타입일 때 사용
	참조에 의한 호출은 메서드 호출 시 참조 데이터의 위치가 매개변수에 전달
	
	값에 의한 호출은 메모리에 동일한 값을 복사 후 사용하지만
	참조에 의한 호출은 메모리의 주소를 넣기 때문에  값을 복사하지 않음
	*/
	
	/* 깊은 복사, 값 복사
	deep copy
	데이터 자체가 복사
	복사된 두 객체는 완전히 독립적인 메모리
	 */
	
	/* 얕은 복사, 참조 복사
	shallo copy
	주소값을 참조하는 방식
	 */
	public void increase(int[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] refArray = {100, 800, 1000};
		
		CallByRef_exam01 ref = new CallByRef_exam01();
		
		System.out.println("메서드 호출 전");
		for(int i = 0; i < refArray.length; i++) {
			System.out.println("refArray[" + i +"]: " + refArray[i]);
		}
		
		


	}

}
