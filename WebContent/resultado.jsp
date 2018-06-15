<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="MQ2D.Buscar" %>
<%@ page import="MQ2D.SepararF" %>
<%@ page import="MQ2D.Matriz" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Resultado de busqueda de S2e2X</title>
</head>
<body>
<H1 align=center> OMAK SYSTEM </H1>  
 <a href="buscar.jsp">  Regresar </a> <br> <br>
 
<%
	
   	String ecuacion1 = request.getParameter("ecuacion1");
   	String ecuacion2 = request.getParameter("ecuacion2");
%>
	Resultado de: 
<% 
					 out.println(ecuacion1);
					 out.println("&nbsp; &nbsp;"+ecuacion2);
					 
%> 
						<br> <br>
<%
   	
   	/// comprobar que los campos a buscar sean los correctos y no esten vacios
   	if (ecuacion1 == "" && ecuacion2 == "")
   	{
   		System.out.println(" **campos vacios**");
   		
   		//String matriz[][]=null;
   		out.print("Llene por lo menos 1 campos de una ecuacion con el valor de X y Y");
   		
   		//break;
   	}
   	else
   	{
   		if (ecuacion1 != "" && ecuacion2 == "")
   		{
   			System.out.println(" ecuacion1");	
   			
   			String result[] = SepararF.Descomponer(SepararF.quitarEspacio(ecuacion1));
				
			String xnum1 = result[0];
			String xden1 = result[1];
			String ynum1 = result[2];
			String yden1 = result[3];
			
			if (xnum1 == "fail")
			{
				out.print("Debe usar variables  X  Y");
				
			}
			else
			{
			
				String matriz[][] = Buscar.Encontrar1100(xnum1, xden1, ynum1, yden1);
			
				if (Matriz.imprime(matriz) == "")
				{
					out.print("Busqueda no encontrada");
				}
				else
				{
					out.print(Matriz.imprime(matriz)); // imprimir el el resultado de la busqueda
				}
			}
   		}
   		else
   		{
   			if (ecuacion1 == "" && ecuacion2 != "")
   			{
   				System.out.println(" ecuacion2");
   				
   				String result2[] = SepararF.Descomponer(SepararF.quitarEspacio(ecuacion2));
					
				String xnum2 = result2[0];
				String xden2 = result2[1];
				String ynum2 = result2[2];
				String yden2 = result2[3];
				
				if (xnum2 == "fail")
				{
					out.print("Debe usar variables  X  Y");
					
				}
				else
				{
				
					String matriz[][] = Buscar.Encontrar0022(xnum2, xden2, ynum2, yden2);
				
					if (Matriz.imprime(matriz) == "")
					{
						out.print("Busqueda no encontrada");
					}
					else
					{
						out.print(Matriz.imprime(matriz)); // imprimir el el resultado de la busqueda
					}
				}
   			}
   			else
   			{
   				if (ecuacion1 != "" && ecuacion2 != "")
   				{
   					System.out.println(" 2 ecuaciones");
   					
   					String result[] = SepararF.Descomponer(SepararF.quitarEspacio(ecuacion1));
   					
   					String xnum1 = result[0];
   					String xden1 = result[1];
   					String ynum1 = result[2];
   					String yden1 = result[3];
   					
   					//out.println("Ecuacion2:"+ecuacion2);
   					
   					String result2[] = SepararF.Descomponer(SepararF.quitarEspacio(ecuacion2));
   					
   					String xnum2 = result2[0];
   					String xden2 = result2[1];
   					String ynum2 = result2[2];
   					String yden2 = result2[3];
   					
   					//System.out.println("x2:"+x2+" y2:"+y2+" | x1:"+x1+" y1:"+y1);
   					if (xnum1 == "fail" || xnum2 == "fail")
					{
						out.print("Debe usar variables  X  Y");
				
					}
					else
					{
   					
   						String query4[][] = Buscar.Encontrar4(xnum1, xden1, ynum1, yden1, xnum2, xden2, ynum2, yden2);  /// correr query donde las 4 variables se encuentren
   					
   						String query1120[][] = Buscar.Encontrar1120(xnum1, xden1, ynum1, yden1, xnum2, xden2);
   						String query1102[][] = Buscar.Encontrar1102(xnum1, xden1, ynum1, yden1, ynum2, yden2);
   						String query1022[][] = Buscar.Encontrar1022(xnum1, xden1, xnum2, xden2, ynum2, yden2);
   						String query0122[][] = Buscar.Encontrar0122(ynum1, yden1, xnum2, xden2, ynum2, yden2);
   					
   						String query1100[][] = Buscar.Encontrar1100(xnum1, xden1, ynum1, yden1);
   						String query1020[][] = Buscar.Encontrar1020(xnum1, xden1, xnum2, xden2);
   						String query1002[][] = Buscar.Encontrar1002(xnum1, xden1, ynum2, yden2);
   						String query0120[][] = Buscar.Encontrar0120(ynum1, yden1, xnum2, xden2);
   						String query0102[][] = Buscar.Encontrar0102(ynum1, yden1, ynum2, yden2);
   						String query0022[][] = Buscar.Encontrar0022(xnum2, xden2, ynum2, yden2);
   					
   						// copiamos todas las matrices en una sola y le quitamos los dato repetidos
   					
   						String matriz[][] = Matriz.quitarRepetidos(Matriz.copiarEnUnaMatriz(query4, query1120, query1102, query1022, query0122, query1100, 
   								query1020, query1002, query0120, query0102, query0022));
   					
   						if (Matriz.imprime(matriz) == "")
   						{
   							out.print("Busqueda no encontrada");
   						}
   						else
   						{
   							out.print(Matriz.imprime(matriz)); // imprimir el el resultado de la busqueda
   						}
					}
   					
   				}
   			}
   		}
   	}
	
	
	
%>
<br> <br>
<a href="buscar.jsp">  Regresar </a> <br> <br>
</body>
</html>