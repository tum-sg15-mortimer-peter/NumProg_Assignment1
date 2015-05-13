import java.util.Arrays;

public class Test_Gleitpunktzahl {
/**
 * Testklasse, ob alles funktioniert!
 */
	
	
	public static void main(String[] argv) {
		test_Gleitpunktzahl();
	}

	public static void test_Gleitpunktzahl() {

		/**********************************/
		/* Test der Klasse Gleitpunktzahl */
		/**********************************/

		System.out.println("-----------------------------------------");
		System.out.println("Test der Klasse Gleitpunktzahl");

		/*
		 * Verglichen werden die BitFelder fuer Mantisse und Exponent und das
		 * Vorzeichen
		 */
		Gleitpunktzahl.setSizeMantisse(4);
		Gleitpunktzahl.setSizeExponent(2);

		Gleitpunktzahl x;
		Gleitpunktzahl y;
		Gleitpunktzahl gleitref = new Gleitpunktzahl();
		Gleitpunktzahl gleiterg;
		
		// Eigene Prints
		System.out.println(gleitref.toString());

		/* Test von setDouble */
		System.out.println("Test von setDouble");
		try {
			// Test: setDouble
			x = new Gleitpunktzahl(0.5);

			// Eigene Prints
			System.out.println("x.toString(): " + x.toString() + " fuer den Wert: 0.5");

			// Referenzwerte setzen
			gleitref = new Gleitpunktzahl(0.5);
			

			// Test, ob Ergebnis korrekt
			if (x.compareAbsTo(gleitref) != 0
					|| x.vorzeichen != gleitref.vorzeichen) {
				printErg("" + x.toDouble(), "" + gleitref.toDouble());
			} else {
				System.out.println("    Richtiges Ergebnis\n");
			}

			/*************
			// Eigene Tests einfuegen
			*/
			
			Gleitpunktzahl testwert1 = new Gleitpunktzahl(0.125D);
			System.out.println("testwert1: " + testwert1.toString() + " fuer den Wert: 0.125\n");
			
			Gleitpunktzahl testwert2 = new Gleitpunktzahl(16D);
			System.out.println("testwert2: " + testwert2.toString() + " fuer den Wert: 16.0\n");
			
			Gleitpunktzahl testwert3 = new Gleitpunktzahl(0.33D);
			System.out.println("testwert3: " + testwert3.toString() + " fuer den Wert: 0.33\n");
			
			Gleitpunktzahl testwert4 = new Gleitpunktzahl(32D);
			System.out.println("testwert4: " + testwert4.toString() + " fuer den Wert: 32.0\n");
			
			Gleitpunktzahl testwert5 = new Gleitpunktzahl(0D);
			System.out.println("testwert5: " + testwert5.toString() + " fuer den Wert: 0.0\n");
			
			Gleitpunktzahl testwert6 = new Gleitpunktzahl(10D);
			System.out.println("testwert6: " + testwert6.toString() + " fuer den Wert: 10.0\n");
			
			Gleitpunktzahl testwert7 = new Gleitpunktzahl(-0.123D);
			System.out.println("testwert7: " + testwert7.toString() + " fuer den Wert: -0.123\n");
			
			Gleitpunktzahl testwert8 = new Gleitpunktzahl(1D);
			System.out.println("testwert8: " + testwert8.toString() + " fuer den Wert: 1.0\n");
			
			Gleitpunktzahl testwert9 = new Gleitpunktzahl(2D);
			System.out.println("testwert9: " + testwert9.toString() + " fuer den Wert: 2.0\n");
			
			Gleitpunktzahl testwert10 = new Gleitpunktzahl(3.25D);
			System.out.println("testwert10: " + testwert10.toString() + " fuer den Wert: 3.25\n");
			
			
			
			
			// System.out.println("log 2/ log 2 " + Math.log(2)/Math.log(2));
			
			
			System.out.println("\n\nEIGENE TESTS EINFÜGEN!!!!!!!\n\n");

		} catch (Exception e) {
			System.out.print("Exception bei der Auswertung des Ergebnis!!\n");
		}

		/* Addition */
		System.out.println("Test der Addition mit Gleitpunktzahl");
		try {
			// Test: Addition
			System.out.println("Test: Addition  x + y");
			x = new Gleitpunktzahl(3.25);
			y = new Gleitpunktzahl(0.5);

			// Referenzwerte setzen
			gleitref = new Gleitpunktzahl(3.25 + 0.5);

			// Berechnung
			// gleiterg = x.add(y);
			/*
			// Test, ob Ergebnis korrekt
			if (gleiterg.compareAbsTo(gleitref) != 0
					|| gleiterg.vorzeichen != gleitref.vorzeichen) {
				printAdd(x.toString(), y.toString());
				printErg(gleiterg.toString(), gleitref.toString());
			} else {
				System.out.println("    Richtiges Ergebnis\n");
			}
			*/
			
			/*************
			 * Eigene Tests einfuegen
			 */
			
			System.out.println("Addition Tests:\n");
			int i = 8;
			System.out.println("8/16D: " + i/16D);
			
			Gleitpunktzahl addtest1_1 = new Gleitpunktzahl(2D);
			Gleitpunktzahl addtest1_2 = new Gleitpunktzahl(1D);
			Gleitpunktzahl sumtest1 = addtest1_1.add(addtest1_2);
			System.out.println("Addtest1: 2.0 + 1.0 = " + sumtest1.toString() + "\n");
			
			Gleitpunktzahl addtest2_1 = new Gleitpunktzahl(3D);
			Gleitpunktzahl addtest2_2 = new Gleitpunktzahl(2D);
			System.out.println("Addtest2: 3.0 + 2.0 = " + addtest2_1.add(addtest2_2).toString() + "\n");
			
			Gleitpunktzahl addtest3_1 = new Gleitpunktzahl(1D);
			Gleitpunktzahl addtest3_2 = new Gleitpunktzahl(2D);
			System.out.println("Addtest3: 1.0 + 2.0 = " + addtest3_1.add(addtest3_2).toString() + "\n");
			// gleiche Summanden Tests
			Gleitpunktzahl addtest4_1 = new Gleitpunktzahl(1D);
			Gleitpunktzahl addtest4_2 = new Gleitpunktzahl(1D);
			System.out.println("Addtest4: 1.0 + 1.0 = " + addtest4_1.add(addtest4_2).toString() + "\n");
			
			Gleitpunktzahl addtest5_1 = new Gleitpunktzahl(0.5D);
			Gleitpunktzahl addtest5_2 = new Gleitpunktzahl(0.5D);
			System.out.println("Addtest5: 0.5 + 0.5 = " + addtest5_1.add(addtest5_2).toString() + "\n");
			
			Gleitpunktzahl addtest6_1 = new Gleitpunktzahl(2.5D);
			Gleitpunktzahl addtest6_2 = new Gleitpunktzahl(2.5D);
			System.out.println("Addtest6: 2.5 + 2.5 = " + addtest6_1.add(addtest6_2).toString() + "\n");
			// negative Summen
			Gleitpunktzahl addtest7_1 = new Gleitpunktzahl(-1.5D);
			Gleitpunktzahl addtest7_2 = new Gleitpunktzahl(1.0D);
			System.out.println("Addtest7: -1.5 + 1.0 = " + addtest7_1.add(addtest7_2).toString() + "\n");
			
			

			System.out.println("\n\nEIGENE TESTS EINFÜGEN!!!!!!!\n\n");

		} catch (Exception e) {
			System.out.print("Exception bei der Auswertung des Ergebnis!!\n");
		}

		/* Subtraktion */
		try {
			System.out.println("Test der Subtraktion mit Gleitpunktzahl");

			// Test: Addition
			System.out.println("Test: Subtraktion  x - y");
			x = new Gleitpunktzahl(3.25);
			y = new Gleitpunktzahl(2.75);

			// Referenzwerte setzen
			gleitref = new Gleitpunktzahl((3.25 - 2.75));

			// Berechnung
			gleiterg = x.sub(y);

			// Test, ob Ergebnis korrekt
			if (gleiterg.compareAbsTo(gleitref) != 0
					|| gleiterg.vorzeichen != gleitref.vorzeichen) {
				printSub(x.toString(), y.toString());
				printErg(gleiterg.toString(), gleitref.toString());
			} else {
				System.out.println("    Richtiges Ergebnis\n");
			}

			/*************
			 * Eigene Tests einfuegen
			 */

			System.out.println("\n\nEIGENE TESTS EINFÜGEN!!!!!!!\n\n");

		} catch (Exception e) {
			System.out.print("Exception bei der Auswertung des Ergebnis!!\n");
		}

		/* Sonderfaelle */
		System.out.println("Test der Sonderfaelle mit Gleitpunktzahl");

		try {
			// Test: Sonderfaelle
			// 0 - inf
			System.out.println("Test: Sonderfaelle");
			x = new Gleitpunktzahl(0.0);
			y = new Gleitpunktzahl(1.0 / 0.0);

			// Referenzwerte setzen
			gleitref.setInfinite(true);

			// Berechnung mit der Methode des Studenten durchfuehren
			gleiterg = x.sub(y);

			// Test, ob Ergebnis korrekt
			if (gleiterg.compareAbsTo(gleitref) != 0
					|| gleiterg.vorzeichen != gleitref.vorzeichen) {
				printSub(x.toString(), y.toString());
				printErg(gleiterg.toString(), gleitref.toString());
			} else {
				System.out.println("    Richtiges Ergebnis\n");
			}
			
			/*************
			 * Eigene Tests einfuegen
			 */

			System.out.println("\n\nEIGENE TESTS EINFÜGEN!!!!!!!\n\n");


		} catch (Exception e) {
			System.out
					.print("Exception bei der Auswertung des Ergebnis in der Klasse Gleitpunktzahl!!\n");
		}

	}


	private static void printAdd(String x, String y) {
		System.out.println("    Fehler!\n      Es wurde gerechnet:            "
				+ x + " + " + y);
	}

	private static void printSub(String x, String y) {
		System.out.println("    Fehler!\n      Es wurde gerechnet:            "
				+ x + " - " + y + " = \n");
	}

	private static void printErg(String erg, String checkref) {
		System.out.println("      Ihr Ergebnis lautet:           " + erg
				+ "\n      Das Korrekte Ergebnis lautet:  " + checkref + "\n");
	}
}