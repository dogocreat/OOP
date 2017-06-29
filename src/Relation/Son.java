package Relation;

/**
 * 子類別
 * @author dogocreat
 *
 */
public class Son extends Father{

	private int age;
	
	/**
	 * Overriding 覆寫
	 * 子類別覆寫所繼承父類別的方法
	 */
	@Override
	public void Walk() {
		System.out.println(this.getClass().getName() + " Walk Method");
//		super.Walk();
	}
	
	public void Eat(){
		System.out.println(this.getClass().getName() + " Eat Method");
	}
	
	public void Eat(String foodName){
		System.out.println(this.getClass().getName() + " Eat Method And Eat " + foodName);
	}
	
	/***************封裝存取私有實體變數**************************/
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	/***************封裝存取私有實體變數**************************/
}
