package MQ2D;

public class Matriz 
{
	public static String[][] copiarEnUnaMatriz(String[][] query4, String[][] query1120, String[][] query1102,
												String[][] query1022, String[][] query0122, String[][] query1100,
												String[][] query1020, String[][] query1002, String[][] query0120,
												String[][] query0102, String[][] query0022)
	{
		/////////////////////////////////////////////////////////////////
		// copiar todas las matrices a una zona para eliminar duplicados
		/////////////////////////////////////////////////////////////////
		int columna = query4.length + query1120.length + query1102.length + query1022.length + query0122.length
				+ query1100.length + query1020.length + query1002.length + query0120.length + query0102.length
				+ query0022.length;
		String matriz[][] = new String[columna][4];

		int x = 0, i = 0, y = 0;
		for (int mx = 0; x < query4.length; mx++) {
			for (int my = 0; my < matriz[mx].length; my++) {
				matriz[mx][my] = query4[x][y];
				y++;
			}
			// si el siguiente dato de la matriz es null lo descartamos para publicarlo
			//System.out.println("query4[x+1][1]:" + query4[x + 1][1] + " mx:" + mx + " length:" + query4.length);
			if (query4[x + 1][1] == null) {
				x = query4.length;
			}
			x++;
			y = 0;
			i++; // contar el valor mx en general
		}

		x = 0;
		y = 0;

		for (int mx = i; x < query1120.length; mx++) {
			for (int my = 0; my < matriz[mx].length; my++) {
				matriz[mx][my] = query1120[x][y];
				y++;
			}
			// si el siguiente dato de la matriz es null lo descartamos para publicarlo
			if (query1120[x + 1][1] == null) {
				x = query1120.length;
			}
			x++;
			y = 0;
			i++; // contar el valor mx en general
		}

		x = 0;
		y = 0;

		for (int mx = i; x < query1102.length; mx++) {
			for (int my = 0; my < matriz[mx].length; my++) {
				matriz[mx][my] = query1102[x][y];
				y++;
			}
			// si el siguiente dato de la matriz es null lo descartamos para publicarlo
			if (query1102[x + 1][1] == null) {
				x = query1102.length;
			}
			x++;
			y = 0;
			i++; // contar el valor mx en general
		}

		x = 0;
		y = 0;

		for (int mx = i; x < query1022.length; mx++) {
			for (int my = 0; my < matriz[mx].length; my++) {
				//System.out.println("[1] x:" + x + " y:" + y + " my:" + my);
				matriz[mx][my] = query1022[x][y];
				//System.out.println("[2] query1022:" + query1022[x][y] + " mx:" + mx);
				//System.out.println("matriz[x].length:" + matriz[x].length);
				y++;
			}
			// si el siguiente dato de la matriz es null lo descartamos para publicarlo
			if (query1022[x + 1][0] == null) {
				//System.out.println("[3] mx:" + mx);
				x = query1022.length;
			}
			x++;
			y = 0;
			i++; // contar el valor mx en general
		}

		x = 0;
		y = 0;

		for (int mx = i; x < query0122.length; mx++) {
			//System.out.println("0122[1]");
			for (int my = 0; my < matriz[mx].length; my++) {
				matriz[mx][my] = query0122[x][y];
				y++;
			}
			// si el siguiente dato de la matriz es null lo descartamos para publicarlo
			if (query0122[x + 1][1] == null) {
				x = query0122.length;
			}
			x++;
			y = 0;
			i++; // contar el valor mx en general
		}

		x = 0;
		y = 0;

		for (int mx = i; x < query1100.length; mx++) {
			for (int my = 0; my < matriz[mx].length; my++) {
				matriz[mx][my] = query1100[x][y];
				y++;
			}
			// si el siguiente dato de la matriz es null lo descartamos para publicarlo
			if (query1100[x + 1][1] == null) {
				x = query1100.length;
			}
			x++;
			y = 0;
			i++; // contar el valor mx en general
		}

		x = 0;
		y = 0;

		for (int mx = i; x < query1020.length; mx++) {
			for (int my = 0; my < matriz[mx].length; my++) {
				matriz[mx][my] = query1020[x][y];
				y++;
			}
			// si el siguiente dato de la matriz es null lo descartamos para publicarlo
			if (query1020[x + 1][1] == null) {
				x = query1020.length;
			}
			x++;
			y = 0;
			i++; // contar el valor mx en general
		}

		x = 0;
		y = 0;

		for (int mx = i; x < query1002.length; mx++) {
			for (int my = 0; my < matriz[mx].length; my++) {
				matriz[mx][my] = query1002[x][y];
				y++;
			}
			// si el siguiente dato de la matriz es null lo descartamos para publicarlo
			if (query1002[x + 1][1] == null) {
				x = query1002.length;
			}
			x++;
			y = 0;
			i++; // contar el valor mx en general
		}

		x = 0;
		y = 0;

		for (int mx = i; x < query0120.length; mx++) {
			for (int my = 0; my < matriz[mx].length; my++) {
				matriz[mx][my] = query0120[x][y];
				y++;
			}
			// si el siguiente dato de la matriz es null lo descartamos para publicarlo
			if (query0120[x + 1][1] == null) {
				x = query0120.length;
			}
			x++;
			y = 0;
			i++; // contar el valor mx en general
		}

		x = 0;
		y = 0;

		for (int mx = i; x < query0102.length; mx++) {
			for (int my = 0; my < matriz[mx].length; my++) {
				matriz[mx][my] = query0102[x][y];
				y++;
			}
			// si el siguiente dato de la matriz es null lo descartamos para publicarlo
			if (query0102[x + 1][1] == null) {
				x = query0102.length;
			}
			x++;
			y = 0;
			i++; // contar el valor mx en general
		}

		x = 0;
		y = 0;

		for (int mx = i; x < query0022.length; mx++) {
			for (int my = 0; my < matriz[mx].length; my++) {
				matriz[mx][my] = query0022[x][y];
				y++;
			}
			// si el siguiente dato de la matriz es null lo descartamos para publicarlo
			if (query0022[x + 1][1] == null) {
				x = query0022.length;
			}
			x++;
			y = 0;
			i++; // contar el valor mx en general
		}
		
		return matriz;
	}
	
