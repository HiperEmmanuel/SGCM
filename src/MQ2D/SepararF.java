package MQ2D;

import java.util.StringTokenizer;

public class SepararF 
{

	public static String[] Descomponer(String ecuacion) 
	{
		// TODO Auto-generated method stub
		String x="",
				y="",
				r="",
				xnum="",xden="",
				ynum="",yden="";
		String [] token = new String[11];
		Integer i,l;
		
		//StringTokenizer st = new StringTokenizer("x+y=13","=-+xy",true);
		StringTokenizer st = new StringTokenizer(ecuacion,"=-+xy",true);

        //System.out.println("Hay un total de: "+st.countTokens()+" tokens.");
        
        i = 0;
        l = 11 - st.countTokens();
        while (st.hasMoreTokens()) 
        {  
        	//System.out.println(st.nextToken());   
        	token[i] = st.nextToken();
        	
        	i++;
        }
        
        //System.out.println("---------ARREGLO--------");
        for (i=0;i< token.length - l; i++)
        {
        	//System.out.println(i + ":" +token[i]);
        	
        	if(token[i].charAt(0) == '-')
        	{
        		//System.out.println("menos");
        		if(isNumber(token[i+1]) )
        		{
        			//System.out.println("isNumber: " + token[i+1]);
        			
        			if(token[i+2].charAt(0) == 'x' || token[i+2].charAt(0) == 'X')
        			{
        				x=token[i] + token[i+1];  /// solo nos interesa el literal de X
        				i=i+2;
        				
        				/// descomponer la fraccion en numerador y denominador
        				String fraccion[] = numeradorDenominador(x);
        				xnum = fraccion[0];  // le agregamos el valor negativo (-) ya que se la quitamos al separar :p
        				if(fraccion[1] == null)  // denominador si no tiene le agregamos 1
        				{
        					fraccion[1]= "1";
        					xden = fraccion[1];
        				}
        				else
        				{
        					xden = fraccion[1];
        				}
        				
        				//System.out.println("X: " + x+" xnum:"+xnum+" xden:"+xden);
        			}
        			else
        			{
        				if(token[i+2].charAt(0) == 'y' || token[i+2].charAt(0) == 'Y')
        				{
        					y=token[i] + token[i+1];  // solo nos interesa el literal de Y
            				i=i+2;
            				
            				/// descomponer la fraccion en numerador y denominador
            				String fraccion[] = numeradorDenominador(y);
            				ynum = fraccion[0];
            				if(fraccion[1] == null)
            				{
            					fraccion[1]= "1";
            					yden = fraccion[1];
            				}
            				else
            				{
            					yden = fraccion[1];
            				}
            				
            				//System.out.println("Y: " + y+" ynum:"+ynum+" yden:"+yden);
        				}
        				else
        				{
        					xnum = "fail";  // para no permitir caracter diferente a x  y
        				}
        			}
        		}
        		else
        		{
        			if(token[i+1].charAt(0) == 'x' || token[i+1].charAt(0) == 'X')
        			{
        				x=token[i] + 1; // si no tiene literal es igual a -1
        				xnum=x;
        				xden="1";
        				i=i+1;
        				
        				
        				//System.out.println("X: " + x+" xnum:"+xnum+" xden:"+xden);
        			}
        			else
        			{
        				if(token[i+1].charAt(0) == 'y' || token[i+1].charAt(0) == 'Y')
        				{
        					y=token[i] + 1;  // si no tiene literal Y es igual a -1
        					ynum=y;
        					yden="1";
            				i=i+1;
            				
            				
            				//System.out.println("Y: " + y+" ynum:"+ynum+" yden:"+yden);
        				}
        				else
        				{
        					xnum = "fail";
        				}
        			}
        		}
        	}
        	else
        	{
        		if (token[i].charAt(0) == '=')
        		{
        			//System.out.println("igual");
        			if (token[i+1].charAt(0) == '-')
        			{
        				if (isNumber(token[i+2]))
        				{
        					r=token[i+1] + token[i+2]; // solo nos interesa el resultado -integer
            				i=i+2;
            				
            				//System.out.println("R: " + r);
        				}
        			}
        			else
        			{
        				if (isNumber(token[i+1]))
            			{
            				r=token[i+1];   // solo nos interesa el resultado positivo
            				i=i+1;
            				
            				//System.out.println("R: " + r);
            			}
        			}
        			
        			
        		}
        		else
        		{
        			if (token[i].charAt(0) == '+')
        			{
        				// no pasa nada, es positivo no pasamos al siguiente token
        			}
        			else
        			{
        				//System.out.println("mas");
                		if(isNumber(token[i]) )
                		{
                			//System.out.println("isNumber: " + token[i]);
                			
                			if(token[i+1].charAt(0) == 'x' || token[i+1].charAt(0) == 'X')
                			{
                				x=token[i];  // solo no sinteresa el literal de X
                				i=i+1;
                				
                				/// descomponer la fraccion en numerador y denominador
                				String fraccion[] = numeradorDenominador(x);
                				xnum = fraccion[0];  
                				if(fraccion[1] == null)  // denominador si no tiene le agregamos 1
                				{
                					fraccion[1]= "1";
                					xden = fraccion[1];
                				}
                				else
                				{
                					xden = fraccion[1];
                				}
                				
                				//System.out.println("X: " + x+" xnum:"+xnum+" xden:"+xden);
                			}
                			else
                			{
                				if(token[i+1].charAt(0) == 'y' || token[i+1].charAt(0) == 'Y')
                				{
                					y=token[i];   // solo nos interesa el literal de Y
                    				i=i+1;
                    				
                    				/// descomponer la fraccion en numerador y denominador
                    				String fraccion[] = numeradorDenominador(y);
                    				ynum = fraccion[0];
                    				if(fraccion[1] == null)
                    				{
                    					fraccion[1]= "1";
                    					yden = fraccion[1];
                    				}
                    				else
                    				{
                    					yden = fraccion[1];
                    				}
                    				
                    				//System.out.println("Y: " + y+" ynum:"+ynum+" yden:"+yden);
                				}
                				else
                				{
                					xnum = "fail";
                				}
                			}
                		}
                		else
                		{
                			if(token[i].charAt(0) == 'x' || token[i].charAt(0) == 'X')
                			{
                				x="1";   // el literal de  X es 1 asi que se pone 1
                				//i=i+1;
                				xnum="1";
                				xden="1";
                				
                				//System.out.println("X: " + x+" xnum:"+xnum+" xden:"+xden);
                			}
                			else
                			{
                				if(token[i].charAt(0) == 'y' || token[i].charAt(0) == 'Y')
                				{
                					y="1"; // el literal de Y es 1, asi que se pone literalmente
                    				//i=i+1;
                					ynum="1";
                					yden="1";
                    				
                    				//System.out.println("Y: " + y+" ynum:"+ynum+" yden:"+yden);
                				}
                				else
                				{
                					xnum="fail";
                				}
                			}
                		}
        			}
        			
        		}
        		
        		
        	}
        }
        
        return new String[] {xnum, xden, ynum, yden, r};
        
	}
	
	/// metodo para saber si un string es numero
	public static boolean isNumber(String s)
	{ 
		return s.toLowerCase() == s.toUpperCase();
	}
	
	//// metodo para obtener le numerado y denominador de una fraccion
	public static String[] numeradorDenominador (String fraccion)
	{
		String [] token = new String[2];
		
		StringTokenizer st = new StringTokenizer(fraccion,"/",false);
		
		Integer i = 0;
        //Integer l = 11 - st.countTokens();
        while (st.hasMoreTokens()) 
        {  
        	//System.out.println(st.nextToken());  
        	
        	token[i] = st.nextToken();
        	
        	i++;
        }
        
		return token;
	}
	
	public static String limpiarXml (String string)
	{
		String [] token = new String[2];
		
		StringTokenizer st = new StringTokenizer(string,"^",false);
		
		Integer i = 0;
        //Integer l = 11 - st.countTokens();
        while (st.hasMoreTokens()) 
        {  
        	//System.out.println(st.nextToken());  
        	
        	token[i] = st.nextToken();
        	
        	i++;
        }
        
		return token[0];
	}
	
	public static String quitarEspacio(String cadena) 
    {
        // Para el reemplazo usamos un string vacío 
        return cadena.replace(" ", ""); 
    }

	

}
