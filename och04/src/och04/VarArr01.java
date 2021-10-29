package och04;

public class VarArr01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] a = new int [3][];
		
		a[0] = new int [3];	//00, 01, 02
		a[1] = new int [2]; //10, 11
		a[2] = new int [4]; //20, 21, 22, 23
		
		a[0][0] = 7;	a[0][1] = 23;	a[0][2] = 71;
		a[1][0] = 23;	a[1][1] = 3;
		a[2][0] = 2;	a[2][1] = 21;	a[2][2] = 56;	a[2][3] = 71;
		
		for(int i =0 ; i<a.length ; i++) {
			System.out.println("a[i].length -> "+a[i].length);
			for(int j=0; j<a[i].length ; j++) {
				System.out.printf(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("=================================");
		
		for(int [] k :a) {
			for(int h : k) {
				System.out.printf(h+"\t");
			}
			System.out.println();
		}
		
		
		
	}

}
