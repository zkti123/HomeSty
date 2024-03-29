package com.green.javaHome.sty.study_one.blakjack;

public class Dealer extends User {
    private final int CAN_RECEIVE_POINT = 16;

    public Boolean isReceiveCard() {
        return getPointSum() <= CAN_RECEIVE_POINT;
    }

    @Override
    public void showCard() {
        System.out.println("====딜러===");
        super.showCard();
    }
}
