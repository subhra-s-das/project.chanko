package com.sudas.inheritance;

public class Computers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		House house = new BedRoom();
//BedRoom bedroom = new House();  //this is not allowed
		BedRoom bedroom = (BedRoom) house;
		
	}

}

class Kitchen implements Connections
{

	@Override
	public void getGas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getMoney() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getInternet() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mobileNumber() {
		// TODO Auto-generated method stub
		Connections.super.mobileNumber();
	}
}


class House
{
	String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}

class BedRoom extends House
{
	double size;
}