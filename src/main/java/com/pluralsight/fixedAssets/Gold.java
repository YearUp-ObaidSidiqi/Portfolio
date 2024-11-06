package com.pluralsight.fixedAssets;
import com.pluralsight.FixedAsset;

public class Gold extends FixedAsset {

    private double weight;

    public Gold(String name, double marketValue, double weight) {
        super(name, marketValue);
        this.weight = weight;
    }

    @Override
    public double getValue() {
        return 0;
    }

}