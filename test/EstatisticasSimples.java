
public class EstatisticasSimples {

	public static double calculaValorMinimo(double[] valoresDeEntrada) {
		
		if( valoresDeEntrada [0] > valoresDeEntrada [1]);
		
		return valoresDeEntrada [1];
	}

	public static double calculaValorMaximo(double[] valoresDeEntrada) {
		
		if( valoresDeEntrada [0] > valoresDeEntrada [1]);
		
		return valoresDeEntrada [0];
	}

	public static int calculaQuantidade(double[] valoresDeEntrada) {
      int quantNumeros =  (int) valoresDeEntrada.length;
		
				
		return quantNumeros;
	}

	public static double calculaMedia(double[] valoresDeEntrada) {
		
		double media = 0;
		
		media = (valoresDeEntrada [0] + valoresDeEntrada [1])/2;
		
		return media;
	}

	public static double[] calcula(double[] valoresDeEntrada) {
		
		double valor[] = new double [4];
		valor[0] = calculaValorMinimo(valoresDeEntrada);
		valor[1] = calculaValorMaximo(valoresDeEntrada);
		valor[2] = calculaQuantidade(valoresDeEntrada);
		valor[3] = calculaMedia(valoresDeEntrada); 
				
		
		return valor;
	}

}
