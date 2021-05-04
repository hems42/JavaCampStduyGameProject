package DataAccessLayer.Abstract;

import Entities.Campaign;
import Entities.Game;

public interface IGameDal extends ICrudDal<Game> {

    Game getCampaignedGame(Campaign campaign);
}
