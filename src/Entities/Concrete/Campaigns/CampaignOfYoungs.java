package Entities.Concrete.Campaigns;

import Entities.Abstract.BaseCampaign;

public class CampaignOfYoungs extends BaseCampaign {

    public CampaignOfYoungs() {
        this.setId(1);
        this.setName("Gençlik Ateşi");
        this.setDetail("oynayın gençler siz işi bilirsiniz.... oynayın işte");
        this.setRateOfDiscount(25.0);
    }
}
