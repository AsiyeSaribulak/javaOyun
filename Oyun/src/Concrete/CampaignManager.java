package Concrete;

import Oyun.Abstract.CampaignService;
import Oyun.Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		if(campaign.getDiscountPercent()<0) {
			System.out.println("Böyle bir kampanya bulunmamaktadýr. ");
		} else
		{
			System.out.println("Kampanya eklendi indirim oraný : " + campaign.getDiscountPercent());
			System.out.println("Kuponu uygularak oyunu alabilirsin :) ");
		}
	}

	@Override
	public void update(Campaign campaign) {
		if(campaign.getDiscountPercent()<0) {
			System.out.println("Böyle bir kampanya bulunmamaktadýr. ");
		} else
		{
			System.out.println("Kampanya güncellendi indirim oraný : " + campaign.getDiscountPercent());
			System.out.println("Kuponu uygularak oyunu alabilirsin :) ");
		}		
	}

	@Override
	public void remove(Campaign campaign) {
		System.out.println("kampanya süresi dolmuþtur. Kampanya kaldýrýldý" );
	}

}
