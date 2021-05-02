package gamedemo;

public class SalesManager implements SalesService{

	@Override
	public void sell(Gamer gamer, Campaign campaign, Product product) {
		System.out.println(gamer.firstName + " İsimli oyuncu tarafından " +
	product.productName + " Adlı Oyun " + campaign.campaignName +
	" Kampanyasından faydalanılarak " + " % "+campaign.discountRate + " İndirimle " +
	(product.productUnitPrice - (product.productUnitPrice*campaign.discountRate/100)) + " 'TL ye Alınmıştır.");
		
	}

}
