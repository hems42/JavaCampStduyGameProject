package Bussines.Concrete;

import Bussines.Abstract.IGameService;
import DataAccessLayer.Abstract.IGameDal;
import Entities.Concrete.Game;
import Logger.Abstract.BaseLogger;

public class GameManager implements IGameService {

    private BaseLogger [] loggers;
    private IGameDal iGameDal;

    public GameManager(BaseLogger[] loggers, IGameDal iGameDal) {
        this.loggers = loggers;
        this.iGameDal = iGameDal;
    }

    @Override
    public void add(Game game) {

        useLog("eklendi",game);
    }

    @Override
    public void delete(Game game) {
        useLog("silindi",game);
    }

    @Override
    public void update(Game game) {
        useLog("güncellendi",game);
    }

    @Override
    public void get(Game game) {
        useLog("getirildi",game);
    }

    private void useLog(String  logMessage, Game game)
    {
        for(BaseLogger logger:loggers)
        {
            logger.log(game.getName()+" isimli oyun "+logMessage);
        }

        System.out.println(game.getName()+ " isimli oyun " +logMessage);
    }
}
