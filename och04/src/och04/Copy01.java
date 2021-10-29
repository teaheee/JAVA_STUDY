package och04;

public class Copy01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,2,3,4,5,6,7};
		int [] b = new int [10];
		
		pr(a);
		
//		for(int i=0; i<a.length ; i++) {
//			b[i] = a[i];
//		} //싦에서는 잘 안쓰임
		
		//				a베열 0 위치부터 b배열 0위치에	a배열 길이만큼 복사한다. 
		System.arraycopy(a,		0,		b,		0, a.length);
		
		System.out.println("=================================print b=================================");
		pr(b);
		cls(b);
		
		System.out.println("=================================print b2=================================");
		System.arraycopy(a, 0, b, 2, a.length);
		pr(b);
		cls(b);
		
		System.out.println("=================================print a 1=================================");
		System.arraycopy(a, 1, b, 0, a.length-1);
		pr(b);
		cls(b);
		
		System.out.println("=================================print a1 b3=================================");
		System.arraycopy(a, 1, b, 3, a.length-1);
		pr(b);
		cls(b);
	
		
		
	}
	
	public static void cls(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = 0;
		}
		//전부 0으로 초기화 해주는
		
	}
	
	public static void pr(int[] b) {
		
		for(int i=0; i<b.length; i++) {
			System.out.printf(b[i] + "\t");
		}
		System.out.println();
		// 그냥 배열 보여쥬는 
		
	}
	
	
}
