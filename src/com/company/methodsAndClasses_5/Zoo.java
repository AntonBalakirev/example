package com.company.methodsAndClasses_5;

public class Zoo {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.name = "Barsik";
        myCat.age = 2;
        Cat otherCat = new Cat("Vasiliy", 1);
        Cat defaultCat = new Cat();
        Cat timofey = new Cat("Timofey", 4, true);
        System.out.println("Мы создали кота с именем " + myCat.name + " и возрастом " + myCat.age);
        System.out.println("Мы создали кота с именем " + otherCat.name + " и возрастом " + otherCat.age);
        System.out.println("Мы создали кота с именем " + defaultCat.name + " и возрастом " + defaultCat.age);
        myCat.sayMoew();
        String catVoice = myCat.sayMurr();
        System.out.println(catVoice);
        myCat.multipleNumbers(2,9);
        otherCat.sayMoew();
        System.out.println(otherCat.sayMurr());
        int result = otherCat.returnMultipleNumbers( 4, 7);
        System.out.println(result);
        System.out.println("Что говорит Тимофей?");
        if (timofey.hasTail){
            System.out.println(timofey.sayMurr());
        } else {
            timofey.sayMoew();
        }
    }
}
