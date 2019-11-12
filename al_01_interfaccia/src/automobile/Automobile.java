
package automobile;

import java.io.*;

public class Automobile {

	public static void main(String[] args) {

		if (args.length >= 1) {
			System.out.println("args0=" + args[0]);
			System.out.println("args1=" + args[1]);
		}

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);

		String str = null;
		boolean status = true;

		Auto a1 = new Auto(Auto.chiediDato("modello"), Auto.chiediDato("targa"), Auto.chiediDato("colore"));

		System.out.println("a1= " + a1);

		a1.setVelocita(Integer.valueOf(Auto.chiediDato("velocità")));

		do {

			a1.setMarcia(a1.getVelocita());
			a1.Stampa();

			System.out.println("Cosa vuoi fare?\n1) Spegnere la macchina\n2) Accellerare\n3) Decellerare");

			try {
				str = tastiera.readLine();
			} catch (IOException ex) {
				System.out.println("Errore di I/O");
			}

			int cambiamento = 0;
			System.out.println("Di quanto vuoi cambiare la tua velocità?");
			try {
				cambiamento = Integer.valueOf(tastiera.readLine());
			} catch (NumberFormatException | IOException e) {

				e.printStackTrace();
			}
			switch (Integer.valueOf(str)) {
			case 1:
				status = a1.spenta();
				break;
			case 2:
				a1.setMarcia((a1.getVelocita()) + cambiamento);
				break;
			case 3:
				a1.setMarcia((a1.getVelocita()) - cambiamento);
				break;
			}
		} while (status == true);
	}
}
