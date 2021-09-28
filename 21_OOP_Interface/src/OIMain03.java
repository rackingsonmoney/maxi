import java.util.Scanner;

// 다형성(polymorphism)

interface Coffee3{ // 인터페이스 상속할때 임플리멘트 
	
	 abstract void name();
	 void price();// 인터페이스에 적는 메소드는 abstract 메소드다.
	 default void hotOrIced() {// 반드시 구현하지 않아도 ㄱㅊ
		
	 }
}
class Espresso3 implements Coffee3{

	@Override
	public void name() {
		System.out.println("에스프레소");
	}
	@Override
	public void price() {
		System.out.println("2000");
		
	}
	
}
class Cafelatte3 implements Coffee3{
	@Override
	public void name() {
		System.out.println("카페라떼");
	}
	@Override
	public void price() {
		System.out.println("3000");
		
	}
	@Override
	public void hotOrIced() {
		// TODO Auto-generated method stub
		Coffee3.super.hotOrIced();
		System.out.println("ice or hot");
	}
	
	
}
class Vanilatltte3 implements Coffee3{
	@Override
	public void name() {
		System.out.println("바닐라떼");
	}
	@Override
	public void price() {
		System.out.println("4000");
		
	}
	@Override
	public void hotOrIced() {
		// TODO Auto-generated method stub
		Coffee3.super.hotOrIced();
		System.out.println("ice or hot");
	}
}
class Frappuccino3 implements Coffee3{
	@Override
	public void name() {
		System.out.println("프라프치노");
	}
	@Override
	public void price() {
		System.out.println("5000");
		
	}
}
public class OIMain03 {
	public static void main(String[] args) {
		int num = 0;
		// 콘솔에 안내
		// 주문하시겠어요?
		// 1. 에스 2. 카페라떼 3. 바닐라 4. 프라푸치노 
		// 5. 돈이 없다. (break)
		// 그외 번호 입력시 -> 메뉴판에 없네요 
		// 2,3번 선택시  -> hot or ice 물어보기 
		// 나머지 메뉴 선택시 메뉴명, 가격 출력해주기 
		// sca, 반복문, if 
		Scanner k = new Scanner(System.in);
		while (true) {
		System.out.println("주문하시겠어요?");
		System.out.println("1.에스프레소 2.카페라떼 3.바닐라라떼 4. 프라푸치노");
		num = k.nextInt();
		
		Coffee3 coffee = null;
			if (num == 1) {
				coffee = new Espresso3();
				
			}else if (num ==2) {
				coffee = new Cafelatte3();
				coffee.hotOrIced();
			}else if (num == 3) {
				coffee = new Vanilatltte3();
				coffee.hotOrIced();
			}else if (num == 4) {
				coffee = new Frappuccino3();
				
			}else if (num == 5) {
					System.out.println("돈이없다");
					break;   
			}else {
				System.out.println("메뉴에 없네요");
				continue;// 여기에 걸리면 밑으로 안가고 위로 보냄 
			}
			coffee.name();
			coffee.price();
			}
		}		
	}

