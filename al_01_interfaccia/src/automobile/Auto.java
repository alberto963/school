
package automobile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Auto extends Object {

	static InputStreamReader input = new InputStreamReader(System.in);
	static BufferedReader tastiera = new BufferedReader(input);

	@Override
	public String toString() {
		return super.toString() + " Auto [modello=" + modello + ", targa=" + targa + ", colore=" + colore + ", accesa=" + accesa
				+ ", velocita=" + velocita + ", marcia=" + marcia + "]";
	}

	public String modello;
	public final String targa;
	public String colore;
	private boolean accesa = true;
	private int velocita;
	private int marcia;

	public Auto(String modello, String targa, String colore) {
		this.modello = modello;
		this.targa = targa;
		this.colore = colore;
		this.velocita = 0;
		this.marcia = 1;
	}

	public int getVelocita() {
		return velocita;
	}

	public void setVelocita(int velocita) {
		this.velocita = velocita;
	}

	public static String chiediDato(String dato) {
		System.out.println("Inserisci il " + dato + " della macchina");

		try {
			return tastiera.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void Stampa() {
		System.out.println("La velocita a cui stai andando è: " + velocita);
		System.out.println("La marcia consigliata è: " + marcia);
	}

	public void setMarcia(int velocita) {
		this.velocita = velocita;

		if (velocita <= 30)
			marcia = 1;
		else if (velocita <= 50)
			marcia = 2;
		else if (velocita <= 70)
			marcia = 3;
		else if (velocita <= 100)
			marcia = 4;
		else
			marcia = 5;
	}

	public boolean spenta() {
		if (accesa == true) {
			accesa = false;
		}
		return accesa;
	}

}
