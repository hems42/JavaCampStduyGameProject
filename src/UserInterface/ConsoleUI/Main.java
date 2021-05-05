package UserInterface.ConsoleUI;

import Adapters.MernisCheckPersonManager;
import Bussines.Concrete.GameManager;
import Bussines.Concrete.SaleManager;
import Bussines.Concrete.UserManager;
import DataAccessLayer.Hibernate.HibernateGameDal;
import DataAccessLayer.Hibernate.HibernateSaleDal;
import DataAccessLayer.Hibernate.HibernateUserDal;
import Entities.Abstract.BaseCampaign;
import Entities.Concrete.Campaigns.CampaignOfSun;
import Entities.Concrete.Game;
import Entities.Concrete.Sale;
import Entities.Concrete.User;
import Logger.Abstract.BaseLogger;
import Logger.Concrete.DataBaseLogger;
import Logger.Concrete.SmsLogger;


public class Main {

    public static void main(String[] args) {

        // Burda her ne kadar bizden bir veritabanı vs bişey istenmese de ben varmı gibi
        // en azından katmanlarını ona göre hazırlamaya çalıştım
        //Elbette bilediğimiz çok şey var ama bu deemeyeceğiz de demek değil ya..
        // gerçek bir veri tabanı ve orm olmadığı için katmanları Hocamı üzecekte olsa
        // new lerle bağladım...


        BaseCampaign baseCampaign = new CampaignOfSun(); // abstract base class la hazır kampanya paketleri edkleyebiliyorum buda onlrdan biri
        BaseLogger [] loggers={new DataBaseLogger(),new SmsLogger()};

        User user= new User(1,"Ali","Yılmaz","01234567894","conicon");

        Game game= new Game(baseCampaign);


        game.setDetail("oyun işte");
        game.setId(1);
        game.setName("Adam asmaca");
        game.setPrice(360);

        Sale sale= new Sale();

        sale.setUser(user);
        sale.setGame(game);
        sale.setId(1);





        UserManager userManager= new UserManager(new HibernateUserDal(),loggers,new MernisCheckPersonManager());

        userManager.add(user);

        System.out.println("\n \n");

        GameManager gameManager= new GameManager(loggers,new HibernateGameDal());

        gameManager.add(game);

        System.out.println("\n");

        SaleManager saleManager= new SaleManager(new HibernateSaleDal(),loggers);

        saleManager.add(sale);








    }
}
