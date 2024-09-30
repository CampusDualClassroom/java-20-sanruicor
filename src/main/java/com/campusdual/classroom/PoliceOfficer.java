package com.campusdual.classroom;

public class PoliceOfficer extends Person {

	protected String squad;

	public PoliceOfficer(String name, String surname, String squad) {
		super(name, surname);
		this.squad = squad;
	}

	@Override
	public void getDetails() {
		System.out.println("Oficial de policía: " + name + " " + surname + ", perteneciente a la brigada " + squad);
	}
}
