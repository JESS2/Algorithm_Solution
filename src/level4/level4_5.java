//백준저지 알고리즘 4344

package level4;

import java.util.Scanner;

public class level4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt(); //테스트케이스 개수
		double[] result = new double[num];
		
		for(int i=0; i<num; i++) {
			int num2 = scanner.nextInt();
			
			int[] arr = new int[num2]; //학생의 수만큼의 길이를 갖고있는 점수 배열 arr 생성
			int sum = 0; //점수들의 합
			int avg = 0; //평균
			int cnt = 0; //평균을 넘는 학생의 수
			
			for(int j=0; j<num2; j++) {
				String input3 = scanner.next();
				arr[j] = Integer.parseInt(input3); //점수 배열 arr에 반복문으로 차례대로 점수들을 넣음
				sum += arr[j]; //점수들의 합 계산
			}
			
			avg = sum/num2; //평균 계산
			
			for(int j=0; j<num2; j++) {
				if(arr[j]>avg) {
					cnt++;
				}
			}
			
			 result[i] = (double)(cnt*100)/num2;
			
		}
		
		for(int i=0; i<num; i++) {
			System.out.printf("%.3f",result[i]);
			System.out.println("%");
		}

	}

}
