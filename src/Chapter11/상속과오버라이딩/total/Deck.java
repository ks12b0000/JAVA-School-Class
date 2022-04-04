package Chapter11.상속과오버라이딩.total;

public class Deck {
	
	final int CARD_NUM = 52;		//카드 총개수 (13*4)
	int i = 0;
	//카드 객체 배열(2차원 배열 형태)
	Card[] card = new Card[CARD_NUM];

	//인스턴스 초기화 블록 --52개 카드를 초기화
	{
		for(int k = Card.KIND_MAX; k > 0 ; k--) {     //카드 무늬
			for(int n = 1; n < Card.NUM_MAX+1; n++ ) {		//카드 번호 : 1부터 시작
				card[i++] = new Card(k, n);
			}
		}
		
		//초기화 내용 출력
		for(int j = 0; j < card.length; j++) {
			System.out.printf("Card[%d]의 무늬 : %d, Card[%d]의 숫자 : %d\n",
								j,card[j].kind,j,card[j].number);
		}
	}
	
	//생성자
	public Deck() {
		System.out.println("Deck 기본 생성자 호출");
	}
	
	//지정된 카드 하나를 선택한다 (pick() 메서드)
	public Card pick(int index){
		if(0 <= index && index < CARD_NUM) {
			return card[index];
		}else {
			return pick();
		}
	}
	
	public Card pick() {
		int index = (int)(Math.random()*CARD_NUM);
		System.out.print("임의로 뽑은 카드 => ");
		System.out.printf("%d번은 ",index);
		return pick(index);
	}

	//카드를 섞는 메서드   (shuffle() 메서드)
	 
	 public void shuffle() {
		
		 for(int n = 0; n < 1000; n++) {
			 //카드를 무작위로 섞음
			 int i = (int)(Math.random()*CARD_NUM);
			 Card temp = card[0];
			 card[0] = card[i];
			 card[i] = temp;
		 }
		 System.out.println("카드 섞은 후 결과");
			for(int j = 0; j < card.length; j++) {
				System.out.printf("Card[%d]의 무늬 : %d, Card[%d]의 숫자 : %d\n",
									j,card[j].kind,j,card[j].number);
			}
	}
	
	
}
