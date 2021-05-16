package Concrete;

import Oyun.Abstract.SaleService;
import Oyun.Entities.Campaign;
import Oyun.Entities.Game;
import Oyun.Entities.Player;
import Oyun.Entities.Sale;

public class SaleManager implements SaleService{

	@Override
	public void sale(Player player, Game game) {
		if(player.getBalance()<0 && game.getPrice()<0)
		{
			System.out.println("�zg�n�z oyunu alamazs�n�z");
		} else
		{
			System.out.println(player.getUserName() + " adl� kullan�c� " + game.getGameName() + "oyununu bu fiyata sat�n ald�:  " + game.getPrice());
		}
	}

	@Override
	public void campaignsale(Campaign campaign, Player player, Game game) {
		double indirimliFiyat= game.getPrice()- (campaign.getDiscountPercent()/100);
		if(player.getBalance()<0 && game.getPrice()<0 && campaign.getDiscountPercent()<=0)
		{
			System.out.println("�zg�n�z oyunu alamazs�n�z");
		} else
		{
			System.out.println(player.getUserName() + " adl� kullan�c� " + game.getGameName() + "oyununu kupon uygulayarak bu fiyata sat�n ald�:  " + indirimliFiyat);
		}
	}


}
