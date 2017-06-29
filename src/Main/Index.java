package Main;

import Impl.ActivityImpl;
import Impl.Person;
import Interface.Activity;
import Relation.Father;
import Relation.Son;

/**
 * 統一呼叫
 * @author dogocreat
 *
 */
public class Index {

	public static void main(String[] args){
		doPolymorphism();
		doOverLoading();
		doInterfaceImpl();
		doAbstactExtend();
		doInstanceAndNewDiff();
	}
	
	/**
	 * Instance and New Diff
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	private static void doInstanceAndNewDiff(){
		
		try {
			Person Iperson = Person.class.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Person person = new Person("Tang");
	}
	
	
	/**
	 * 使用抽象類別實作繼承
	 * Abstact Class
	 */
	private static void doAbstactExtend(){
		Person person = new Person();
		person.Run();
		person.Jump();
		person.Sit();
	}
	
	
	/**
	 * Interface 介面實作
	 */
	private static void doInterfaceImpl() {
		Activity activity = new ActivityImpl();
		activity.Run();
	}
	
	/**
	 * Polymorphism 多型
	 * 父類別與子類別之多型.
	 * 父類別可以可以變形為任何子類別.
	 * 子類別之間不可以互指, 更不可以指向父類別.
	 */
	private static void doPolymorphism(){
		Father father = new Father();
		father.Walk();
		Father son = new Son();
		son.Walk();
	}
	
	/**
	 * OverLoading 多載
	 * 參數數目不同
	 * 參數數目雖然相同, 但至少有一個資料型態不同
	 * 參數數目與資料型態雖然都相同, 但參數排列順序不同.
	 */
	private static void doOverLoading(){
		Son son = new Son();
		son.Eat();
		son.Eat("Beef");
	}

}
