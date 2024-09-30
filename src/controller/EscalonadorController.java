package controller;

import br.edu.fateczl.fila.Fila;
import model.Processo;

public class EscalonadorController {
 
	public EscalonadorController() {
	super();
	}
	public void escalonador(Fila<Processo>fila)
	{
		
		
		while(!fila.isEmpty())
		{
			try {
			Processo aux=fila.remove();	
			if(aux.getQtdRetornos()==1)
			{
			System.out.println(aux);
			}
			else if(aux.getQtdRetornos()>1)
			{
				System.out.println(aux);
				aux.setQtdRetornos(aux.getQtdRetornos()-1);
				fila.insert(aux);
			}
			
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
}
