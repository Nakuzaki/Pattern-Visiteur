package patternVisiteur;

public class ChargeBaggages implements VisitorChargeur {

	private int poids;
	
	public ChargeBaggages(int poids) {
		super();
		this.poids = poids;
	}

	public void accepterNouvelleCharge(Voiture voiture) {
		if (poids < 50 && voiture.getNbrBaggages() < 200) {
			voiture.nbrBaggages += poids;
		}

	}

	public void accepterNouvelleCharge(Moto moto) {
		if (poids < 5 &&  moto.getNbrBaggages() < 15) {
			moto.nbrBaggages += poids;
		}
	}

}
