import java.io.BufferedReader;
import java.io.FileReader;

public class Leer {
    	private BufferedReader bf;
    	
    	public Leer() {
    		
    	}

		public String textoLeer(String textoArchivo){
    	    
            String texto = "";
            
            try {
                bf = new BufferedReader(new FileReader(textoArchivo));
                String varTemporal = "";
                String bfRead;
                
                while ((bfRead = bf.readLine()) !=null) {
                    varTemporal = varTemporal + bfRead;
            }
                texto = varTemporal;
                
            } catch(Exception e) {
                System.out.println("VACIO");
            }
            
            return texto; 
        }
    }