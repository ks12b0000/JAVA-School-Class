package Chapter13.추상클래스와인터페이스.total2;

/*
 * 인터페이스 활용해서 구현하시오.
 *    -고객센터에 전화상담을 하는 상담원들이 있습니다.
 *    - 일단 고객센터로 전화가 들어오면 대기열에 저장합니다.
 *    - 각 고객의 전화를 상담원에게 배분하는 정책은 여러방식으로 구현될수 있습니다.
 *    
 *    
 *      1) 순서대로 배분하기
 *         : 모든 상담원이 동일한 건수를 처리하도록 들어오는 순서대로 배분한다.
 *      2) 짧은 대기열을 찾아 배분하기
 *         : 고객 대기 시간을 줄이기 위해 상듬을 하지 않고 있거나 가장 짧게 대기열을 보유한 상담원에게 배분하기
 *      3) 우선 순위에 따라 배분하기
 *         : 고객의 등급에 따라 등급이 높은 고객의 전화를 우선 가져와 업무 능력이 좋은 상담원에게 우선 배분하기
 *         <출력예시>
 *         전화 상담원 할당방식을 선택하세요.
 *         R: 순서대로 배분하기
 *         L: 짧은 대기열을 찾아 배분하기
 * 		   P: 우선 순위에 따라 배분하기
 * 
 *         r
 *         상담 전화를 순서대로 대기열에서 가져옵니다.
 *         다음 순서의 상담원에게 배분합니다.
 *         
 *         l
 *         상담 전화를 순서대로 대기열에서 가져옵니다.
 *         현재 상담업무가 없거나 상담대기가 가장 적은 상담원에게 할당합니다.
 *         
 *         p
 *         고객등급이 높은 고객의 Call을 먼저 가져옵니다.
 *         업무 숙련도가 높은 상담원에게 먼저 배분합니다.
 *         
 *         외에 것을 누르면
 *         지원하지 않는 기능입니다.
 */

public interface Scheduler {

	void getNextCall();
	void sendCallToAgent();
}
