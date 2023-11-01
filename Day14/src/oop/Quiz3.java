package oop;

import java.util.Scanner;

class TV{// 필드, 생성자, 메서드 순으로 뭐가 들어가야하는지 생각해보기.
   boolean onoff;
   boolean nosori;
   int channel;
   int vol;
   int yejeonVol;
   
   // TV의 속성을 필드로 작성하세요.
   // 전원, 채널, 볼륨 그 외 필요하다고 생각하는 필드를 자유롭게 작성하세요.
   
   // TV의 기능을 메서드로 정의하세요.
   TV(){
      this.nosori = false;
      this.onoff = false;
      this.channel = 11;
      this.vol = 10;
   }
   
   void channelUp() {
      if(onoff == true) {
    	 if(channel <= 21) {
    		channel++;
    		System.out.printf("현재채널 : %d\n", channel); 
    	 }
    	 else {
    		channel = 1;
    		System.out.printf("현재채널 : %d\n", channel);
    	 }
      
      }
   }
   
   void channelDown() {
      if(onoff == true) {
         if(channel >= 2) {
            channel--;
            System.out.printf("현재채널 : %d\n", channel);
         }
         else {
        	channel = 20;
        	System.out.printf("현재채널 : %d\n", channel);
         }
      }
   }
   
   void volUp() {
      if(onoff == true) {
         if(vol < 20) {
            vol++;
            System.out.printf("현재볼륨 : %d\n", vol);            
         }
         else {
            System.out.println("볼륨을 더 이상 올릴 수 없습니다.");
         }
      }
   }
   
   void volDown() {
      if(onoff == true) {
         if(vol > 1) {
            vol--;
            System.out.printf("현재볼륨 : %d\n", vol);
         }
         else {
            System.out.println("볼륨을 더 이상 내릴 수 없습니다.");      
         }
      }
   }
   
   void turn() {
      onoff = !onoff;
      if(onoff == true) {
         System.out.println("전원이 켜졌습니다.");
//         onoff = !onoff;
      }
      else {
         
         System.out.println("전원이 꺼졌습니다.");
      }
      
   }
   
   void nosori() {
      if(onoff == true) {
    	  yejeonVol = vol;
//         System.out.println(previousVol);
         nosori = !nosori;
         if(nosori == true) {
            vol = 0;
            System.out.printf("현재볼륨 : %d\n", vol);
            vol = yejeonVol;
//            System.out.println(previousVol);
         }
         else {
            System.out.printf("현재볼륨 : %d\n", vol);
         }
         
      }
      
   }
   // 전원 on/off, 채널올림/내림, 볼륨올림/내림, TV상태 출력, 음소거
   // 채널은 일정 범위 안에서 cycle 형식으로 순환되어야 합니다.
   // 볼륨은 일정 범위 안에서 최소 최대치를 넘길 수 없습니다.
   // 음소거는 한 번 누르면 볼륨이 0이 되었다가 다시 누르면 원래 볼륨으로 복구되어야 합니다.
   // 대부분의 기능은 전원이 켜져있는 상태에서만 작동해야 합니다.
   
   // 생성자에서 객체 생성 시 초기값을 지정하세요.
   // 매개변수로 받지 않아도 초기값을 지정할 수 있습니다.
   // 예를 들면 채널의 초기값이 0인 것은 이상합니다. 다른 값이 초기값이 되도록 하세요.
   
}

public class Quiz3 {
	// 만들어진 TV 클래스의 객체를 생성하고
	// 사용자의 입력을 받아서, 입력에 따라 TV의 기능을 호출하는 클래스
	// (사용자) <-> (Main) <-> (TV)
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      TV tv = new TV();
      int menu;
      
      LOOP : while(true) {
         System.out.println("┌─────────────────────────┐");
         System.out.println("│                         │");
         System.out.print(" 1) on/off\n 4) channelUp\n 7) channelDown\n 6) volUp\n 9) volDown\n 8) MUTE\n 0) 종료\n");
         System.out.println("│                         │");
//           for (int i = 0; i < 6; i++) {
//               System.out.println("│                         │");
//           }
           
         System.out.println("└─────────────────────────┘");
         System.out.println("");
         System.out.print("선택 >>> ");
         menu = sc.nextInt();
         switch(menu) {
         case 6 :
            tv.volUp();
            break;
         case 9 :
            tv.volDown();
            break;
         case 8:
            tv.nosori();
            break;
         case 4 :
            tv.channelDown();
            break;
         case 7 :
            tv.channelUp();
            break;
         case 1 : 
            tv.turn();
            break;
         case 0 :
            break LOOP;
         }
      }
      sc.close();
      System.out.println("프로그램 종료");
   }

}