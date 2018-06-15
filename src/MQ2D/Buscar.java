package MQ2D;

import java.util.Iterator;

import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;
import org.apache.jena.query.ResultSetFormatter;

public class Buscar 
{
	///////////////////////////////////////////////////////////////////////////////
	public static String[][] Encontrar4(String xnum1, String xden1, String ynum1,
										String yden1, String xnum2, String xden2,
										String ynum2, String yden2)
	{
		
		QueryExecution qe = QueryExecutionFactory.sparqlService(
                "http://localhost:3030/ecuacion0.7/query", 
                "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" + 
                "prefix : <http://www.semanticweb.org/alumno/ontologies/2017/8/ecuacionesv02#>\n" + 
                "SELECT   ?problema1 ?id ?dificultad ?descripcion ?url \n" + 
                "WHERE {\n" + 
                "  ?variablexnum1 :num_coeficient "+xnum1+" .\n" +
                "  ?variablexden1 :den_coeficient "+xden1+" .\n" + 
                "  ?variablexnum1 rdf:type :x .\n" + 
                "  ?variablexden1 rdf:type :x .\n" + 
                "  ?ecuacion1 :has ?variablexnum1 .\n" + 
                "  ?ecuacion1 :has ?variablexden1 .\n" +
                
 				"  ?variableynum1 :num_coeficient "+ynum1+" .\n" + 
                "  ?variableyden1 :den_coeficient "+yden1+" .\n" + 
                "  ?variableynum1 rdf:type :y .\n" + 
                "  ?variableyden1 rdf:type :y .\n" + 
                "  ?ecuacion1 :has ?variableynum1 .\n" + 
                "  ?ecuacion1 :has ?variableyden1 .\n" + 
                "  ?ecuacion1 rdf:type :equation1 .\n" + 
                "  \n" + 
                "  ?variablexnum2 :num_coeficient "+xnum2+" .\n" + 
                "  ?variablexden2 :den_coeficient "+xden2+" .\n" + 
                "  ?variablexnum2 rdf:type :x .\n" +
                "  ?variablexden2 rdf:type :x .\n" + 
                "  ?ecuacion2 :has ?variablexnum2 .\n" + 
                "  ?ecuacion2 :has ?variablexden2 .\n" + 
                
                "  ?variableynum2 :num_coeficient "+ynum2+" .\n" +
                "  ?variableyden2 :den_coeficient "+yden2+" .\n" + 
                "  ?variableynum2 rdf:type :y .\n" + 
                "  ?variableyden2 rdf:type :y .\n" + 
                "  ?ecuacion2 :has ?variableynum2 .\n" + 
                "  ?ecuacion2 :has ?variableyden2 .\n" + 
                "  ?ecuacion2 rdf:type :equation2 .\n" +
                
                "  \n" + 
                "  ?ecuacion1 :part_of ?problema2 .\n" + 
                "  ?ecuacion2 :part_of ?problema1 .\n" + 
                "  \n" + 
                "  ?problema1 :id ?id .\n" + 
                "  ?problema1 :problemStatement ?descripcion .\n" + 
                "  ?problema1 :documentPath ?url .\n" + 
                "  ?problema1 :complexity ?dificultad .\n" + 
                "  FILTER (?problema2 = ?problema1)\n" + 
                "}");
        ResultSet results = qe.execSelect();
        //ResultSetFormatter.out(System.out, results);
        
        int iCount = 0;
        String matriz[][] = new String[10][5];
        int x = 0,   // varaibles para las coordenadas de la matriz x, y
        	y = 0;
        
    	while (results.hasNext())
    	{
    		// Get Result
            QuerySolution qs = results.next();
    		
         	// Get Variable Names
           	Iterator<String> itVars = qs.varNames();
         	
         	// Count
            iCount++;
            //System.out.println("Result " + iCount + ": ");
           
            //System.out.println("Result " + iCount + ": ");
            
         	// Display Result
            while (itVars.hasNext()) 
            {
                String szVar = itVars.next().toString();
                String szVal = qs.get(szVar).toString();
                
                //System.out.println("[" + szVar + "]: " + szVal);
                
               
                //System.out.println("[" + szVar + "]: " + szVal);  
                
                matriz[x][y] = szVal;
                y++;
            }    
            
            x++;
            y=0;
    	}
        
        qe.close();
		
        //System.out.println("------MATRIZ--------");
        for (int mx=0; mx < matriz.length;mx++) 
        {
            for (int my=0; my < matriz[mx].length; my++) 
            {
            	//System.out.print (matriz[mx][my]+" | ");
            	//return  matriz[mx][my];
            }
            
            //System.out.println(" ");
            //System.out.println(" ");
        }
        
		//return new String[] {id, dificultad, descripcion, url};
        return matriz;
	}
	
	////// 3 de 4 ///////////
	
