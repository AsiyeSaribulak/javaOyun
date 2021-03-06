package Concrete;

import Oyun.Abstract.GameService;
import Oyun.Entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		if(game.getPrice()<0) {
			System.out.println("Maalesef" + game.getGameName() + " oyunu eklenemedi. ");
		
		} else
		{
			System.out.println("Oyun başarıyla eklendi : " + game.getGameName());
		}
	}

	@Override
	public void update(Game game) {
		if(game.getPrice()<0) {
			System.out.println("Maalesef" + game.getGameName() + " oyunu güncellenemedi. ");
		
		} else
		{
			System.out.println("Oyun başarıyla güncellendi : " + game.getGameName());
		}

	}

	@Override
	public void remove(Game game) {
		System.out.println("Oyun listeden kaldırıldı : " + game.getGameName());

	}

}
