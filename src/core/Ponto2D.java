package core;

public class Ponto2D {
	public float x;
	public float y;
	
	public Ponto2D(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void translacao(float a,float b) {
		float[][] matriz = {
				{1, 0, a},
				{0, 1, b},
				{0, 0, 1}
		};
		this.aplicarMatriz(matriz);
	}
	public void escala(float a,float b) {
		float[][] matriz = {
				{a, 0, 0},
				{0, b, 0},
				{0, 0, 1}
		};
		this.aplicarMatriz(matriz);
	}

	public void rotacao(float ang) {
		float rad = ang*0.017453f;
		float sin = (float)Math.sin(rad);
		float cos = (float)Math.cos(rad);
		float[][] matriz = {
				{cos, -sin, 0},
				{sin, cos, 0},
				{0, 0, 1}
		};
		this.aplicarMatriz(matriz);
	}

	public void shear(float shx, float shy) {

		float[][] matriz = {
				{1, shx, 0},
				{shy, 1, 0},
				{0, 0, 1}
		};
		this.aplicarMatriz(matriz);
	}

	public void aplicarMatriz(float[][] matriz){
		float[] resultado = new float[3];
		float[] ponto = new float[] {x,y,1};

		for (int i = 0; i < 3; i++) {
			resultado[i] = 0;
			for (int j = 0; j < 3; j++) {
				resultado[i] += matriz[i][j] * ponto[j];
			}
		}
		this.x = resultado[0];
		this.y = resultado[1];
	}
}