	///////////////////////////////////////////////////////////////////////
	public static String[][] Encontrar1120(String xnum1, String xden1, String ynum1, String yden1,
											String xnum2, String xden2)
	{
		
		QueryExecution qe = QueryExecutionFactory.sparqlService(
				"http://localhost:3030/ecuacion0.7/query", 
                "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" + 
                "prefix : <http://www.semanticweb.org/alumno/ontologies/2017/8/ecuacionesv02#>\n" + 
                "SELECT   ?problema1 ?id ?dificultad ?descripcion ?url \n" + 
                "WHERE {\n" + 
                "  ?variablexnum1 :num_coeficient "+xnum1+" .\n" + 
                "  ?variablexden1 :den_coeficient "+xden1+" .\n" + 
                "  ?variablexnum1 rdf:type :x .\n" +
                "  ?variablexden1 rdf:type :x .\n" +
                "  ?ecuacion1 :has ?variablexnum1 .\n" + 
                "  ?ecuacion1 :has ?variablexden1 .\n" + 
                
                "  ?variableynum1 :num_coeficient "+ynum1+" .\n" + 
                "  ?variableyden1 :den_coeficient "+yden1+" .\n" + 
                "  ?variableynum1 rdf:type :y .\n" + 
                "  ?variableyden1 rdf:type :y .\n" + 
                "  ?ecuacion1 :has ?variableynum1 .\n" + 
                "  ?ecuacion1 :has ?variableyden1 .\n" + 
                "  ?ecuacion1 rdf:type :equation1 .\n" + 
                "  \n" + 
                "  ?variablexnum2 :num_coeficient "+xnum2+" .\n" + 
                "  ?variablexnum2 rdf:type :x .\n" + 
                "  ?variablexden2 :den_coeficient "+xden2+" .\n" + 
                "  ?variablexden2 rdf:type :x .\n" + 
                "  ?ecuacion2 :has ?variablexnum2 .\n" + 
                "  ?ecuacion2 :has ?variablexden2 .\n" + 
                "  ?ecuacion2 rdf:type :equation2 .\n" +
                
                "  \n" + 
                "  ?ecuacion1 :part_of ?problema2 .\n" + 
                "  ?ecuacion2 :part_of ?problema1 .\n" + 
                "  \n" + 
                "  ?problema1 :id ?id .\n" + 
                "  ?problema1 :problemStatement ?descripcion .\n" + 
                "  ?problema1 :documentPath ?url .\n" + 
                "  ?problema1 :complexity ?dificultad .\n" + 
                "  FILTER (?problema2 = ?problema1)\n" + 
                "}");
        ResultSet results = qe.execSelect();
        //ResultSetFormatter.out(System.out, results);
        
        // -inicio- pasar el resultado a una matriz
        int iCount = 0;
        String matriz[][] = new String[10][5];
        int x = 0,   // varaibles para las coordenadas de la matriz x, y
        	y = 0;
        
    	while (results.hasNext())
    	{
    		// Get Result
            QuerySolution qs = results.next();
    		
         	// Get Variable Names
           	Iterator<String> itVars = qs.varNames();
         	
         	// Count
            iCount++;
           
            //System.out.println("Result " + iCount + ": ");
            
         	// Display Result
            while (itVars.hasNext()) 
            {
                String szVar = itVars.next().toString();
                String szVal = qs.get(szVar).toString();
               
                //System.out.println("[" + szVar + "]: " + szVal);  
                
                matriz[x][y] = szVal;
                y++;
            }        
            x++;
            y=0;
    	}
        // -fin- pasar resultad a una matriz
    	
        qe.close();
		
        return matriz;
	}
	
	///////////////////////////////////////////////////////////////////////
	public static String[][] Encontrar1102(String xnum1, String xden1, String ynum1, String yden1,
											String ynum2, String yden2)
	{
		
		
		QueryExecution qe = QueryExecutionFactory.sparqlService(
				"http://localhost:3030/ecuacion0.7/query", 
                "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" + 
                "prefix : <http://www.semanticweb.org/alumno/ontologies/2017/8/ecuacionesv02#>\n" + 
                "SELECT   ?problema1 ?id ?dificultad ?descripcion ?url \n" + 
                "WHERE {\n" + 
                "  ?variablexnum1 :num_coeficient "+xnum1+" .\n" + 
                "  ?variablexden1 :den_coeficient "+xden1+" .\n" + 
                "  ?variablexnum1 rdf:type :x .\n" + 
                "  ?variablexden1 rdf:type :x .\n" + 
                "  ?ecuacion1 :has ?variablexnum1 .\n" + 
                "  ?ecuacion1 :has ?variablexden1 .\n" + 
               
                "  ?variableynum1 :num_coeficient "+ynum1+" .\n" + 
                "  ?variableyden1 :den_coeficient "+yden1+" .\n" + 
                "  ?variableynum1 rdf:type :y .\n" + 
                "  ?variableyden1 rdf:type :y .\n" + 
                "  ?ecuacion1 :has ?variableynum1 .\n" +  
                "  ?ecuacion1 :has ?variableyden1 .\n" + 
                "  ?ecuacion1 rdf:type :equation1 .\n" + 
                "  \n" + 
                
                "  ?variableynum2 :num_coeficient "+ynum2+" .\n" + 
                "  ?variableynum2 rdf:type :y .\n" + 
                "  ?variableyden2 :den_coeficient "+yden2+" .\n" + 
                "  ?variableyden2 rdf:type :y .\n" + 
                "  ?ecuacion2 :has ?variableynum2 .\n" +                 
                "  ?ecuacion2 :has ?variableyden2 .\n" + 
                "  ?ecuacion2 rdf:type :equation2 .\n" + 
                
                "  \n" + 
                "  ?ecuacion1 :part_of ?problema2 .\n" + 
                "  ?ecuacion2 :part_of ?problema1 .\n" + 
                "  \n" + 
                "  ?problema1 :id ?id .\n" + 
                "  ?problema1 :problemStatement ?descripcion .\n" + 
                "  ?problema1 :documentPath ?url .\n" + 
                "  ?problema1 :complexity ?dificultad .\n" + 
                "  FILTER (?problema2 = ?problema1)\n" + 
                "}");
        ResultSet results = qe.execSelect();
        //ResultSetFormatter.out(System.out, results);
        
        // -inicio- pasar el resultado a una matriz
        int iCount = 0;
        String matriz[][] = new String[10][5];
        int x = 0,   // varaibles para las coordenadas de la matriz x, y
        	y = 0;
        
    	while (results.hasNext())
    	{
    		// Get Result
            QuerySolution qs = results.next();
    		
         	// Get Variable Names
           	Iterator<String> itVars = qs.varNames();
         	
         	// Count
            iCount++;
           
            //System.out.println("Result " + iCount + ": ");
            
         	// Display Result
            while (itVars.hasNext()) 
            {
                String szVar = itVars.next().toString();
                String szVal = qs.get(szVar).toString();
               
                //System.out.println("[" + szVar + "]: " + szVal);  
                
                matriz[x][y] = szVal;
                y++;
            }        
            x++;
            y=0;
    	}
        // -fin- pasar resultad a una matriz
    	
        qe.close();
		
        return matriz;
	}
	
