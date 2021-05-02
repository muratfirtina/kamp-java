package gamedemo;

public class SalesManager implements SalesService{

	@Override
	public void sell(Gamer gamer, Campaign campaign, Product product) {
		System.out.println(gamer.firstName + " Ýsimli oyuncu tarafýndan " +
	product.productName + " Adlý Oyun " + campaign.campaignName +
	" Kampanyasýndan faydalanýlarak " + " % "+campaign.discountRate + " Ýndirimle " +
	(product.productUnitPrice - (product.productUnitPrice*campaign.discountRate/100)) + " 'TL ye Alýnmýþtýr.");
		
	}

}
