package restaurant;
import java.util.Scanner;

class Menu {
		Scanner key;
		private int getMenu() {
			//Scanner key = new Scanner(System.in);
			key = new Scanner(System.in);
			System.out.println("=========================================");		
			System.out.println("[1] Food");
			System.out.println("[2] Pizza");
			System.out.println("[3] Salad");
			System.out.println("[4] 종료");
			
			System.out.print(">>>>>>>>>>메뉴 선택 : ");	
			int menu = key.nextInt();
			return menu;
		}
		
	
		
		public void run(String user) {
			System.out.println("=========================================");	
			System.out.print("[ " + user + " ]");
			System.out.println();
		
			while(true) {
				int menu = getMenu();
				switch(menu) {
					case 2 : // 2. Pizza
						 Pizza pizza = new Pizza("마르게리타 Pizza", 300,
						  "토마토 소스, 신선한 모차렐라 치즈, 바질, 올리브 오일로 \n간단하면서도 전통적인 맛을 내는 피자.");
					     pizza.displayInfo();   // 음식 정보 출력
					     pizza.prepare();       // 피자 준비
					     pizza.eat();           // 피자 먹기
					     System.out.println();  // 줄바꿈
					     break;
					case 3 : // 3. Salad
						Salad salad = new Salad("Caesar Salad", 150, "로메인 상추, 크루통, 파마산 치즈");
					     salad.displayInfo();   // 음식 정보 출력
					     salad.prepare();       // 샐러드 준비
					     salad.eat();           // 샐러드 먹기
					     break;
					case 1 : // 1. Food
						System.out.println("<<Food 로 선언: up 캐스팅, down 캐스팅 사용 >>");
						System.out.print("1:Pizza, 2:Salad >> ");
						int num = key.nextInt();
						if (num == 1) {
							// up 캐스팅
							 Food pizza2 = new Pizza("고르곤졸라 Pizza", 300, "고르곤졸라 치즈를 기본으로 하고 \n꿀을 곁들여 달콤하면서 짭조름한 맛을 내는 피자.");
						     pizza2.displayInfo();   // 음식 정보 출력
						    // pizza2.prepare();      
						     Pizza ahn= (Pizza) pizza2;  // down 캐스팅
						     ahn.prepare(); 	 // 피자 준비
						     ahn.eat();           // 피자 먹기
						     System.out.println();  // 줄바꿈
						     break;				
		                   
		                } else if (num ==2){
		                	//up 캐스팅
		                	Food salad2 = new Salad("Green Salad", 100, "오이, 토마토, 양파 같은 신선한 야채");
						     salad2.displayInfo();   // 음식 정보 출력
						     //salad2.prepare();       
						     Salad ahn2 = (Salad)salad2;  //down 캐스팅
						     ahn2.prepare();	// 샐러드 준비
						     ahn2.eat();           // 샐러드 먹기
						     break;
		                } else {
		                	System.out.println("잘못 입력했습니다.");
		                }
						
						 
					     break;				
					
					case 4 : // 종료 메뉴
						System.out.println(user);
						System.out.println("오늘 하루 행복하세요. 고맙습니다.^^"); 
						return;		  //콜한 함수 위치로 돌아가는 것				
					default:
						System.out.println("다시 입력하세요!"); 
						continue;
				}
				
			}		
		}
}