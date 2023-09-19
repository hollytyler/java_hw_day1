package com.codebase;

public class WaterBottle {
    private int volume;
    public WaterBottle(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public int drink() {
        return getVolume() - 10;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public void empty() {
        setVolume(0);
    }

    public void fill() {
        setVolume(100);
    }
}
