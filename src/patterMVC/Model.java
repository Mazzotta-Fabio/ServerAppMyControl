package patterMVC;

public class Model implements OttieniDatiModel{
	
	private double x;
	private double y;
	private String opMDP;
	private String azione;
	private char carattere;
	private String opzioneSelezione;
	private String opSistema;
	private String funzionalità;
	
	public Model(){
		x=0;
		y=0;
	}
	
	public void settaValori(String cmd){
		String [] parole=cmd.split(" ");
		funzionalità=parole[0];
		switch(funzionalità){
		case "mouse":
			azione=parole[1];
			opzioneSelezione=parole[2];
			break;
		case "mouseMuovi":
			x=Double.parseDouble(parole[1]);
			y=Double.parseDouble(parole[2]);
			azione=parole[3];
			break;
		case "tastiera":
			carattere=parole[1].charAt(0);
			opzioneSelezione=parole[2];
			break;
		case "gestioneMDP":
			opMDP=parole[1];
			break;
		case "gestionePC":
			opSistema=parole[1];
			break;
		}
	}

	public String getFunzionalità(){
		return funzionalità;
	}
	
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public String getOpMDP() {
		return opMDP;
	}

	public String getAzione() {
		return azione;
	}

	public String getOpSistema() {
		return opSistema;
	}

	public char getCarattere() {
		return carattere;
	}
	
	public String getOpzioneSelezione(){
		return opzioneSelezione;
	}
}
