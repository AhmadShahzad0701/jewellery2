package com.ecommerce.jewelleryMart.strategy;

import java.util.HashMap;
import java.util.Map;

public class SortStrategyFactory {

    private static final Map<String, SortStrategy> STRATEGIES = new HashMap<>();

    static {
        STRATEGIES.put("priceLowToHigh", new PriceLowToHighStrategy());
        STRATEGIES.put("priceHighToLow", new PriceHighToLowStrategy());
        STRATEGIES.put("weight-asc", new WeightLowToHighStrategy());
        STRATEGIES.put("weight-desc", new WeightHighToLowStrategy());
    }

    public static SortStrategy getStrategy(String sort) {
        // Defensive programming to avoid runtime failure
        if (sort == null || !STRATEGIES.containsKey(sort)) {
            return STRATEGIES.get("priceLowToHigh"); // safe default
        }
    return STRATEGIES.get(sort);
    }
}
