public class Coche {
	protected String marca;
	protected String modelo;
	protected String matricula;
	protected String color;
	
	public Coche(){				// Constructor
		this.marca = "Seat";
		this.modelo = "León";
		this.matricula = "";
		this.color = "Blanco";
	}

	// Getters y setters:
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	// Método propio para acceder a los atributos
	public String print() {
		return this.marca + "\n" + this.modelo + "\n" + this.matricula + "\n" + this.color;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche coche1 = new Coche();			// Creamos un objeto con el constructor
		coche1.setMatricula("0000KFC");		// Modificamos el objeto con un setter
		System.out.println(coche1.print());	// Leemos sus atributos

	}
}