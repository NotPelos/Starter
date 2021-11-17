package starter;

public class saludo {
	
	private String idioma;
	
	public saludo(String idioma) {
		this.idioma = idioma;
	}
	
	
	public String mensajeSaludo() {
		String mensaje = "";
		switch (idioma) {
		case "Castellano":
			mensaje = "Hola";
			break;
		
		default:
			mensaje = "Hi all";
			break;
		}
		
		return mensaje;
	}
	

}