package week1day2;

import java.util.Arrays;

public class ScoreBoard {

	public static void main(String[] args) {

		int[] scores= {78,90,60,35,48,27,10,0,56,60,90};
		//to count the occurrence of the given num
		//int num=60;
		//int s=0;
		
		/*
		 * for(int i=0;i<scores.length;i++) { System.out.println(scores[i]);
		 * if(scores[i]==num) { s++;//0+1-->1+1==>2 } }
		 * System.out.println("The occurence of " +num+ "=" +s);
		 */
		
		Arrays.sort(scores);		
		for(int i=0;i<scores.length;i++) {
			for(int j=i+1;j<scores.length;j++) {		
			if(scores[i]==scores[j]) {
				System.out.println(scores[i]);				//break;//to stop the excution
							}
			}
		}
		
		
		
		
		
	}

}
