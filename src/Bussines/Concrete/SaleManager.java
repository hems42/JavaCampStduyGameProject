package Bussines.Concrete;

import Bussines.Abstract.ISaleService;
import DataAccessLayer.Abstract.ICampaignDal;
import Entities.Concrete.Sale;
import Logger.Abstract.BaseLogger;

public class SaleManager implements ISaleService {

    private ICampaignDal iCampaignDal;
    private BaseLogger [] loggers;

    public SaleManager(ICampaignDal iCampaignDal, BaseLogger[] loggers) {
        this.iCampaignDal = iCampaignDal;
        this.loggers = loggers;
    }

    @Override
    public void add(Sale sale) {
       useLog("eklendi",sale);
    }

    @Override
    public void delete(Sale sale) {
        useLog("silindis",sale);

    }

    @Override
    public void update(Sale sale) {
        useLog("güncellendi",sale);

    }

    @Override
    public void get(Sale sale) {
        useLog("getirildi",sale);

    }

    private void useLog(String  logMessage, Sale sale)
    {
        for(BaseLogger logger:loggers)
        {
            logger.log(sale.getDetail()+" " +logMessage);
        }

        System.out.println(sale.getDetail()+" " +logMessage);
    }




}
