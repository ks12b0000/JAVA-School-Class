package Chapter22.입출력.decorator;

/*
 * 아메리카노
 * 카페라떼 = 아메리카노 + 우유
 * 모카 커피 = 아메리카노 + 우유 + 모카시럽
 * 크림 올라간 모카 커피 = 아메리카노 + 우유 + 모카시럽 + 휘핑크림
 * 
 * => 커피 : 컴포넌트
 *    데코레이터 : 우유, 모카시럽, 휘핑크림 
 */

public abstract class Coffee {

	public abstract void brewing();

}
