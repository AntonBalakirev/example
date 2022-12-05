package com.company.OOP_7;

public class IPhone extends WirelessPhone{

    public IPhone(int year) {
        super(year, "Apple");
    }

    public IPhone(int year, int hoursBeforeCharge) {
        super(year, "Apple", hoursBeforeCharge);
    }

    public void listenAppleMusic(){
    }

}
