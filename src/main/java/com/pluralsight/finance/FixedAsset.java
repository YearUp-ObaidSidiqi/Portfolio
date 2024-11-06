package com.pluralsight.finance;

public abstract class FixedAsset implements IValuable {
    private String name;
    private double marketValue;

    public FixedAsset(String name, double marketValue){
        this.name = name;
        this.marketValue = marketValue;
    }

    public String getName() {
        return name;
    }

    public double getMarketValue() {
        return marketValue;
    }

    @Override
    public double getValue() {
        return 0;
    }


}