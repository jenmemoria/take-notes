package control;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Ex05list {
	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int eleA, eleB, eleC, floor;
		int locA, locB, locC, min;
		
		eleA = ran.nextInt(15) + 1;
		eleB = ran.nextInt(15) + 1;
		eleC = ran.nextInt(15) + 1;
		
		System.out.printf("%d, %d, %d\n", eleA, eleB, eleC);
		System.out.println("현재 자신의 위치를 1 ~ 15층 사이로 입력하세요 : ");
		floor = sc.nextInt();
		
		// 내 위치랑 엘리베이터 거리 구하기
		locA = floor - eleA;
		locB = floor - eleB;
		locC = floor - eleC;
		
		ArrayList<Integer> dis = new ArrayList<>();
		dis.add(Math.abs(locA));
		dis.add(Math.abs(locB));
		dis.add(Math.abs(locC));
//		dis.add(locA);
//		dis.add(locB);
//		dis.add(locC);
//		
		System.out.println(dis);
		
		System.out.println("내 위치에서 가장 가까운 거리 : " + Collections.min(dis));
		
		if(true)		min = locA;
		if(min > locB)	min = locB;
		if(min > locC)	min = locC;
		
		if(min == Math.abs(locA))			System.out.println("A 엘리베이터가 이동합니다.");
		else if (min == Math.abs(locB))		System.out.println("B 엘리베이터가 이동합니다.");
		else /*if(min == distC)*/			System.out.println("C 엘리베이터가 이동합니다.");
		
		sc.close();
		
	}
}