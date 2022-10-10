package edu.ncsu.monopoly;
//updated 20222 with a comment
public abstract class Card {
//This is a test.
    public static final int TYPE_CHANCE = 1;
    public static final int TYPE_CC = 2;

    public abstract String getLabel();
    public abstract void applyAction();
    public abstract int getCardType();
}
