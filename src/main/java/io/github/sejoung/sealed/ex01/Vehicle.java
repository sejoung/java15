package io.github.sejoung.sealed.ex01;

public abstract sealed class Vehicle permits Car, Truck {

	protected final String registrationNumber;

	public Vehicle(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

}
