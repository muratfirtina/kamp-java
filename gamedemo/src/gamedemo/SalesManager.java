package gamedemo;

public class SalesManager implements SalesService{

	@Override
	public void sell(Gamer gamer, Campaign campaign, Product product) {
		System.out.println(gamer.firstName + " �simli oyuncu taraf�ndan " +
	product.productName + " Adl� Oyun " + campaign.campaignName +
	" Kampanyas�ndan faydalan�larak " + " % "+campaign.discountRate + " �ndirimle " +
	(product.productUnitPrice - (product.productUnitPrice*campaign.discountRate/100)) + " 'TL ye Al�nm��t�r.");
		
	}

}
