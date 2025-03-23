package restaurant;

//구체적인 음식 클래스: 피자
class Pizza extends Food implements Eatable {
	private String toppings;
	
	// 생성자
	public Pizza(String name, int calories, String toppings) {
	   super(name, calories);
	   this.toppings = toppings;
	}
	
	//생성자, 필드 3개 초기화
	public Pizza() {
		this("이화", 100, "기본토핑");
	}
	public String getToppings() {
	     return toppings;
	 }
	
	public void setTopping(String toppings) {
	     this.toppings = toppings;
	 }
	
	//추상 메서드 구현: 피자를 준비하는 방법
	@Override
	public void prepare() {
	  System.out.println(getName() + "를(을) " + toppings + " 토핑으로 준비 중입니다.");
	}
	
	
	
	//인터페이스 메서드 구현: 피자를 먹는 방법
	@Override
	public void eat() {
	  System.out.println(getName() + "를(을) 먹습니다. 맛있게 드세요!");
}
}
