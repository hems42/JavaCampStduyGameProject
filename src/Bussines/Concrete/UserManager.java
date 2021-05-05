package Bussines.Concrete;

import Bussines.Abstract.ICheckPersonService;
import Bussines.Abstract.IUserService;
import DataAccessLayer.Abstract.IUserDal;
import Entities.Concrete.User;
import Logger.Abstract.BaseLogger;

public class UserManager implements IUserService {

    private IUserDal iUserDal;
    private BaseLogger[] loggers;
    private ICheckPersonService iCheckPersonService;

    public UserManager(IUserDal iUserDal,BaseLogger [] loggers,ICheckPersonService iCheckPersonService)
    {    this.loggers=loggers;
        this.iUserDal = iUserDal;
        this.iCheckPersonService=iCheckPersonService;
    }

    @Override
    public void add(User user) {

        if(iCheckPersonService.isValidPerson(user))
        {
            useLog("kaydedildi",user);
        }



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
