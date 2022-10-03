package patternVisiteur;

public class Moto extends Vehicule {
	@Override
	public void accepterNouvelleCharge(VisitorChargeur chargeur) {
		chargeur.accepterNouvelleCharge(this);
	}
}
