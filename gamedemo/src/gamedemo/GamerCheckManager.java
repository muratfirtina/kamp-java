package gamedemo;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		
		if (gamer.identityId.length()==11) {
			return true;
		}
		return false;
		
	}

}
