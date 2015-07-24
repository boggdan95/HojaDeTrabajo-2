import java.io.FileNotFoundException;

public interface Calculadora {
	public void readFile(String file) throws FileNotFoundException;
	public <P> P calcular();

}
