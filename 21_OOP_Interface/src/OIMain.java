// ������(polymorphism)

interface Coffee{ // �������̽� ����Ҷ� ���ø���Ʈ 
	
	 abstract void name();
	 void price();// �������̽��� ���� �޼ҵ�� abstract �޼ҵ��.
	 default void hotOrIced() {// �ݵ�� �������� �ʾƵ� ����
		 System.out.println("������� �ϴ� �׸��ΰ�.");
	 }
}
class Espresso implements Coffee{

	@Override
	public void name() {
		System.out.println("����������");
	}
	@Override
	public void price() {
		System.out.println("2000");
		
	}
	
}
class Cafelatte implements Coffee{
	@Override
	public void name() {
		System.out.println("ī���");
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
		System.out.println("�ٴҶ�");
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
		System.out.println("������ġ��");
	}
	@Override
	public void price() {
		System.out.println("5000");
		
	}
}
public class OIMain {
	public static void main(String[] args) {
		
		// Ŀ��  
		// hot,ice 
		// ���������� 
		// ī��� 
		// �ٴҶ� ��
		// ������ġ�� 
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
