/**
 * @author ricardo, jaime, manuel
 * @version 8.2
 * @since 20/04/2022
 * 
 */

package tareaFinal;

public class TareaFinal {

	/**
	 * 
	 * @param letra
	 * @return letra convertida
	 */
	public static int hexADec(char letra){
        switch(letra){
            case 'A':
                return 10;
            case 'B':
                return 11;
            case 'C':
                return 12;
            case 'D':
                return 13;
            case 'E':
                return 14;
            case 'F':
                return 15;
            default:
                return Integer.parseInt(String.valueOf(letra));
        }
    }
    
    public static void main(String[] args) {
        //Pasar de hexadecimal a decimal
        String hexa="2C846";//Tiene que salir 182342
        double pos=0;
        int contador = 0;
        pos = extracted(pos, contador, hexa);
        String string = "El resultado es: ";
		System.out.println(string+(int)pos);
        
    }

    
    /**
     * 
     * @param pos. 
     * @param contador.
     * @param hexa. El numero hexadecimal que han pasado
     * @return pos.
     */
	private static double extracted(double pos, int contador, String hexa) {
		for(int i=hexa.length()-1;i>=0;i--){
            char letra=hexa.charAt(i);
            pos = (hexADec(letra) * Math.pow(16, contador))+pos;
            contador++;
        }
		return pos;
	}

}
