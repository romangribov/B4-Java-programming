package io.loop.test.day31_custom_classes.hw_day31.Offers;

public class UsingEmployee {

    public static void main(String[] args) {

        Offer offer1 = new Offer("Google", "Mountain View");
        System.out.println(offer1.toString());


        Offer offer2 = new Offer("Amazon", "Seattle", 120000);
        System.out.println(offer2.toString());


        Offer offer3 = new Offer("Apple", "Cupertino", 150000, true, 15);
        System.out.println(offer3.toString());


        offer3.goToMeeting();
    }
}
