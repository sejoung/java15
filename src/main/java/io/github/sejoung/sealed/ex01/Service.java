package io.github.sejoung.sealed.ex01;

public sealed interface Service permits Car, Truck {

	int getMaxServiceIntervalInMonths();

	default int getMaxDistanceBetweenServicesInKilometers() {
		return 100000;
	}

}
