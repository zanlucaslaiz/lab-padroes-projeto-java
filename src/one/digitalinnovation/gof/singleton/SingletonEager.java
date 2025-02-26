package one.digitalinnovation.gof.singleton;

/**
 * Singleton "apressado".
 * 
 * @author falvojr
 * atribui a instancia direto, sem verificação.
 */
public class SingletonEager {

	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}
