package Oyun.Abstract;

import Oyun.Entities.Campaign;
import Oyun.Entities.Game;
import Oyun.Entities.Player;

public interface SaleService {
	void sale(Player player,Game game);
	void campaignsale(Campaign campaign,Player player,Game game);
}
