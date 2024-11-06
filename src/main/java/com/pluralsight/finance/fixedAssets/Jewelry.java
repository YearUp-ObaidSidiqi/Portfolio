package com.pluralsight.finance.fixedAssets;
import com.pluralsight.finance.FixedAsset;

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
