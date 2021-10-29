package och04;

public class MultiArr01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a = new int[2][3];
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 11;
		a[1][1] = 12;
		a[1][2] = 13;
		//				 행의 크기(0,1)
		for(int i = 0; i<a.length;i++) {		//행2
		//					각 행에 대한 열의 크기(0,1,2)
			for(int j=0; j<a[i].length;j++) {	//열3
				System.out.printf("일반 for "+a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("==================확장=====================");
		
		// 1차 : 왜 []이 들어가야 성립하는지 잘모르겟음 
		//해에 사이즈니까 행의 값을 가진게 1차원 배열 > 1차원 배열 > int [] 로 받아서 행을 표시 하고
		for(int[] k:a) {
		// 2차
			for(int h : k) {	//넘겨주는게 2차 각가의 열을 넘겨받았음 > 나머지 값 처리하는 것 // 그래서 k 에 대한 h
				System.out.printf("확장 for "+h+"\t");
			}
			System.out.println("");
		}
		
		
	}

}
