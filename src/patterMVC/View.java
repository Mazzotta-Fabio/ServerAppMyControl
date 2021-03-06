package patterMVC;

import interfacciaGrafica.NotificaInterfaccia;
import patternFactory.Attivitą;
import patternFactory.GestoreFactory;

public class View {
	private GestoreFactory factoryAttivitą;
	private NotificaInterfaccia notifica;
	
	public View(GestoreFactory factoryAttivitą){
		this.factoryAttivitą=factoryAttivitą;
		notifica=Launcher.getFrame();
	}
	
	public void aggiornaWindow(String text){
		notifica.setText(text);
	}
	
	public void aggiornaInterfaccia(){
		Attivitą attivitą=factoryAttivitą.getAttivitą();
		if(attivitą!=null){
			attivitą.eseguiAttivitą();
		}
	}
}