	// Quitar repetidos de la matriz
	public static String[][] quitarRepetidos(String[][] matriz)
	{
		//// Quitar repetidos de la matriz //////
		
		for (int c=0; c < matriz.length; c++)
		{
			for (int d=0; d < matriz.length-1; d++)
			{
				if (c != d && matriz[c][0] != null && matriz[d][0] != null)
				{
					System.out.println("-1- c:"+c+" d:"+d+" matriz[c]:"+matriz[c][0]+" matriz[d]"+matriz[d][0]);
					//System.out.println("matriz[c][0]:"+matriz[c][0]+" matriz[d][0]:"+matriz[d][0]);
					if (matriz[c][0].equals(matriz[d][0]))  /// comparamos string, de la forma == no entraba una comparacion igual de string
					{	
						System.out.println("-2- c:"+c+" d:"+d+" matriz[c]:"+matriz[c][0]+" matriz[d]"+matriz[d][0]);
						matriz[d][0] = null;
					}	
				}
			}
			//if (matriz[c+1][0] == null)
			if (c+1 == matriz.length)
			{
				c = matriz.length;
				//System.out.println("c+1 == null: "+matriz[c+1][0]);
			}
		}
		
		return matriz;
	}
	
	// imprimir el contenido de la matriz final
	public static String imprime(String[][] matriz)
	{
		//// mostrar los resultados guardados en la matriz ///
		
		String texto = "";
		for (int mx = 0; mx < matriz.length; mx++) 
		{
			if (matriz[mx][0] != null) // si el siguiente dato de la matriz es null lo descartamos para publicarlo
			{
				
				texto += " <a target=\"_blank\" href=\"" + matriz[mx][2] + "\">CASO " + matriz[mx][0] + " Dificultad " + 
						"						"+ SepararF.limpiarXml(matriz[mx][1]) + " </a>  <br>" + 
						"				"+matriz[mx][3] +"" + 
						"				<br>" + 
						"				"+Buscar.armarEcuacion(matriz[mx][0])+"" + 
						"				<br>" + 
						"				<br>";
				
			}

		}
		
		return texto;
	}
}
