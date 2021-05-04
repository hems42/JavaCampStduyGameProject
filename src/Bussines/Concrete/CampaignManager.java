package Bussines.Concrete;

import Bussines.Abstract.ICampaingService;

import DataAccessLayer.Abstract.ICampaignDal;
import Entities.Concrete.Campaign;
import Logger.Abstract.BaseLogger;

public class CampaignManager implements ICampaingService {

    // Validasyon işlemleri de gerekiyor ama onu spring abimiz halletmiş özellikle de onunla uğraşmak stemedim
    // bu arad spring abimizbir çok şeyi halletmiş helali var bu alemede

   private ICampaignDal iCampaignDal;
   private BaseLogger [] loggers;

    public CampaignManager(ICampaignDal iCampaignDal, BaseLogger [] loggers) {
        this.iCampaignDal = iCampaignDal;
        this.loggers=loggers;
    }

    @Override
    public void add(Campaign campaign) {
         useLog("eklendi",campaign);

    }

    @Override
    public void delete(Campaign campaign) {
        useLog("silindi",campaign);

    }

    @Override
    public void update(Campaign campaign) {
        useLog("güncellendi",campaign);

    }

    @Override
    public void get(Campaign campaign) {
        useLog("getirildi",campaign);

    }

    private void useLog(String  logMessage,Campaign campaign)
    {
        for(BaseLogger logger:loggers)
        {
            logger.log(campaign.getName()+" isimli kampanya "+logMessage);
        }

        System.out.println(campaign.getName()+ " isimli kampanya " +logMessage);
    }
}
