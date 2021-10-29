package och04;

public class MultiSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0;
		
		int [][] score = {{ 78, 87, 56}, { 98, 89, 67}, {70, 80, 90}};
		String [] title = {"국어", "영어", "수학", "합계", "평균"};
		String line = "======================================";
		
		for(String str : title) {
			System.out.printf(str+"\t");
		}
		System.out.println("\n"+line);
		
		for(int []sc:score) { //행
			for(int s : sc) { //열
				System.out.printf(s+"\t"); //국, 영, 수
				sum += s;	//한 사람당 합계 해당 행의 열끼리 합쳐짐
				
			}
			
			System.out.println(sum + "\t" + sum/sc.length); //합계, 평균
			sum = 0; //1행에서 다음으로 넘어가니까 초기화 시켜서 2행 합계 저장하고 반복
		}
	
	}

}
