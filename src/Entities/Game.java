package Entities;

public class Game {

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

    private Campaign campaign;

    public Game(Campaign campaign) {
        this.campaign = campaign;
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
        if(campaign!=null)
        {
            System.out.println(name+ "isimli oyun için "+ campaign.getName() + " kampanyası dahilinde    "+((campaign.getRateOfDiscount()*price)/100) +" "+currencyUnit
                    + "indirim ile \n"
            + " yeni fiyat : "+ (price - ((campaign.getRateOfDiscount() * price) / 100))+" olarak güncellenmiştir" );
        }
        else{
            System.out.println(name+ " isimli oyun için fiyat bilgisi : "+ price+ " "+ currencyUnit + " dir.");
        }
        return campaign!=null?price-((campaign.getRateOfDiscount()*price)/100): price;
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