	///////////////////////////////////////////////////////////////////////
	public static String[][] Encontrar1022(String xnum1, String xden1, String xnum2, String xden2,
											String ynum2, String yden2)
	{
		
		System.out.println("--1022--:1 ");
		QueryExecution qe = QueryExecutionFactory.sparqlService(
				"http://localhost:3030/ecuacion0.7/query", 
                "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" + 
                "prefix : <http://www.semanticweb.org/alumno/ontologies/2017/8/ecuacionesv02#>\n" + 
                "SELECT   ?problema1 ?id ?dificultad ?descripcion ?url \n" + 
                "WHERE {\n" + 
                "  ?variablexnum1 :num_coeficient "+xnum1+" .\n" + 
                "  ?variablexnum1 rdf:type :x .\n" + 
                "  ?variablexden1 :den_coeficient "+xden1+" .\n" + 
                "  ?variablexden1 rdf:type :x .\n" + 
                "  ?ecuacion1 :has ?variablexnum1 .\n" + 
                "  ?ecuacion1 :has ?variablexden1 .\n" + 
                "  ?ecuacion1 rdf:type :equation1 .\n" + 
                
                "  \n" + 
                "  ?variablexnum2 :num_coeficient "+xnum2+" .\n" + 
                "  ?variablexden2 :den_coeficient "+xden2+" .\n" + 
                "  ?variablexnum2 rdf:type :x .\n" + 
                "  ?variablexden2 rdf:type :x .\n" + 
                "  ?ecuacion2 :has ?variablexnum2 .\n" + 
                "  ?ecuacion2 :has ?variablexden2 .\n" + 
                
                "  ?variableynum2 :num_coeficient "+ynum2+" .\n" + 
                "  ?variableyden2 :den_coeficient "+yden2+" .\n" + 
                "  ?variableynum2 rdf:type :y .\n" + 
                "  ?variableyden2 rdf:type :y .\n" + 
                "  ?ecuacion2 :has ?variableynum2 .\n" + 
                "  ?ecuacion2 :has ?variableyden2 .\n" + 
                "  ?ecuacion2 rdf:type :equation2 .\n" + 
                
                "  \n" + 
                "  ?ecuacion1 :part_of ?problema2 .\n" + 
                "  ?ecuacion2 :part_of ?problema1 .\n" + 
                "  \n" + 
                "  ?problema1 :id ?id .\n" + 
                "  ?problema1 :problemStatement ?descripcion .\n" + 
                "  ?problema1 :documentPath ?url .\n" + 
                "  ?problema1 :complexity ?dificultad .\n" + 
                "  FILTER (?problema2 = ?problema1)\n" + 
                "}");
        ResultSet results = qe.execSelect();
        //System.out.println("--1022--:2");
        //ResultSetFormatter.out(System.out, results);
        
        // -inicio- pasar el resultado a una matriz
        int iCount = 0;
        String matriz[][] = new String[10][5];
        int x = 0,   // varaibles para las coordenadas de la matriz x, y
        	y = 0;
        //System.out.println("--1022--:3 ");
    	while (results.hasNext())
    	{
    		// Get Result
            QuerySolution qs = results.next();
    		
         	// Get Variable Names
           	Iterator<String> itVars = qs.varNames();
         	
         	// Count
            iCount++;
           
            //System.out.println("Result " + iCount + ": ");
            //System.out.println("--1022--:4 ");
            
         	// Display Result
            while (itVars.hasNext()) 
            {
            	//System.out.println("--1022--:5 ");
                String szVar = itVars.next().toString();
                String szVal = qs.get(szVar).toString();
               
                //System.out.println("--1022--:6 x:"+x+" y:"+y);
                //System.out.println("[" + szVar + "]: " + szVal);  
                
                matriz[x][y] = szVal;
                //System.out.println("--1022--:7 ");
                y++;
            }    
            //System.out.println("--1022--:8 ");
            x++;
            y=0;
    	}
        // -fin- pasar resultad a una matriz
    	//System.out.println("--1022--:9 ");
        qe.close();
		//System.out.println("--1022--: 10");
        return matriz;
        
	}
	
