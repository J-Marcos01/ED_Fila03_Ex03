package view;

import br.edu.fateczl.fila.Fila;
import controller.EscalonadorController;
import model.Processo;

public class Principal {

	public static void main(String[] args) {
		
		String[] processos= {"notepad.exe","word.exe","excel.exe","paint.exe"};
		Fila<Processo> fila = new Fila<>();
		
		for(String item:processos)
		{
			Processo processo = new Processo(item,(int) (Math.random()*10)+1);
			fila.insert(processo);
		}
		
		EscalonadorController op = new EscalonadorController();
		op.escalonador(fila);
		
	}

}
