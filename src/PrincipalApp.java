import java.util.ArrayList;

public class PrincipalApp {

	public static void main(String[] args) {

		ArrayList<Integer> edades = new ArrayList<Integer>();
		String resultado;
		int x;
		for(int i = 0; i < 10; i++) {
			x = (int)(Math.random()*100);
			edades.add(x);
		}
		
		AnalisisEdad a = new AnalisisEdad(edades);
		
		resultado = a.comprobarArray(edades);
		
		System.out.println(resultado);

	}

}