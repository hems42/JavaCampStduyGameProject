package Entities.Concrete;

import Entities.Abstract.BaseCampaign;
import Entities.Abstract.IEntity;

public class Game implements IEntity {

    private int id;
    private String name;
    private double price;
    private String detail;
    private String currencyUnit="TL";

    public String getCurrencyUnit() {
        return currencyUnit;
    }

    public void setCurrencyUnit(String currencyUnit) {
        this.currencyUnit = currencyUnit;
    }

    private BaseCampaign baseCampaign;

    public Game(BaseCampaign baseCampaign) {
        this.baseCampaign = baseCampaign;
    }

    public Game() {
    }

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

    public double getPrice() {
        if(baseCampaign !=null)
        {
            System.out.println( "FİYAT ÖZETİ:  "+ name+ "  isimli oyun için "+ baseCampaign.getName() +
                    " kampanyası dahilinde "
                    +price+" "+currencyUnit
                    +" yerine "+"(-->%"+baseCampaign.getRateOfDiscount()+"<--) "+((baseCampaign.getRateOfDiscount()*price)/100) +" "+currencyUnit
                    + "indirim ile \n"
            + " yeni fiyat : "+ (price - ((baseCampaign.getRateOfDiscount() * price) / 100))+" olarak güncellenmiştir" );
        }
        else{
            System.out.println(name+ " isimli oyun için fiyat bilgisi : "+ price+ " "+ currencyUnit + " dir.");
        }
        return baseCampaign !=null?price-((baseCampaign.getRateOfDiscount()*price)/100): price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
