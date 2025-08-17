package com.cfs.Weather_App.dto;

import java.time.LocalDate;

public class DayTemp {

    private String  date;

    private Double miTemp;

    private  Double avgTemp;

    private Double maxTemp;

    public Double getAvgTemp() {
        return avgTemp;
    }

    public void setAvgTemp(Double avgTemp) {
        this.avgTemp = avgTemp;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(Double maxTemp) {
        this.maxTemp = maxTemp;
    }

    public Double getMiTemp() {
        return miTemp;
    }

    public void setMiTemp(Double miTemp) {
        this.miTemp = miTemp;
    }
}
