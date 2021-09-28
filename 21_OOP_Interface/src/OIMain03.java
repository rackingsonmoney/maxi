import java.util.Scanner;

// ������(polymorphism)

interface Coffee3{ // �������̽� ����Ҷ� ���ø���Ʈ 
	
	 abstract void name();
	 void price();// �������̽��� ���� �޼ҵ�� abstract �޼ҵ��.
	 default void hotOrIced() {// �ݵ�� �������� �ʾƵ� ����
		
	 }
}
class Espresso3 implements Coffee3{

	@Override
	public void name() {
		System.out.println("����������");
	}
	@Override
	public void price() {
		System.out.println("2000");
		
	}
	
}
class Cafelatte3 implements Coffee3{
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
		Coffee3.super.hotOrIced();
		System.out.println("ice or hot");
	}
	
	
}
class Vanilatltte3 implements Coffee3{
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
		Coffee3.super.hotOrIced();
		System.out.println("ice or hot");
	}
}
class Frappuccino3 implements Coffee3{
	@Override
	public void name() {
		System.out.println("������ġ��");
	}
	@Override
	public void price() {
		System.out.println("5000");
		
	}
}
public class OIMain03 {
	public static void main(String[] args) {
		int num = 0;
		// �ֿܼ� �ȳ�
		// �ֹ��Ͻðھ��?
		// 1. ���� 2. ī��� 3. �ٴҶ� 4. ����Ǫġ�� 
		// 5. ���� ����. (break)
		// �׿� ��ȣ �Է½� -> �޴��ǿ� ���׿� 
		// 2,3�� ���ý�  -> hot or ice ����� 
		// ������ �޴� ���ý� �޴���, ���� ������ֱ� 
		// sca, �ݺ���, if 
		Scanner k = new Scanner(System.in);
		while (true) {
		System.out.println("�ֹ��Ͻðھ��?");
		System.out.println("1.���������� 2.ī��� 3.�ٴҶ�� 4. ����Ǫġ��");
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
					System.out.println("���̾���");
					break;   
			}else {
				System.out.println("�޴��� ���׿�");
				continue;// ���⿡ �ɸ��� ������ �Ȱ��� ���� ���� 
			}
			coffee.name();
			coffee.price();
			}
		}		
	}

