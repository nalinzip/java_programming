package restaurant;

//구체적인 음식 클래스: 샐러드
class Salad extends Food implements Eatable {
	private String dressing;
	
	// 생성자
	public Salad(String name, int calories, String dressing) {
	   super(name, calories);
	   this.dressing = dressing;
	}
	
	//생성자, 필드 3개
	public Salad() {
		this("이화", 100, "시저드레싱");
	}
	
	public String getDressing() {
	     return dressing;
	 }
	
	public void setCalories(String dressing) {
	     this.dressing = dressing;
	 }	
	//추상 메서드 구현: 샐러드를 준비하는 방법
	@Override
	public void prepare() {
	  System.out.println(getName() + "를(을) " + dressing + " 드레싱과 함께 섞고 있습니다.");
	}
	
	// 인터페이스 메서드 구현: 샐러드를 먹는 방법
	@Override
	public void eat() {
	  System.out.println(getName() + "를(을) 먹습니다. 건강을 위해 드세요!");
	}
}