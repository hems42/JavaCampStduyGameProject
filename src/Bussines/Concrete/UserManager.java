package Bussines.Concrete;

import Bussines.Abstract.IUserService;
import DataAccessLayer.Abstract.ICampaignDal;
import Entities.Campaign;
import Entities.User;
import Logger.Abstract.BaseLogger;

public class UserManager implements IUserService {

    private ICampaignDal iCampaignDal;
    private BaseLogger[] loggers;

    public UserManager(ICampaignDal iCampaignDal) {
        this.iCampaignDal = iCampaignDal;
    }

    @Override
    public void add(User user) {
        useLog("eklendi",user);

    }

    @Override
    public void delete(User user) {
        useLog("silindi",user);

    }

    @Override
    public void update(User user) {

        useLog("güncellendi",user);


    }

    @Override
    public void get(User user) {
          useLog("getirildi",user);
    }

    private void useLog(String  logMessage, User user)
    {
        for(BaseLogger logger:loggers)
        {
            logger.log(user.getFullName()+" isimli kullanıcı "+logMessage);
        }

        System.out.println(user.getFullName()+" isimli kullanıcı "+logMessage);
    }
}
