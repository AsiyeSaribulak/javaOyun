package Concrete;

import Oyun.Abstract.PlayerCheckService;
import Oyun.Abstract.PlayerService;
import Oyun.Entities.Player;

public  class Playermanager implements PlayerService {
	PlayerCheckService PlayerCheckService; 
	public Playermanager(Oyun.Abstract.PlayerCheckService playerCheckService) {
		
		PlayerCheckService = playerCheckService;
	}

	@Override
	public void Save(Player player) {
		if(PlayerCheckService.CheckIfRealPerson(player)) {
			System.out.println("Oyuncu kaydedildi : " + player.getFirstName() + " " + player.getLastName());
		} else
		{
			System.out.println("böyle bir kiþi bulunamamaktadýr. ");
		}
	}

	@Override
	public void Update(Player player) {
		if(PlayerCheckService.CheckIfRealPerson(player)) {
			System.out.println("Oyuncu bilgileri güncellendi : " + player.getFirstName() + " " + player.getLastName());
		} else
		{
			System.out.println("böyle bir kiþi bulunamamaktadýr. ");
		}
	}

	@Override 
	public void Remove(Player player) {
		if(PlayerCheckService.CheckIfRealPerson(player)) {
			System.out.println("Oyuncu silindi : " + player.getFirstName() + " " + player.getLastName());
		} else
		{
			System.out.println("böyle bir kiþi bulunamamaktadýr. ");
		}
	}
	public boolean Check(Player player) {
		if(PlayerCheckService.CheckIfRealPerson(player)) {
			return true;
		} else 
		{
			return false;
		}
		
	}


}
