package patternVisiteur;

public class Voiture extends Vehicule {
	@Override
	public void accepterNouvelleCharge(VisitorChargeur chargeur) {
		chargeur.accepterNouvelleCharge(this);
	}
}
