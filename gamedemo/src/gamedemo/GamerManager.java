package gamedemo;

public class GamerManager implements GamerService {
	
	GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
        this.gamerCheckService = gamerCheckService;
    }
	

	@Override
	public void add(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)==true){
            System.out.println("Kullan�c� Sisteme Kay�t Oldu "+gamer.getFirstName()+" "+gamer.getLastName());
        }
        else{
            System.out.println("Do�rulama Ba�ar�s�z");
        }
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName() + " �simli Kullan�c� Silindi ");
		
	}

	@Override
	public void update(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)==true){
            System.out.println(gamer.getFirstName()+" "+gamer.getLastName() + " Kullan�c� G�ncellendi ");
        }
        else{
            System.out.println("G�ncellenmedi Kimlik Do�rulama Ba�ar�s�z");
        }
		
	}
	
}
