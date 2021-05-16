package Oyun.Abstract;

import Oyun.Entities.Player;

public interface PlayerService {
	void Save(Player player);
	void Update(Player player);
	void Remove(Player player);
}
