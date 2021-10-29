package och04;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		이름 국어 영어 수학 총점 평균
//		==============================================
//		안예은 90	80	70	
//		김소연 76	86	90
//		정선아 90 78 90
//		김준수 80 80 80
//		===============================================
//		합계
//		
		int sum=0;
		int [] tot = new int [3];
		String[] tit = {"이 름", "국어", "영어", "수학", "총점", "평균"};
		String[] name = {"안예은", "김소연", "정선아", "김준수"};
		int [][] score = {{90,80,70},{76,86,90},{90,78,90},{80,80,80}};
		
		System.out.println("\t\t 성적표 \n");		
		for(String t : tit) {
			System.out.print(t+"\t");
		}
		
		System.out.println();
		for(int i=0; i<48;i++) {
			System.out.printf("=");
		}
		
		System.out.println();
		for(int i=0; i<score.length; i++) {
			System.out.printf(name[i]+"\t");
			for(int j=0; j<score[i].length ; j++) {
				System.out.printf(score[i][j]+"\t");
				sum += score[i][j];		//사람별 합계
				tot[j] += score[i][j];	//과목별 합계(열별 합계)
			}
			
			System.out.println(sum + "\t" + sum/score[i].length);
			sum =0;
		}
		
		for (int i=0; i<48;i++) {
			System.out.printf("=");
		}
		System.out.println();
		System.out.printf("\n합 계 \t");
		
		for(int i=0; i< tot.length; i++) {
			System.out.printf(tot[i]+"\t");
			sum += tot[i];	//과목별 합계
		}
		System.out.println(sum +"\t"+ sum/tot.length);
		System.out.printf("평 균" +"\t");
		for(int i=0; i<tot.length;i++) {
			System.out.printf(tot[i]/name.length+"\t");
		}
		//				과목별 합계 / 사람수		(과목별합계/과목)/사람수
		System.out.println(sum/name.length+"\t"+sum/tot.length/name.length); //평균의 평균
		
		
	}

}
