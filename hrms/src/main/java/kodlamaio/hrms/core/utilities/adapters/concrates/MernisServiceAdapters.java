package kodlamaio.hrms.core.utilities.adapters.concrates;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.utilities.adapters.abstracts.MernisService;

//import java.rmi.RemoteException;
//import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
//import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
@Service
public class MernisServiceAdapters implements MernisService{
	@Override
	public boolean mernisCheck() {
//		KPSPublicSoap mernis = new KPSPublicSoapProxy();
//		try {
//			return mernis.TCKimlikNoDogrula(Long.parseLong(identityNum), firstName,
//					lastName, birthday);
//		} catch (NumberFormatException | RemoteException e) {
//			e.printStackTrace();	
//		}
		return	true;
	}
}
