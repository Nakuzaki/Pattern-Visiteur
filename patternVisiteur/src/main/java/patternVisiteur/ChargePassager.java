package patternVisiteur;

public class ChargePassager implements VisitorChargeur {

	public void accepterNouvelleCharge(Voiture voiture) {
		if (voiture.getNbrPassager() < 4) {
			voiture.nbrPassager++;
		}
	}

	public void accepterNouvelleCharge(Moto moto) {
		if (moto.getNbrPassager() < 2) {
			moto.nbrPassager++;
		}
	}

}
