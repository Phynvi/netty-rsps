package com.runescape.revised.model.entity.update.impl;

public class Transform {

	private int id;
	
	public Transform(int id) {
		this.setID(id);
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public int getID() {
		return this.id;
	}
}