
public class IAMain2 {
	public static void main(String[] args) {
		// �ʵ� '����' X private
		// ���߿� �� o, ������ o setter, �����ε� ������ 
		
		
		// ��ǻ�� : �̸�, ����
		//         cpu,  ram, hdd
		// ������� 
		Pc pc1 = new Pc(2,8,256);
        pc1.setName("Dell");
        pc1.setCost(100);
        pc1.info();
        System.out.println();
   // ��Ŭ �ʵ尡 private�� �ɷ��־ ����� �ȵ��ٵ� ��� �� ���õ���?     
   // �ʵ�� ����� �������� ��Ŭ�� �ִ� �ʵ带 ������ ������(����)�� ��밡���ϴ�(��ӹ޾����ϱ�) 
        
		// ���� : �̸�, ����, �÷�
		// �������
		Pen p1 = new Pen("black");
		p1.setName("zetstream");
		p1.setCost(500);
		p1.info();
		System.out.println();
		// ��Ʈ�� : �̸�, ����
		//        ����, ���͸� �뷮
		// ������� 
		Note n1 = new Note(500,600);
		n1.setName("Mac");
		n1.setCost(2000); 
		n1.info();

		
		
		
		
		
	}

}
