package com.sudas.inheritance;

public interface Connections {
	// BASTRACT METHODS
	void getGas();

	void getMoney();

	void getInternet();

	// DEFAULT METHOD
	default void mobileNumber() {

	}

	// STATIC METHOS
	static void housNO() {

	}

}
