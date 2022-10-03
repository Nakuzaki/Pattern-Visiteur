package patternVisiteur;

import java.util.ArrayList;

public class SandBox {

	public static void main(String[] args) {
		ArrayList<Vehicule> vehicules = new ArrayList<Vehicule>();
		
		ChargeBaggages chargeBaggages = new ChargeBaggages(15);
		ChargeBaggages chargeBaggages1 = new ChargeBaggages(1);
		
		ChargePassager chargePassager = new ChargePassager();
		
		vehicules.add(new Voiture());
		vehicules.add(new Moto());
		
		for (Vehicule vehicule : vehicules) {
			vehicule.accepterNouvelleCharge(chargePassager);
			System.out.println("Charge actuel de passager :" + vehicule.getNbrPassager());
			vehicule.accepterNouvelleCharge(chargePassager);
			System.out.println("Charge actuel de passager :" + vehicule.getNbrPassager());
			vehicule.accepterNouvelleCharge(chargePassager);
			System.out.println("Charge actuel de passager :" + vehicule.getNbrPassager());
			
			vehicule.accepterNouvelleCharge(chargeBaggages);
			System.out.println("Charge actuel de baggages (en kg) :" + vehicule.getNbrBaggages());
			
			vehicule.accepterNouvelleCharge(chargeBaggages1);
			System.out.println("Charge actuel de baggages (en kg) :" + vehicule.getNbrBaggages());
			
			

		}

	}

}
