package restaurant;

//추상 클래스: 음식의 기본적인 속성을 정의
abstract class Food {
	private String name;
	private int calories;
	
	// 생성자
	public Food(String name, int calories) {
	   this.name = name;
	   this.calories = calories;
	}
	
	//생성자 , 필드 초기화
	public Food() {
		this("이화",100);
		//this.name = "이화";
		//this.calories = 100;
		
	}
	
	
	
	// 추상 메서드: 요리 방법 정의 (상속받는 클래스에서 구현)
	public abstract void prepare();

		//음식의 정보를 출력하는 메서드
	public void displayInfo() {
	  System.out.println("음식 이름: " + name);
	  System.out.println("칼로리: " + calories + " kcal");
	}
	
	 public String getName() {
	     return name;
	 }
	
	 public void setName(String name) {
	     this.name = name;
	 }
	
	 public int getCalories() {
	     return calories;
	 }
	
	 public void setCalories(int calories) {
	     this.calories = calories;
	 }
	
}