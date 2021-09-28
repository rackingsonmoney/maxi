import java.util.Random;

public class IMain3 {
	public static void main(String[] args) {
		
		// ·£´ý¼ýÀÚ (Â¦¼ö) 
		Random r = new Random();
		int a = r.nextInt(5);
		if (a % 2 == 0) {
			System.out.println(a);
		}
		System.out.println("--------------------");
		// Â¦¼ö¸¸ ·£´ýÀ¸·Î »Ì¾ÆÁÖ´Â ¹Ú½º 
		Box b = new Box();// °´Ã¼»ý¼º
		System.out.println(b.nextInt(3));
		
		//¾Æ·¡´Â ¹«Á¶°Ç Â¦¼ö¸¸ ³ª¿È 
		
	}

}
