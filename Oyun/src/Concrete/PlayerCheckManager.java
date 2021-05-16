package Concrete;

import Oyun.Abstract.PlayerCheckService;
import Oyun.Entities.Player;

public class PlayerCheckManager implements PlayerCheckService {

	@Override
	public boolean CheckIfRealPerson(Player player) {
		return true;
	}

}
