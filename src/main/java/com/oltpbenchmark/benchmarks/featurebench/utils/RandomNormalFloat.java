package com.oltpbenchmark.benchmarks.featurebench.utils;

import java.util.List;
import java.util.Random;

public class RandomNormalFloat extends Random implements BaseUtil {

    private final double center;
    private final double deviation;

    public RandomNormalFloat(List<Object> values) {
        super((int) System.nanoTime());

        if (values.size() != 2) {
            throw new RuntimeException("Incorrect number of parameters for util function");
        }
        this.center = ((Number) values.get(0)).doubleValue();
        this.deviation = ((Number) values.get(1)).doubleValue();
    }

    /**
     * Returns a random normal distribution int value with average equal to center
     *
     */
    @Override
    public Object run() {
        double r = this.nextGaussian() * deviation + center;
        return r;
    }
}
