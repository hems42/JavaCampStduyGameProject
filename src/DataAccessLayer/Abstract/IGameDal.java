package DataAccessLayer.Abstract;

import Entities.Abstract.BaseCampaign;
import Entities.Concrete.Game;

public interface IGameDal extends ICrudDal<Game> {

    Game getCampaignedGame(BaseCampaign baseCampaign);
}