	////////////////////////////////////////////////////////////////////////
	public static String[][] Encontrar0122( String ynum1, String yden1, String xnum2, String xden2,
											String ynum2, String yden2)
	{
		
		
		QueryExecution qe = QueryExecutionFactory.sparqlService(
				"http://localhost:3030/ecuacion0.7/query", 
                "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" + 
                "prefix : <http://www.semanticweb.org/alumno/ontologies/2017/8/ecuacionesv02#>\n" + 
                "SELECT   ?problema1 ?id ?dificultad ?descripcion ?url \n" + 
                "WHERE {\n" + 
                
                "  ?variableynum1 :num_coeficient "+ynum1+" .\n" + 
                "  ?variableynum1 rdf:type :y .\n" + 
                "  ?variableyden1 :den_coeficient "+yden1+" .\n" + 
                "  ?variableyden1 rdf:type :y .\n" + 
                "  ?ecuacion1 :has ?variableynum1 .\n" +                
                "  ?ecuacion1 :has ?variableyden1 .\n" + 
                "  ?ecuacion1 rdf:type :equation1 .\n" + 
                "  \n" + 
                "  ?variablexnum2 :num_coeficient "+xnum2+" .\n" + 
                "  ?variablexden2 :den_coeficient "+xden2+" .\n" +                
                "  ?variablexnum2 rdf:type :x .\n" +
                "  ?variablexden2 rdf:type :x .\n" + 
                "  ?ecuacion2 :has ?variablexnum2 .\n" + 
                "  ?ecuacion2 :has ?variablexden2 .\n" + 
                 
                "  ?variableynum2 :num_coeficient "+ynum2+" .\n" + 
                "  ?variableyden2 :den_coeficient "+yden2+" .\n" + 
                "  ?variableynum2 rdf:type :y .\n" +
                "  ?variableyden2 rdf:type :y .\n" + 
                "  ?ecuacion2 :has ?variableynum2 .\n" +                 
                "  ?ecuacion2 :has ?variableyden2 .\n" + 
                "  ?ecuacion2 rdf:type :equation2 .\n" + 
               
                "  \n" + 
                "  ?ecuacion1 :part_of ?problema2 .\n" + 
                "  ?ecuacion2 :part_of ?problema1 .\n" + 
                "  \n" + 
                "  ?problema1 :id ?id .\n" + 
                "  ?problema1 :problemStatement ?descripcion .\n" + 
                "  ?problema1 :documentPath ?url .\n" + 
                "  ?problema1 :complexity ?dificultad .\n" + 
                "  FILTER (?problema2 = ?problema1)\n" + 
                "}");
        ResultSet results = qe.execSelect();
        //ResultSetFormatter.out(System.out, results);
        
        // -inicio- pasar el resultado a una matriz
        int iCount = 0;
        String matriz[][] = new String[10][5];
        int x = 0,   // varaibles para las coordenadas de la matriz x, y
        	y = 0;
        
    	while (results.hasNext())
    	{
    		// Get Result
            QuerySolution qs = results.next();
    		
         	// Get Variable Names
           	Iterator<String> itVars = qs.varNames();
         	
         	// Count
            iCount++;
           
            //System.out.println("Result " + iCount + ": ");
            
         	// Display Result
            while (itVars.hasNext()) 
            {
                String szVar = itVars.next().toString();
                String szVal = qs.get(szVar).toString();
               
                //System.out.println("[" + szVar + "]: " + szVal);  
                
                matriz[x][y] = szVal;
                y++;
            }        
            x++;
            y=0;
    	}
        // -fin- pasar resultad a una matriz
    	
        qe.close();
		
        return matriz;
	}
	
	/////// 2 de 4 ////////
	
	////////////////////////////////////////////////////////////
	public static String[][] Encontrar1100(String xnum1, String xden1, String ynum1, String yden1)
	{
		
		
		QueryExecution qe = QueryExecutionFactory.sparqlService(
				"http://localhost:3030/ecuacion0.7/query", 
                "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" + 
                "prefix : <http://www.semanticweb.org/alumno/ontologies/2017/8/ecuacionesv02#>\n" + 
                "SELECT   ?problema1 ?id ?dificultad ?descripcion ?url \n" + 
                "WHERE {\n" + 
                "  ?variablexnum1 :num_coeficient "+xnum1+" .\n" +
                "  ?variablexden1 :den_coeficient "+xden1+" .\n" +                               
                "  ?variablexnum1 rdf:type :x .\n" + 
                "  ?variablexden1 rdf:type :x .\n" +
                "  ?ecuacion1 :has ?variablexnum1 .\n" + 
                "  ?ecuacion1 :has ?variablexden1 .\n" + 
                
                "  ?variableynum1 :num_coeficient "+ynum1+" .\n" + 
				"  ?variableyden1 :den_coeficient "+yden1+" .\n" +                
                "  ?variableynum1 rdf:type :y .\n" + 
                "  ?variableyden1 rdf:type :y .\n" +
                "  ?ecuacion1 :has ?variableynum1 .\n" +                 
                "  ?ecuacion1 :has ?variableyden1 .\n" + 
                "  ?ecuacion1 rdf:type :equation1 .\n" + 
                
                "  ?ecuacion2 rdf:type :equation2 .\n" + 
                "  \n" + 
                "  ?ecuacion1 :part_of ?problema2 .\n" + 
                "  ?ecuacion2 :part_of ?problema1 .\n" + 
                "  \n" + 
                "  ?problema1 :id ?id .\n" + 
                "  ?problema1 :problemStatement ?descripcion .\n" + 
                "  ?problema1 :documentPath ?url .\n" + 
                "  ?problema1 :complexity ?dificultad .\n" + 
                "  FILTER (?problema2 = ?problema1)\n" + 
                "}");
        ResultSet results = qe.execSelect();
        //ResultSetFormatter.out(System.out, results);
        
        // -inicio- pasar el resultado a una matriz
        int iCount = 0;
        String matriz[][] = new String[30][5];
        int x = 0,   // varaibles para las coordenadas de la matriz x, y
        	y = 0;
        
    	while (results.hasNext())
    	{
    		// Get Result
            QuerySolution qs = results.next();
    		
         	// Get Variable Names
           	Iterator<String> itVars = qs.varNames();
         	
         	// Count
            iCount++;
           
            //System.out.println("Result " + iCount + ": ");
            
         	// Display Result
            while (itVars.hasNext()) 
            {
                String szVar = itVars.next().toString();
                String szVal = qs.get(szVar).toString();
               
                //System.out.println("[" + szVar + "]: " + szVal);  
                
                matriz[x][y] = szVal;
                y++;
            }        
            x++;
            y=0;
    	}
        // -fin- pasar resultad a una matriz
    	
        qe.close();
		
        return matriz;
	}
	
