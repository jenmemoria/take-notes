package control;

import java.util.Random;
import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		int eleA, eleB, eleC, abso, floor;
		
		eleA = ran.nextInt(15) + 1;
		eleB = ran.nextInt(15) + 1;
		eleC = ran.nextInt(15) + 1;
		
		int locA, locB, locC, min;
		
		System.out.printf("%d, %d, %d\n", eleA, eleB, eleC);
		
		// 현재 자신의 위치를 1 ~ 15 사이로 입력한 다음
		// 가장 가까운 엘리베이터가 몇 번째인지 출력하는 코드를 작성.
		// (가장 가깝다 = 거리값이 최소이다 = 차이의 절대값이 최소값이다.)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("현자 자신의 위치를 1 ~ 15층 사이로 입력하세요 : ");
		floor = sc.nextInt();
	
		// 내 위치랑 엘리베이터 거리 구하기
		locA = floor - eleA;
		locB = floor - eleB;
		locC = floor - eleC;
		
		// 만약에 거리값이 음수면 절대값으로 고쳐주기

		if(locA < 0) {
			System.out.printf("eleA의 절대값 : %d\n", -locA);
			locA = -locA;
		}
		else {
			System.out.printf("eleA의 절대값 : %d\n" ,locA);
		}
		if(locB < 0) {
			System.out.printf("eleB의 절대값 : %d\n" ,-locB);
			locB = -locB;
		}
		else {
			System.out.printf("eleB의 절대값 : %d\n" ,locB);
		}
		if(locC < 0) {
			System.out.printf("eleC의 절대값 : %d\n" ,-locC);
			locC = -locC;
		}
		else {
			System.out.printf("eleC의 절대값 : %d\n" ,locC);
		}
		
		if (locA >= locB && locB > locC) {
			System.out.println("eleC 오는 중");
		}
		else if (locB >= locC && locC > locA) {
			System.out.println("eleA 오는 중");
		}
		else {
			System.out.println("eleB 오는 중");
		}
//		System.out.println(locA);
//		System.out.println(locB);
//		System.out.println(locC);
		
		
		// 3) 차이에 절대값 처리하기 => 거리
//		if(distA < 0)	distA = -distA;
//		if(distB < 0)	distB *= -1;
//		if(distC < 0)	distC *= -1;
		
		// 4) 거리 중에서 최소값 찾기
//		if(true)		min = distA;
//		if(min > distB)	min = distB;
//		if(min > distC)	min = distC;
		
		// 5) 최소값고 일치하는 엘리베이터에 대한 문장 출력하기
//		if(min == distA)			System.out.println("A 엘리베이터가 이동합니다.");
//		else if(min == distB)		System.out.println("B 엘리베이터가 이동합니다.");
//		else /*if(min == distC)*/	System.out.println("C 엘리베이터가 이동합니다.");
//		
		sc.close();
	}
}
