package DataAccessLayer.Hibernate;

import DataAccessLayer.Abstract.ICampaignDal;
import Entities.Abstract.BaseCampaign;
import Entities.Concrete.Campaigns.CampaignOfSun;

public class HibernateCampaingDal implements ICampaignDal {

    @Override
    public BaseCampaign get(BaseCampaign baseCampaign) {
        BaseCampaign baseCampaign1 = new CampaignOfSun(); // database similasyonu olarak..
        baseCampaign1.setId(1);
        baseCampaign1.setName("Ergenski Kampanyası");
        baseCampaign1.setRateOfDiscount(45.0);
        return baseCampaign1;
    }

    @Override
    public void update(BaseCampaign baseCampaign) {
        System.out.println(baseCampaign.getName()+ " kampanyası güncellendi");
    }

    @Override
    public void delete(BaseCampaign baseCampaign) {
        System.out.println(baseCampaign.getName()+ " kampanyası silindi");

    }

    @Override
    public void add(BaseCampaign baseCampaign) {
        System.out.println(baseCampaign.getName()+ " kampanyası eklendi");

    }
}