	////////////////////////////////////////////////////////////
	public static String[][] Encontrar1020(String xnum1, String xden1, String xnum2, String xden2)
	{
		
		
		QueryExecution qe = QueryExecutionFactory.sparqlService(
				"http://localhost:3030/ecuacion0.7/query", 
                "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" + 
                "prefix : <http://www.semanticweb.org/alumno/ontologies/2017/8/ecuacionesv02#>\n" + 
                "SELECT   ?problema1 ?id ?dificultad ?descripcion ?url \n" + 
                "WHERE {\n" + 
                "  ?variablexnum1 :num_coeficient "+xnum1+" .\n" +                
                "  ?variablexnum1 rdf:type :x .\n" +                  
                "  ?variablexden1 :den_coeficient "+xden1+" .\n" +               
                "  ?variablexden1 rdf:type :x .\n" + 
                "  ?ecuacion1 :has ?variablexnum1 .\n" +               
                "  ?ecuacion1 :has ?variablexden1 .\n" +               
                "  ?ecuacion1 rdf:type :equation1 .\n" + 
               
                "  \n" + 
                "  ?variablexnum2 :num_coeficient "+xnum2+" .\n" +                 
                "  ?variablexnum2 rdf:type :x .\n" +               
                "  ?variablexden2 :den_coeficient "+xden2+" .\n" +               
                "  ?variablexden2 rdf:type :x .\n" + 
                "  ?ecuacion2 :has ?variablexnum2 .\n" +                
                "  ?ecuacion2 :has ?variablexden2 .\n" +                
                "  ?ecuacion2 rdf:type :equation2 .\n" + 
                
                "  \n" + 
                "  ?ecuacion1 :part_of ?problema2 .\n" + 
                "  ?ecuacion2 :part_of ?problema1 .\n" + 
                "  \n" + 
                "  ?problema1 :id ?id .\n" + 
                "  ?problema1 :problemStatement ?descripcion .\n" + 
                "  ?problema1 :documentPath ?url .\n" + 
                "  ?problema1 :complexity ?dificultad .\n" + 
                "  FILTER (?problema2 = ?problema1)\n" + 
                "}");
        ResultSet results = qe.execSelect();
        //ResultSetFormatter.out(System.out, results);
        
        // -inicio- pasar el resultado a una matriz
        int iCount = 0;
        String matriz[][] = new String[30][5];
        int x = 0,   // varaibles para las coordenadas de la matriz x, y
        	y = 0;
        
    	while (results.hasNext())
    	{
    		// Get Result
            QuerySolution qs = results.next();
    		
         	// Get Variable Names
           	Iterator<String> itVars = qs.varNames();
         	
         	// Count
            iCount++;
           
            //System.out.println("Result " + iCount + ": ");
            
         	// Display Result
            while (itVars.hasNext()) 
            {
                String szVar = itVars.next().toString();
                String szVal = qs.get(szVar).toString();
               
                //System.out.println("[" + szVar + "]: " + szVal);  
                
                matriz[x][y] = szVal;
                y++;
            }        
            x++;
            y=0;
    	}
        // -fin- pasar resultad a una matriz
    	
        qe.close();
		
        return matriz;
	}
	
	////////////////////////////////////////////////////////////
	public static String[][] Encontrar1002(String xnum1, String xden1, String ynum2, String yden2)
	{
		
		
		QueryExecution qe = QueryExecutionFactory.sparqlService(
				"http://localhost:3030/ecuacion0.7/query", 
                "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" + 
                "prefix : <http://www.semanticweb.org/alumno/ontologies/2017/8/ecuacionesv02#>\n" + 
                "SELECT   ?problema1 ?id ?dificultad ?descripcion ?url \n" + 
                "WHERE {\n" + 
                "  ?variablexnum1 :num_coeficient "+xnum1+" .\n" + 
                "  ?variablexden1 :den_coeficient "+xden1+" .\n" + 
                "  ?variablexnum1 rdf:type :x .\n" + 
                "  ?variablexden1 rdf:type :x .\n" + 
                "  ?ecuacion1 :has ?variablexnum1 .\n" +                
                "  ?ecuacion1 :has ?variablexden1 .\n" +               
                "  ?ecuacion1 rdf:type :equation1 .\n" + 
              
                "  ?variableynum2 :num_coeficient "+ynum2+" .\n" +                
                "  ?variableynum2 rdf:type :y .\n" +                 
                "  ?variableyden2 :den_coeficient "+yden2+" .\n" +                
                "  ?variableyden2 rdf:type :y .\n" + 
                "  ?ecuacion2 :has ?variableynum2 .\n" +                 
                "  ?ecuacion2 :has ?variableyden2 .\n" + 
                "  ?ecuacion2 rdf:type :equation2 .\n" + 
               
                "  \n" + 
                "  ?ecuacion1 :part_of ?problema2 .\n" + 
                "  ?ecuacion2 :part_of ?problema1 .\n" + 
                "  \n" + 
                "  ?problema1 :id ?id .\n" + 
                "  ?problema1 :problemStatement ?descripcion .\n" + 
                "  ?problema1 :documentPath ?url .\n" + 
                "  ?problema1 :complexity ?dificultad .\n" + 
                "  FILTER (?problema2 = ?problema1)\n" + 
                "}");
        ResultSet results = qe.execSelect();
        //ResultSetFormatter.out(System.out, results);
        
        // -inicio- pasar el resultado a una matriz
        int iCount = 0;
        String matriz[][] = new String[30][5];
        int x = 0,   // varaibles para las coordenadas de la matriz x, y
        	y = 0;
        
    	while (results.hasNext())
    	{
    		// Get Result
            QuerySolution qs = results.next();
    		
         	// Get Variable Names
           	Iterator<String> itVars = qs.varNames();
         	
         	// Count
            iCount++;
           
            //System.out.println("Result " + iCount + ": ");
            
         	// Display Result
            while (itVars.hasNext()) 
            {
                String szVar = itVars.next().toString();
                String szVal = qs.get(szVar).toString();
               
                //System.out.println("[" + szVar + "]: " + szVal);  
                
                matriz[x][y] = szVal;
                y++;
            }        
            x++;
            y=0;
    	}
        // -fin- pasar resultad a una matriz
    	
        qe.close();
		
        return matriz;
	}
	
