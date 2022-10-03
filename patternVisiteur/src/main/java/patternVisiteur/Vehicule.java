package patternVisiteur;

public abstract class Vehicule {

	protected int nbrPassager;
	protected int nbrBaggages;
	
	
	public Vehicule() {
		super();
		this.nbrPassager = 0;
		this.nbrBaggages = 0;
	}


	public int getNbrPassager() {
		return nbrPassager;
	}


	public void setNbrPassager(int nbrPassager) {
		this.nbrPassager = nbrPassager;
	}


	public int getNbrBaggages() {
		return nbrBaggages;
	}


	public void setNbrBaggages(int nbrBaggages) {
		this.nbrBaggages = nbrBaggages;
	}
	
	public abstract void accepterNouvelleCharge(VisitorChargeur chargeur);
}
