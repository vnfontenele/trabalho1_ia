package trabalho1_ia;

public class Main {
	public static void main(String[] args) {	
		ResultadosTeste resultadosAEstrela = InteligenciaArtificial.aEstrela();
		System.out.println(resultadosAEstrela.toString());
		
		
		ResultadosTeste resultadosSmaEstrela = InteligenciaArtificial.smaEstrela();
		System.out.println(resultadosSmaEstrela.toString());
		
	}
}
