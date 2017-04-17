package com.company.model;

import java.util.List;

/**
 * Created by arahis on 4/17/17.
 */
public class Results {
    private List<Rate> ratesList;

    public Results() {
    }

    public Results(List<Rate> ratesList) {
        super();
        this.ratesList = ratesList;
    }

    public List<Rate> getRatesList() {
        return ratesList;
    }

    public void setRatesList(List<Rate> ratesList) {
        this.ratesList = ratesList;
    }

    @Override
    public String toString() {
        return "Results{" +
                "ratesList=" + ratesList +
                '}';
    }
}
