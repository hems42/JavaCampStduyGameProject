package Entities.Concrete.Campaigns;

import Entities.Abstract.BaseCampaign;

public class CampaignOfWinter extends BaseCampaign {

    public CampaignOfWinter() {
        this.setId(1);
        this.setName("Kış Güneşi");
        this.setDetail("uzun kış gecelerinde delirmiş gibi oynayın işte");
        this.setRateOfDiscount(55.0);
    }
}
