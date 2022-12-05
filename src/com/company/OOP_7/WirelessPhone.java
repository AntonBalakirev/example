package com.company.OOP_7;

public class WirelessPhone extends Phone {

    private int hoursBeforeCharge;

    public WirelessPhone(int year, String company) {
        super(year, company);
    }

    public WirelessPhone(int year, String company, int hoursBeforeCharge) {
        super(year, company);
        this.hoursBeforeCharge = hoursBeforeCharge;
    }

    private void voltageTransformation(){
    }

    public void charge() {
        voltageTransformation();
        //  charging method
    }

    //переопределение
    @Override
    public void call() {
        System.out.println("Нажми на кнопки");
//        super.call();
        System.out.println("Вызываю");
    }

    //перегрузка
    public void call(String number) {
        System.out.println("Нажми на кнопки");
        super.call();
        System.out.println("Вызываю: " + number);
    }

    public int getHoursBeforeCharge() {
        return hoursBeforeCharge;
    }

    public void setHoursBeforeCharge(int hoursBeforeCharge) {
        this.hoursBeforeCharge = hoursBeforeCharge;
    }
}
