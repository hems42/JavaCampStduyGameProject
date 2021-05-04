package DataAccessLayer.Hibernate;

import DataAccessLayer.Abstract.IGameDal;
import Entities.Campaign;
import Entities.Game;

public class HibernateGameDal implements IGameDal {
    @Override
    public Game get(Game game) {

        Game game1= new Game();
        game1.setId(1);
        game1.setName("Shrek Bahçelerde Geziyor");
        game1.setDetail("Shrek aynı bildiğimiz gibi hep hayvan...");
        game1.setPrice(200.0);


        return game1;
    }

    @Override
    public Game getCampaignedGame(Campaign campaign) {

        Game game1= new Game(campaign);
        game1.setId(1);
        game1.setName("Shrek Bahçelerde Geziyor");
        game1.setDetail("Shrek aynı bildiğimiz gibi hep hayvan...");
        game1.setPrice(200.0);


        return game1;
    }

    @Override
    public void update(Game game) {

        System.out.println(game.getName()+ "isimli oyun güncellendi");

    }

    @Override
    public void delete(Game game) {
        System.out.println(game.getName()+ "isimli oyun silindi");

    }

    @Override
    public void add(Game game) {
        System.out.println(game.getName()+ "isimli oyun eklendi");

    }
}
