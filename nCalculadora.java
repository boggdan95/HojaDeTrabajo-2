import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 */

/**
 * @author Julio
 *
 */



public class nCalculadora implements Calculadora{
	
	private String linea;
	
	@Override
	public void readFile(String file) throws FileNotFoundException {
		// TODO Auto-generated method stub
		// tiene que tener el valor: file = "datos.txt"
		
		/**
		 * private String archivo = "datos.txt";
		 * nCalculadora calc = new nCalculadora();
		 * calc.readFile(archivo);
		 */
		FileReader fr = new FileReader(file);
		BufferedReader bf = new BufferedReader(fr);
		
		try {
			linea = bf.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(linea);
		
	}
	

	@Override
	public Object calcular() {
		// TODO Auto-generated method stub
		return null;
	}

}