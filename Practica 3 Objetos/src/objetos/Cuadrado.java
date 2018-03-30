package objetos;

public class Cuadrado {
	private float medida;
	
	public Cuadrado(float medida) {
		this.medida=medida;
	}

	public float getMedida() {
		return medida;
	}

	public void setMedida(float medida) {
		this.medida = medida;
	}
	
	public float calcularArea() {
		return medida*medida;
	}
	public float calcularPerimetro() {
		return medida*4;
	}

}