	/////////////////////////////////////////////////////////
	public static String[][] Encontrar0120(String ynum1, String yden1, String xnum2, String xden2)
	{
		
		
		QueryExecution qe = QueryExecutionFactory.sparqlService(
				"http://localhost:3030/ecuacion0.7/query", 
                "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" + 
                "prefix : <http://www.semanticweb.org/alumno/ontologies/2017/8/ecuacionesv02#>\n" + 
                "SELECT   ?problema1 ?id ?dificultad ?descripcion ?url \n" + 
                "WHERE {\n" + 
                 
                "  ?variableynum1 :num_coeficient "+ynum1+" .\n" +                  
                "  ?variableynum1 rdf:type :y .\n" +               
                "  ?variableyden1 :den_coeficient "+yden1+" .\n" +                 
                "  ?variableyden1 rdf:type :y .\n" + 
                "  ?ecuacion1 :has ?variableynum1 .\n" +                
                "  ?ecuacion1 :has ?variableyden1 .\n" + 
                "  ?ecuacion1 rdf:type :equation1 .\n" + 
                "  \n" + 
                "  ?variablexnum2 :num_coeficient "+xnum2+" .\n" +                
                "  ?variablexnum2 rdf:type :x .\n" +               
                "  ?variablexden2 :den_coeficient "+xden2+" .\n" +              
                "  ?variablexden2 rdf:type :x .\n" + 
                "  ?ecuacion2 :has ?variablexnum2 .\n" +                
                "  ?ecuacion2 :has ?variablexden2 .\n" +                 
                "  ?ecuacion2 rdf:type :equation2 .\n" + 
              
                "  \n" + 
                "  ?ecuacion1 :part_of ?problema2 .\n" + 
                "  ?ecuacion2 :part_of ?problema1 .\n" + 
                "  \n" + 
                "  ?problema1 :id ?id .\n" + 
                "  ?problema1 :problemStatement ?descripcion .\n" + 
                "  ?problema1 :documentPath ?url .\n" + 
                "  ?problema1 :complexity ?dificultad .\n" + 
                "  FILTER (?problema2 = ?problema1)\n" + 
                "}");
        ResultSet results = qe.execSelect();
        //ResultSetFormatter.out(System.out, results);
        
        // -inicio- pasar el resultado a una matriz
        int iCount = 0;
        String matriz[][] = new String[30][5];
        int x = 0,   // varaibles para las coordenadas de la matriz x, y
        	y = 0;
        
    	while (results.hasNext())
    	{
    		// Get Result
            QuerySolution qs = results.next();
    		
         	// Get Variable Names
           	Iterator<String> itVars = qs.varNames();
         	
         	// Count
            iCount++;
           
            //System.out.println("Result " + iCount + ": ");
            
         	// Display Result
            while (itVars.hasNext()) 
            {
                String szVar = itVars.next().toString();
                String szVal = qs.get(szVar).toString();
               
                //System.out.println("[" + szVar + "]: " + szVal);  
                
                matriz[x][y] = szVal;
                y++;
            }        
            x++;
            y=0;
    	}
        // -fin- pasar resultad a una matriz
    	
        qe.close();
		
        return matriz;
	}
	
