import static org.junit.Assert.*;

import org.junit.Test;


public class estatisticaTest {


	
		@Test
		public void deveCalcularValorMinimoEntreDoisValores() {
			double valoresDeEntrada[] =  {9,5};
			double valorMinimoCalculado = EstatisticasSimples.calculaValorMinimo(valoresDeEntrada);
			assertEquals(5, valorMinimoCalculado, 0);
		}

	@Test
		public void deveCalcularValorMaximoEntreDoisValores() {
			double valoresDeEntrada[] =  {9,5};
			double valorMinimoCalculado = EstatisticasSimples.calculaValorMaximo(valoresDeEntrada);
			assertEquals(9, valorMinimoCalculado, 0);
		}

	@Test
		public void deveCalcularQuantidadeDeValores() {
			double valoresDeEntrada[] =  {9,5};
			int quantidadeDeValores = EstatisticasSimples.calculaQuantidade(valoresDeEntrada);
			assertEquals(2, quantidadeDeValores);
		}

		@Test
		public void deveCalcularMediaDeDoisValores() {
			double valoresDeEntrada[] =  {9,5};
			double mediaDeValores = EstatisticasSimples.calculaMedia(valoresDeEntrada);
			assertEquals(7, mediaDeValores, 0);
		}

		@Test
		public void deveEfetuarTodosCalculosParaDoisValores() {
			double valoresDeEntrada[] =  {9,5};
			double valoresDeSaida[] = EstatisticasSimples.calcula(valoresDeEntrada);
			assertArrayEquals(new double[] {5,9,2,7}, valoresDeSaida, 0);		
		}
		
		
		
		
	}