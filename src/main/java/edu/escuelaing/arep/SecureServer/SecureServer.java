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
        
        get("/hello", (req, res) -> "  \r\n" + 
        		"<html>\r\n" + 
        		"\r\n" + 
        		"<head>\r\n" + 
        		"    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.js\"\r\n" + 
        		"        integrity=\"sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU=\" crossorigin=\"anonymous\"></script>\r\n" + 
        		"    <link href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n" + 
        		"        integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n" + 
        		"    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"\r\n" + 
        		"        integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\"\r\n" + 
        		"        crossorigin=\"anonymous\"></script>\r\n" + 
        		"</head>\r\n" + 
        		"\r\n" + 
        		"<body style=\"background-color: black;\">\r\n" + 
        		"    <div class=\"row\">\r\n" + 
        		"        <div th:if=\"${param.error}\" class=\"alert alert-danger col-4 offset-4\" role=\"alert\">\r\n" + 
        		"            Invalid username and password.\r\n" + 
        		"        </div>\r\n" + 
        		"        <div class=\"col-4 offset-4\">\r\n" + 
        		"            <form id=\"loginForm\" method=\"post\" th:action=\"@{/login}\">\r\n" + 
        		"                <div class=\"form-group\">\r\n" + 
        		"                    <input class=\"form-control\" type=\"text\" placeholder=\"Usuario\" name=\"username\">\r\n" + 
        		"                </div>\r\n" + 
        		"                <div class=\"form-group\">\r\n" + 
        		"                    <input class=\"form-control\" type=\"password\" placeholder=\"Contraseña\" name=\"password\">\r\n" + 
        		"                </div>\r\n" + 
        		"                <button id=\"login\" class=\"btn btn-outline-primary\">Ingresar</button>\r\n" + 
        		"            </form>\r\n" + 
        		"        </div>\r\n" + 
        		"    </div>\r\n" + 
        		"\r\n" + 
        		"</body>\r\n" + 
        		"\r\n" + 
        		"</html>");
	}
	
	static int getPort() {
		
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 5000;
    }
	
}
