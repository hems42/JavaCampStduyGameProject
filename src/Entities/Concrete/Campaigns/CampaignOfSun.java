package Entities.Concrete.Campaigns;

import Entities.Abstract.BaseCampaign;

public class CampaignOfSun extends BaseCampaign {

    public CampaignOfSun() {
        this.setId(1);
        this.setName("Yaz Akşamı");
        this.setDetail("yaz akşamlarında kudurmuş gibi oynayın işte");
        this.setRateOfDiscount(35.0
        );
    }
}