	//////////////////////////////////////////////////////////
	public static String[][] Encontrar0102(String ynum1, String yden1, String ynum2, String yden2)
	{
		
		
		QueryExecution qe = QueryExecutionFactory.sparqlService(
				"http://localhost:3030/ecuacion0.7/query", 
                "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" + 
                "prefix : <http://www.semanticweb.org/alumno/ontologies/2017/8/ecuacionesv02#>\n" + 
                "SELECT   ?problema1 ?id ?dificultad ?descripcion ?url \n" + 
                "WHERE {\n" + 
                
                "  ?variableynum1 :num_coeficient "+ynum1+" .\n" +                  
                "  ?variableynum1 rdf:type :y .\n" +              
                "  ?variableyden1 :den_coeficient "+yden1+" .\n" +                 
                "  ?variableyden1 rdf:type :y .\n" + 
                "  ?ecuacion1 :has ?variableynum1 .\n" +                
                "  ?ecuacion1 :has ?variableyden1 .\n" + 
                "  ?ecuacion1 rdf:type :equation1 .\n" + 
                "  \n" + 
                
                "  ?variableynum2 :num_coeficient "+ynum2+" .\n" +               
                "  ?variableynum2 rdf:type :y .\n" +                 
                "  ?variableyden2 :den_coeficient "+yden2+" .\n" +                 
                "  ?variableyden2 rdf:type :y .\n" + 
                "  ?ecuacion2 :has ?variableynum2 .\n" +               
                "  ?ecuacion2 :has ?variableyden2 .\n" + 
                "  ?ecuacion2 rdf:type :equation2 .\n" + 
               
                "  \n" + 
                "  ?ecuacion1 :part_of ?problema2 .\n" + 
                "  ?ecuacion2 :part_of ?problema1 .\n" + 
                "  \n" + 
                "  ?problema1 :id ?id .\n" + 
                "  ?problema1 :problemStatement ?descripcion .\n" + 
                "  ?problema1 :documentPath ?url .\n" + 
                "  ?problema1 :complexity ?dificultad .\n" + 
                "  FILTER (?problema2 = ?problema1)\n" + 
                "}");
        ResultSet results = qe.execSelect();
        //ResultSetFormatter.out(System.out, results);
        
        // -inicio- pasar el resultado a una matriz
        int iCount = 0;
        String matriz[][] = new String[30][5];
        int x = 0,   // varaibles para las coordenadas de la matriz x, y
        	y = 0;
        
    	while (results.hasNext())
    	{
    		// Get Result
            QuerySolution qs = results.next();
    		
         	// Get Variable Names
           	Iterator<String> itVars = qs.varNames();
         	
         	// Count
            iCount++;
           
            //System.out.println("Result " + iCount + ": ");
            
         	// Display Result
            while (itVars.hasNext()) 
            {
                String szVar = itVars.next().toString();
                String szVal = qs.get(szVar).toString();
               
                //System.out.println("[" + szVar + "]: " + szVal);  
                
                matriz[x][y] = szVal;
                y++;
            }        
            x++;
            y=0;
    	}
        // -fin- pasar resultad a una matriz
    	
        qe.close();
		
        return matriz;
	}
	
	//////////////////////////////////////////////////////////
	public static String[][] Encontrar0022(String xnum2, String xden2, String ynum2, String yden2)
	{
		
		
		QueryExecution qe = QueryExecutionFactory.sparqlService(
				"http://localhost:3030/ecuacion0.7/query", 
                "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" + 
                "prefix : <http://www.semanticweb.org/alumno/ontologies/2017/8/ecuacionesv02#>\n" + 
                "SELECT   ?problema1 ?id ?dificultad ?descripcion ?url \n" + 
                "WHERE {\n" + 
                
 				"  ?ecuacion1 rdf:type :equation1 .\n" + 
 				
                "  ?variablexnum2 :num_coeficient "+xnum2+" .\n" + 
                "  ?variablexden2 :den_coeficient "+xden2+" .\n" +                 
                "  ?variablexnum2 rdf:type :x .\n" + 
                "  ?variablexden2 rdf:type :x .\n" + 
                "  ?ecuacion2 :has ?variablexnum2 .\n" + 
                "  ?ecuacion2 :has ?variablexden2 .\n" + 
                
                "  ?variableynum2 :num_coeficient "+ynum2+" .\n" + 
                "  ?variableyden2 :den_coeficient "+yden2+" .\n" +                 
                "  ?variableynum2 rdf:type :y .\n" +
                "  ?variableyden2 rdf:type :y .\n" + 
                "  ?ecuacion2 :has ?variableynum2 .\n" +                 
                "  ?ecuacion2 :has ?variableyden2 .\n" + 
                "  ?ecuacion2 rdf:type :equation2 .\n" + 
               
                "  \n" + 
                "  ?ecuacion1 :part_of ?problema2 .\n" + 
                "  ?ecuacion2 :part_of ?problema1 .\n" + 
                "  \n" + 
                "  ?problema1 :id ?id .\n" + 
                "  ?problema1 :problemStatement ?descripcion .\n" + 
                "  ?problema1 :documentPath ?url .\n" + 
                "  ?problema1 :complexity ?dificultad .\n" + 
                "  FILTER (?problema2 = ?problema1)\n" + 
                "}");
        ResultSet results = qe.execSelect();
        //ResultSetFormatter.out(System.out, results);
        
        // -inicio- pasar el resultado a una matriz
        int iCount = 0;
        String matriz[][] = new String[30][5];
        int x = 0,   // varaibles para las coordenadas de la matriz x, y
        	y = 0;
        
    	while (results.hasNext())
    	{
    		// Get Result
            QuerySolution qs = results.next();
    		
         	// Get Variable Names
           	Iterator<String> itVars = qs.varNames();
         	
         	// Count
            iCount++;
           
            //System.out.println("Result " + iCount + ": ");
            
         	// Display Result
            while (itVars.hasNext()) 
            {
                String szVar = itVars.next().toString();
                String szVal = qs.get(szVar).toString();
               
                //System.out.println("[" + szVar + "]: " + szVal);  
                
                matriz[x][y] = szVal;
                y++;
            }        
            x++;
            y=0;
    	}
        // -fin- pasar resultad a una matriz
    	
        qe.close();
		
        return matriz;
	}
	
