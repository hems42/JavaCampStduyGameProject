package DataAccessLayer.Hibernate;

import DataAccessLayer.Abstract.ICampaignDal;
import Entities.Concrete.Campaign;

public class HibernateCampaingDal implements ICampaignDal {

    @Override
    public Campaign get(Campaign campaign) {
        Campaign campaign1= new Campaign();
        campaign1.setId(1);
        campaign1.setName("Ergenski Kampanyası");
        campaign1.setRateOfDiscount(45.0);
        return campaign1;
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println(campaign.getName()+ " kampanyası güncellendi");
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println(campaign.getName()+ " kampanyası silindi");

    }

    @Override
    public void add(Campaign campaign) {
        System.out.println(campaign.getName()+ " kampanyası eklendi");

    }
}
