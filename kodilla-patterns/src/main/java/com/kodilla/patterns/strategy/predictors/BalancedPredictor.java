package com.kodilla.patterns.strategy.predictors;

import com.kodilla.patterns.strategy.predictors.BuyPredictor;

public final class BalancedPredictor implements BuyPredictor {
    @Override
    public String predictWhatToBuy() {
        return "[Balanced predictor] Buy shared units of Fund XYZ";
    }
}
