package DataAccessLayer.Abstract;

import Entities.Concrete.Campaign;
import Entities.Concrete.Game;

public interface IGameDal extends ICrudDal<Game> {

    Game getCampaignedGame(Campaign campaign);
}
