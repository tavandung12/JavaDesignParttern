package com.tvd.designparttern.factory;

public class ShortcutView implements IconView {

	@Override
	public String getName() {
		return mName;
	}

	@Override
	public void setName() {
		
	}

	@Override
	public String getInfo() {
		return getClass().getSimpleName();
	}

	private String mName;
}