package edu.escuelaing.arep.SecureServer;

import static spark.Spark.*;

/**
 * Clase principal que crea una web desarrollada en SPARK.
 * @author checho
 *
 */

public class SecureServer {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		port(getPort());
		
		
		//API: secure(keystoreFilePath, keystorePassword, truststoreFilePath,truststorePassword);
		secure("keys/ecikeystore.p12", "myeci2020", null, null);
        
        get("/hello", (req, res) -> "Hello WebSecuriryApp");
	}
	
	static int getPort() {
		
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 5000;
    }
	
}
