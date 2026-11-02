package personnages;

import java.util.Random;
import java.util.random.RandomGenerator;

public class Commercant {
	private Humain self;
	
	public int seFaireExtorquer() {
		int argent=self.getQuantiteArgent();
		self.setQuantiteArgent(0);
		return argent;
	}
}
