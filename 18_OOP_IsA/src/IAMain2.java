
public class IAMain2 {
	public static void main(String[] args) {
		// 필드 '직접' X private
		// 나중에 값 o, 생성때 o setter, 오버로딩 생성자 
		
		
		// 컴퓨터 : 이름, 가격
		//         cpu,  ram, hdd
		// 정보출력 
		Pc pc1 = new Pc(2,8,256);
        pc1.setName("Dell");
        pc1.setCost(100);
        pc1.info();
        System.out.println();
   // 슈클 필드가 private이 걸려있어서 상속이 안될텐데 어떻게 값 세팅되지?     
   // 필드는 상속을 못받지만 슈클에 있는 필드를 제외한 나머지(세터)는 사용가능하다(상속받았으니까) 
        
		// 볼펜 : 이름, 가격, 컬러
		// 정보출력
		Pen p1 = new Pen("black");
		p1.setName("zetstream");
		p1.setCost(500);
		p1.info();
		System.out.println();
		// 노트북 : 이름, 가격
		//        무게, 배터리 용량
		// 정보출력 
		Note n1 = new Note(500,600);
		n1.setName("Mac");
		n1.setCost(2000); 
		n1.info();

		
		
		
		
		
	}

}
