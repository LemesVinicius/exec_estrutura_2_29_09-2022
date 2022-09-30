package view;

import java.text.DecimalFormat;
import java.util.Random;

import br.edu.fateczl.filaobj.*;
import model.Object;
import controller.OperacaoController;

public class Principal {

	public static void main(final String[] args) throws Exception {
		
	Fila fila = new Fila();
	
	Random rand = new Random();
	
	
	for(int i = 0; i < 20; i++) {
		
		Object obj = new Object();
		
		int randomNum;
		float randomFloat;
		String valorPecas;
		
		do {
			randomNum = rand.nextInt(51);
		}while(randomNum < 20);
		
		do {
			randomFloat = (float) ((float) rand.nextFloat()*(100.00-5.00));
		}while(randomNum < 20);
		
		
		valorPecas = new DecimalFormat("######.00").format(randomFloat);
		
		obj.nome = "cliente"+i;
		obj.QuantidadeDePecas = randomNum;
		obj.ValorPecas = Float.parseFloat(valorPecas.replace(',', '.'));
		
		fila.insert(obj);
		
	}
	
	OperacaoController OPCCTRL = new OperacaoController();
	
	OPCCTRL.caixa(fila);
		
	}
}