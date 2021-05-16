package Oyun.Adapters;

import java.rmi.RemoteException;

import Oyun.Abstract.PlayerCheckService;
import Oyun.Entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServisAdapter implements PlayerCheckService {

	@Override
	public boolean CheckIfRealPerson(Player player) {
		KPSPublicSoapProxy client= new KPSPublicSoapProxy();
		boolean result=false;
		try {
			result=client.TCKimlikNoDogrula(Long.parseLong(player.getTc()),player.getFirstName().toUpperCase(),player.getLastName().toUpperCase(),player.getBirthday());
		} catch (NumberFormatException e) {
			System.out.println("gerçek bir kiþi deðil");
		} catch (RemoteException e) {
			System.out.println("gerçek bir kiþi deðil");
		}
		return result;
	}

}
