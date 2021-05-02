package gamedemo;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.campaignName + " Ýsimli Kampanya Eklendi");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya Silindi");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya Güncellendi");
		
	}

}
