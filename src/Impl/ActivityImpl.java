package Impl;

import Interface.Activity;

/**
 * 活動實作
 * @author dogocreat
 *
 */
public class ActivityImpl implements Activity{

	@Override
	public void Run() {
		System.out.println(this.getClass().getName() + " Run Method");
	}

	@Override
	public void Jump() {
		System.out.println(this.getClass().getName() + " Jump Method");
	}

	@Override
	public void doAction() {
		// TODO Auto-generated method stub
		
	}

}
