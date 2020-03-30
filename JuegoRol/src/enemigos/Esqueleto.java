package enemigos;

import personajes.Personaje;

/**
 * Clase Esqueleto, enemigo del piso 3
 * 
 * @author Ivan
 * 
 */
public class Esqueleto extends Enemigo{
	
	
	/**
	 * Metodo constructor, en el que se le anade el nombre
	 * @param cons valor que equivale a los puntos de vida
	 * @param fuer valor que se utiliza como bonus al dano
	 * @param dest valor que define el turno 
	 * @param def valor que reduce la cantidad de dano recibido
	 */
	public Esqueleto(int cons, int fuer, int dest, int def) {
		super(cons, fuer, dest, def);
		// TODO Auto-generated constructor stub
		super.nombre="Esqueleto";
	}
	/**
	 * Metodo en el que el esqueleto ataca y aturde a un personaje
	 * @param p el personaje target
	 */
	public void ataqueEsqueleto(Personaje p) {
		p.setAturdido(true);
		int dano = 60+60*(fuerza + fuerzaExtra)/200;
		p.recibeDano(dano);
	}

}
