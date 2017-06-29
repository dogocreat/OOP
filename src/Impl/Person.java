package Impl;


public class Person extends AbstractActivity{

	/***********************多載建構子******************************/
	
	public Person() {
		System.out.println(this.getClass().getName() + " Person Constructor");
	}
	
	public Person(String name) {
		System.out.println(this.getClass().getName() + " " + name + " Person Constructor");
	}
	
	/*****************************************************/
	
	@Override
	public void Sit() {
		System.out.println(this.getClass().getName() + " Sit Method");
	}
	
	@Override
	public void Jump() {
		// TODO Auto-generated method stub
		super.Jump();
	}

}
