package com.pluralsight.fixedAssets;
import com.pluralsight.FixedAsset;

public class Jewelry extends FixedAsset {

    private double karat;

    public Jewelry(String name, double marketValue, double karat) {
        super(name, marketValue);
        this.karat = karat;
    }


    @Override
    public double getValue() {
        return 0;
    }

}
