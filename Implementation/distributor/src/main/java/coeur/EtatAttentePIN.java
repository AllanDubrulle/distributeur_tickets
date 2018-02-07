package coeur;

class EtatAttentePIN extends ControleurEtat {
	public static EtatAttentePIN getInstance() {
		if (instance == null)
				instance = new EtatAttentePIN();
		return (EtatAttentePIN) instance;
	}
}
