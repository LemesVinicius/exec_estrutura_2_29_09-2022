package controller;

import br.edu.fateczl.filaobj.*;
import model.Object;

public class OperacaoController {
	
	public void caixa (Fila fila) throws Exception {
		
		int tamanhofila = fila.size();
		
		for(int i = 0 ; i < tamanhofila ; i++ ){
			
			Object obj = (Object) fila.remove();
			
			System.out.println("Nome do cliente: "+ obj.nome +", Valor total da compra " + obj.QuantidadeDePecas * obj.ValorPecas );
			
		}
		
	}
	
}