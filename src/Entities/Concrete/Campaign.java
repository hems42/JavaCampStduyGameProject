package Entities.Concrete;

import Entities.Abstract.IEntity;

public class Campaign implements IEntity {

    private int id;
    private String  name;
    private String detail;
    private double rateOfDiscount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double getRateOfDiscount() {
        return rateOfDiscount;
    }

    public void setRateOfDiscount(double rateOfDiscount) {
        this.rateOfDiscount = rateOfDiscount;
    }
}
