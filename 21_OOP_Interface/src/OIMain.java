// 다형성(polymorphism)

interface Coffee{ // 인터페이스 상속할때 임플리멘트 
	
	 abstract void name();
	 void price();// 인터페이스에 적는 메소드는 abstract 메소드다.
	 default void hotOrIced() {// 반드시 구현하지 않아도 ㄱㅊ
		 System.out.println("물어봐야 하는 항목인가.");
	 }
}
class Espresso implements Coffee{

	@Override
	public void name() {
		System.out.println("에스프레소");
	}
	@Override
	public void price() {
		System.out.println("2000");
		
	}
	
}
class Cafelatte implements Coffee{
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
		Coffee.super.hotOrIced();
		System.out.println("ice or hot");
	}
	
	
}
class Vanilatltte implements Coffee{
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
		Coffee.super.hotOrIced();
		System.out.println("ice or hot");
	}
}
class Frappuccino implements Coffee{
	@Override
	public void name() {
		System.out.println("프라프치노");
	}
	@Override
	public void price() {
		System.out.println("5000");
		
	}
}
public class OIMain {
	public static void main(String[] args) {
		
		// 커피  
		// hot,ice 
		// 에스프레소 
		// 카페라떼 
		// 바닐라 라떼
		// 프라프치노 
	Coffee coffee;
	coffee = new Espresso();
	coffee.name();
	coffee.price();
	System.out.println("=================");
	coffee = new Cafelatte();
	coffee.name();
	coffee.price();
	System.out.println("=================");
	coffee = new Vanilatltte();
	coffee.name();
	coffee.price();
	System.out.println("=================");
	coffee = new Frappuccino();
	coffee.name();
	coffee.price();
		
	//Espresso e1 = new Espresso();
	//	e1.name();
	//	e1.price();
	//	System.out.println("-------------------");
	//	Cafelatte c1 = new Cafelatte();
	//	c1.name();
	//	c1.price();
	//	System.out.println("-------------------");
	//	Vanilatltte v1 = new Vanilatltte();
	//	v1.name();
	//	v1.price();
	//	System.out.println("-------------------");
	//	Frappuccino f1 = new Frappuccino();
	//	f1.name();
	//	f1.price();
		
	
	}

}
