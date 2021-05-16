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
			System.out.println("üzgünüz oyunu alamazsýnýz");
		} else
		{
			System.out.println(player.getUserName() + " adlý kullanýcý " + game.getGameName() + "oyununu bu fiyata satýn aldý:  " + game.getPrice());
		}
	}

	@Override
	public void campaignsale(Campaign campaign, Player player, Game game) {
		double indirimliFiyat= game.getPrice()- (campaign.getDiscountPercent()/100);
		if(player.getBalance()<0 && game.getPrice()<0 && campaign.getDiscountPercent()<=0)
		{
			System.out.println("üzgünüz oyunu alamazsýnýz");
		} else
		{
			System.out.println(player.getUserName() + " adlý kullanýcý " + game.getGameName() + "oyununu kupon uygulayarak bu fiyata satýn aldý:  " + indirimliFiyat);
		}
	}


}
