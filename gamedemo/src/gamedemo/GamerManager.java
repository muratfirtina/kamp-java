package gamedemo;

public class GamerManager implements GamerService {
	
	GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
        this.gamerCheckService = gamerCheckService;
    }
	

	@Override
	public void add(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)==true){
            System.out.println("Kullanýcý Sisteme Kayýt Oldu "+gamer.getFirstName()+" "+gamer.getLastName());
        }
        else{
            System.out.println("Doðrulama Baþarýsýz");
        }
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName() + " Ýsimli Kullanýcý Silindi ");
		
	}

	@Override
	public void update(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)==true){
            System.out.println(gamer.getFirstName()+" "+gamer.getLastName() + " Kullanýcý Güncellendi ");
        }
        else{
            System.out.println("Güncellenmedi Kimlik Doðrulama Baþarýsýz");
        }
		
	}
	
}
