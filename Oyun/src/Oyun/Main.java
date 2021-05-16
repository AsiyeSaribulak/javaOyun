package Oyun;

import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.Playermanager;
import Concrete.SaleManager;
import Oyun.Adapters.MernisServisAdapter;
import Oyun.Entities.Campaign;
import Oyun.Entities.Game;
import Oyun.Entities.Player;
import Oyun.Entities.Sale;

public class Main {

	public static void main(String[] args) {
		Player player1=new Player(1,"Asiye","SARIBULAK","asiyeSrblk",2001,"11111111111",100);
		Playermanager playerManager = new Playermanager(new MernisServisAdapter());

		if(playerManager.Check(player1)) {
		Game game1=new Game(1,"pubge",50,"Savaþ oyunu");
		
		Campaign campaign1=new Campaign(1," Yeni Yýl Kampanyasý",10);
		
		Sale sale1=new Sale(1,player1,game1);
		
		//Playermanager playerManager = new Playermanager(new MernisServisAdapter());
		playerManager.Save(player1);		
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		
		SaleManager saleManager1 = new SaleManager();
		saleManager1.sale(player1, game1);
		
		SaleManager saleManager2 = new SaleManager();
		saleManager2.campaignsale(campaign1, player1, game1);

		} else 
		{
			System.out.println("Kiþi bulunamadý. Lütfen bilgileriniz kontrol edin");
		}
		
	}

}
