package Concrete;

import Oyun.Abstract.CampaignService;
import Oyun.Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		if(campaign.getDiscountPercent()<0) {
			System.out.println("B�yle bir kampanya bulunmamaktad�r. ");
		} else
		{
			System.out.println("Kampanya eklendi indirim oran� : " + campaign.getDiscountPercent());
			System.out.println("Kuponu uygularak oyunu alabilirsin :) ");
		}
	}

	@Override
	public void update(Campaign campaign) {
		if(campaign.getDiscountPercent()<0) {
			System.out.println("B�yle bir kampanya bulunmamaktad�r. ");
		} else
		{
			System.out.println("Kampanya g�ncellendi indirim oran� : " + campaign.getDiscountPercent());
			System.out.println("Kuponu uygularak oyunu alabilirsin :) ");
		}		
	}

	@Override
	public void remove(Campaign campaign) {
		System.out.println("kampanya s�resi dolmu�tur. Kampanya kald�r�ld�" );
	}

}
