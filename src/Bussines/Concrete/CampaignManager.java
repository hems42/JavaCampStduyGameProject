package Bussines.Concrete;

import Bussines.Abstract.ICampaingService;
import DataAccessLayer.Abstract.ICampaignDal;
import Entities.Abstract.BaseCampaign;
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
    public void add(BaseCampaign baseCampaign) {
         useLog("eklendi", baseCampaign);

    }

    @Override
    public void delete(BaseCampaign baseCampaign) {
        useLog("silindi", baseCampaign);

    }

    @Override
    public void update(BaseCampaign baseCampaign) {
        useLog("güncellendi", baseCampaign);

    }

    @Override
    public void get(BaseCampaign baseCampaign) {
        useLog("getirildi", baseCampaign);

    }

    private void useLog(String  logMessage, BaseCampaign baseCampaign)
    {
        for(BaseLogger logger:loggers)
        {
            logger.log(baseCampaign.getName()+" isimli kampanya "+logMessage);
        }

        System.out.println(baseCampaign.getName()+ " isimli kampanya " +logMessage);
    }
}
