package gamedemo;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer = new Gamer();
		gamer.id = 1;
		gamer.firstName = "Murat";
		gamer.lastName = "FIRTINA";
		gamer.eMail = "murat@firtina.com";
		gamer.birthYear = 1983;
		gamer.identityId = "12345678910";
		
		GamerCheckService gamerCheckService = new GamerCheckManager();
		
		GamerManager gamerManager = new GamerManager(gamerCheckService);
		gamerManager.add(gamer);
		
		ProductManager productManager = new ProductManager();
		Product oyun = new Product(1,"FIFA2021",250);
		productManager.add(oyun);
		
		CampaignManager campaignManager =  new CampaignManager();
		Campaign kampanya = new Campaign(1,"Hayat Evde Sýkýlmasýn Kampanyasý", 20);
		campaignManager.add(kampanya);
		
		SalesManager salesManager = new SalesManager();
		salesManager.sell(gamer, kampanya, oyun);
		
		

	}

}
