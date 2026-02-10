package unidad5.ejemplos.enumerados.planetas;

public enum Planeta {

    MERCURIO(3.30e23, 2.44e6),
    VENUS(4.87e24, 6.05e6),
    TIERRA(5.97e24, 6.37e6),
    MARTE(6.42e23, 3.39e6),
    JUPITER(1.90e27, 6.99e7),
    SATURNO(5.68e26, 5.82e7),
    URANO(8.68e25, 2.54e7),
    NEPTUNO(1.02e26, 2.46e7);

    private final double masa;
    private final double radio;

    private Planeta(double masa, double radio) {
        this.masa = masa;
        this.radio = radio;
    }

    public double getMasa() {
        return masa;
    }

    public double getRadio() {
        return radio;
    }
    
    public double calcularGravedad(double radio, double masa ) {
    	//fórmula G = m / r²
    	double gravedad;
    	gravedad= masa/(radio*radio);
    	
    	
    	return gravedad;
    }
    
}