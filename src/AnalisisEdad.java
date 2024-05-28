	import java.util.ArrayList;

	public class AnalisisEdad {

		ArrayList <Integer> x = new ArrayList<Integer>();

		public AnalisisEdad(ArrayList<Integer> x) {
			this.x = x;
		}

		public ArrayList<Integer> getX() {
			return x;
		}

		public void setX(ArrayList<Integer> x) {
			this.x = x;
		}

		public String comprobarArray(ArrayList<Integer> x) {
			int menores = 0, mayores = 0, jubilados = 0;
			String res;
			for(int i = 0; i < x.size(); i++) {
				if(i < 18) {
					menores ++;
				}
				else if(i > 18) {
					mayores ++;
				}
				else if(i > 65) {
					jubilados ++;
				}
			}
			res = "Menores de Edad: " + menores + ", Mayores de Edad: " + mayores + ", Jubilados: " + jubilados;
			return res;
		}
		
		@Override
		public String toString() {
			return "AnalisisEdad [x=" + x + "]";
		}
		
	}


}
