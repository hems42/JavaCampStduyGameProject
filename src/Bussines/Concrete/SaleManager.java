package Bussines.Concrete;

import Bussines.Abstract.ISaleService;
import DataAccessLayer.Abstract.ISaleDal;
import Entities.Concrete.Sale;
import Logger.Abstract.BaseLogger;

public class SaleManager implements ISaleService {

    private ISaleDal iSaleDal;
    private BaseLogger [] loggers;

    public SaleManager(ISaleDal iSaleDal, BaseLogger[] loggers) {
        this.iSaleDal = iSaleDal;
        this.loggers = loggers;
    }

    @Override
    public void add(Sale sale) {
       useLog("eklendi",sale);
    }

    @Override
    public void delete(Sale sale) {
        useLog("silindi",sale);

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
