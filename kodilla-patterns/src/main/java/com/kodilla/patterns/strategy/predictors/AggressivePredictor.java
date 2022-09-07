package com.kodilla.patterns.strategy.predictors;

import com.kodilla.patterns.strategy.predictors.BuyPredictor;

public final class AggressivePredictor implements BuyPredictor {
    @Override
    public String predictWhatToBuy() {
        return "[Aggressive predictor] Buy stock of XYZ";
    }
}
