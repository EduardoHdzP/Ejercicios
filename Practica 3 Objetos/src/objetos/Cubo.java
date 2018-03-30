package objetos;

public class Cubo extends Cuadrado{
	private float medida;

	public Cubo(float medida) {
		super(medida);
		this.medida=medida;
	}

	public float calcularVolumen() {
		return medida*medida*medida;
	}
	public float calcularPerimetro() {
		return medida*12;
	}
	
}