	///////////////////////////////////////////////////////////
	// arma la ecuacion correspondiente al problema encontrado
	////////////////////////////////////////////////////////////
	public static String armarEcuacion(String problema)
	{
		QueryExecution qe = QueryExecutionFactory.sparqlService(
				"http://localhost:3030/ecuacion0.7/query", 
                "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" + 
                "prefix : <http://www.semanticweb.org/alumno/ontologies/2017/8/ecuacionesv02#>\n" + 
                "SELECT   ?num ?den ?resultado\n" + 
                "WHERE {\n" + 
                "  ?problema :id \""+problema+"\" .\n" + 
                "  ?ecuacion :part_of ?problema .\n" + 
                "  ?ecuacion :has ?variable .\n" + 
                "  ?variable :num_coeficient ?num .\n" + 
                "  ?variable :den_coeficient ?den .\n" + 
                "  ?ecuacion :result ?resultado\n" + 
                "}");
        ResultSet results = qe.execSelect();
        
     // -inicio- pasar el resultado a una matriz
        int iCount = 0;
        String matriz[][] = new String[4][3];
        int x = 0,   // varaibles para las coordenadas de la matriz x, y
        	y = 0;
        
    	while (results.hasNext())
    	{
    		// Get Result
            QuerySolution qs = results.next();
    		
         	// Get Variable Names
           	Iterator<String> itVars = qs.varNames();
         	
         	// Count
            iCount++;
           
            //System.out.println("Result " + iCount + ": ");
            
         	// Display Result
            while (itVars.hasNext()) 
            {
                String szVar = itVars.next().toString();
                String szVal = qs.get(szVar).toString();
               
                //System.out.println("[" + szVar + "]: " + szVal);  
                
                matriz[x][y] = SepararF.limpiarXml(szVal);
                //System.out.println("x:"+x+" y:"+y+" matriz:"+matriz[x][y]);
                y++;
            }        
            x++;
            y=0;
    	}
        // -fin- pasar resultad a una matriz
    	
    	qe.close();
    	
    	// sacar los datos de la matriz y armar la ecuacion
    	
    	String resultado = "   &nbsp; &nbsp; ";
    	if (matriz[0][2].equals("1"))
    	{
    		if (positivoNegativo(Integer.parseInt(matriz[0][1])))
    		{
    			if (matriz[0][1].equals("1"))
    			{
    				resultado += "x";
    			}
    			else
    			{
    				resultado += matriz[0][1]+"x";
    			}
    		}
    		else
    		{
    			if (matriz[0][1].equals("-1"))
    			{
    				resultado += "-x";
    			}
    			else
    			{
    				resultado += matriz[0][1]+"x";
    			}
    		}
    	}
    	else
    	{
    		resultado += matriz[0][1]+"/"+matriz[0][2]+"x";
    	}
    	
    	if (matriz[1][2].equals("1"))
    	{
    		if (positivoNegativo(Integer.parseInt(matriz[1][1])))
    		{
    			if (matriz[1][1].equals("1"))
    			{
    				resultado += "+y";
    			}
    			else
    			{
    				resultado += "+"+matriz[1][1]+"y";
    			}
    		}
    		else
    		{
    			if (matriz[1][1].equals("-1"))
    			{
    				resultado += "-y";
    			}
    			else
    			{
    				resultado += matriz[1][1]+ "y";
    			}
    		}
    		
    	}
    	else
    	{
    		if (positivoNegativo(Integer.parseInt(matriz[1][1])))
    		{
    			resultado += "+"+matriz[1][1]+"/"+matriz[1][2]+"y";
    		}
    		else
    		{
    			resultado += matriz[1][1]+"/"+matriz[1][2]+"y";
    		}
    	}
    	resultado += "="+matriz[1][0]+"  &nbsp; &nbsp;  ";
    	
    	if (matriz[2][2].equals("1"))
    	{
    		if (positivoNegativo(Integer.parseInt(matriz[2][1])))
    		{
    			if (matriz[2][1].equals("1"))
    			{
    				resultado += "x";
    			}
    			else
    			{
    				resultado += matriz[2][1]+"x";
    			}
    		}
    		else
    		{
    			if (matriz[2][1].equals("-1"))
    			{
    				resultado += "-x";
    			}
    			else
    			{
    				resultado += matriz[2][1]+"x";
    			}
    		}
    	}
    	else
    	{
    		resultado += matriz[2][1]+"/"+matriz[2][2]+"x";
    	}
    	
    	if (matriz[3][2].equals("1"))
    	{
    		if (positivoNegativo(Integer.parseInt(matriz[3][1])))
    		{
    			if (matriz[3][1].equals("1"))
    			{
    				resultado += "+y";
    			}
    			else
    			{
    				resultado += "+"+matriz[3][1]+"y";
    			}
    		}
    		else
    		{
    			if (matriz[3][1].equals("-1"))
    			{
    				resultado += "-y";
    			}
    			else
    			{
    				resultado += matriz[3][1]+"y";
    			}
    		}
    	}
    	else
    	{
    		if (positivoNegativo(Integer.parseInt(matriz[3][1])))
    		{
    			resultado += "+"+matriz[3][1]+"/"+matriz[3][2]+"y";
    		}
    		else
    		{
    			resultado += matriz[3][1]+"/"+matriz[3][2]+"y";
    		}
    	}
    	resultado += "="+matriz[3][0];
    	
    	
        
		return resultado;
	}
	
	////// verificar si numero es positivo o negatico
	public static boolean positivoNegativo(Integer numero)
	{
		if (numero >= 0)
		{
			return true; //positivo
		}
		else
		{
			return false; //negativo
		}
		
	}

}
