package com.company.OOP_7;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone(2020, "Google");
        phone.call();
        phone.ring();

        WirelessPhone wirelessPhone = new WirelessPhone(2021, "Apple", 6);
        wirelessPhone.ring();
        wirelessPhone.call();
        wirelessPhone.call("8999999999");
        wirelessPhone.charge();

        IPhone iPhone = new IPhone(2022);
        iPhone.setHoursBeforeCharge(6);
        iPhone.getHoursBeforeCharge();
        iPhone.listenAppleMusic();

        AndroidPhone pixel = new AndroidPhone(2022, "Google", 10);
        pixel.call();
    }
}
