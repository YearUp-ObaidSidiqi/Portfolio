package com.pluralsight.finance.fixedAssets;

import com.pluralsight.finance.FixedAsset;

public class House extends FixedAsset {
    private int yearBuilt;
    private int squareFeet;
    private int bedroom;

    public House(String name, double marketValue,int yearBuilt,int squareFeet,int bedroom) {
        super(name, marketValue);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedroom = bedroom;
    }

    @Override
    public double getValue() {
        return 0;
    }
}
