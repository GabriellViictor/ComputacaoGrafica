package core;

import java.awt.Graphics2D;

public class Triangulo2D {
	public Ponto2D pa;
	public Ponto2D pb;
	public Ponto2D pc;
	public Triangulo2D(Ponto2D a, Ponto2D b, Ponto2D c) {
		super();
		this.pa = a;
		this.pb = b;
		this.pc = c;
	}

	public Ponto2D getPa(){
		return this.pa;
	}

	public Ponto2D getPb(){
		return this.pb;
	}

	public Ponto2D getPc(){
		return this.pc;
	}

	public void desenhase(Graphics2D dbg) {
		dbg.drawLine((int)pa.x,(int)pa.y,(int)pb.x,(int)pb.y);
		dbg.drawLine((int)pb.x,(int)pb.y,(int)pc.x,(int)pc.y);
		dbg.drawLine((int)pc.x,(int)pc.y,(int)pa.x,(int)pa.y);
	}
	
	public void translacao(float a,float b) {
		pa.translacao(a,b);
		pb.translacao(a,b);
		pc.translacao(a,b);
	}
	public void escala(float a,float b) {
		pa.escala(a,b);
		pb.escala(a,b);
		pc.escala(a,b);
	}	
	
	public void rotacao(float ang) {
		pa.rotacao(ang);
		pb.rotacao(ang);
		pc.rotacao(ang);
	}

	public void shear(float shx, float shy) {
		pa.shear(shx, shy);
		pb.shear(shx, shy);
		pc.shear(shx, shy);

	}

}
