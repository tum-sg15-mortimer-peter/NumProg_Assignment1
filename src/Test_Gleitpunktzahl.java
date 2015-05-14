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
		Gleitpunktzahl.setSizeMantisse(8);	// 8
		Gleitpunktzahl.setSizeExponent(4);	// 4

		Gleitpunktzahl x;
		Gleitpunktzahl y;
		Gleitpunktzahl gleitref = new Gleitpunktzahl();
		Gleitpunktzahl gleiterg;
		

		/* Test von setDouble */
		System.out.println("\nTest von setDouble\n");
		try {
			
			// Test: setDouble
			x = new Gleitpunktzahl(0.5);

			
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
			
			Gleitpunktzahl testwert11 = new Gleitpunktzahl(-0.6D);
			System.out.println("testwert11: " + testwert11.toString() + " fuer den Wert: -0.6\n");
			
			Gleitpunktzahl testwert12 = new Gleitpunktzahl(-0.5D);
			System.out.println("testwert12: " + testwert12.toString() + " fuer den Wert: -0.5\n");
			
			Gleitpunktzahl testwert13 = new Gleitpunktzahl();
			testwert13.setInfinite(false);
			System.out.println("testwert13: " + testwert13.toString() + " fuer den Wert: Inf\n");
			
			
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
			gleiterg = x.add(y);
			
			// Test, ob Ergebnis korrekt
			if (gleiterg.compareAbsTo(gleitref) != 0
					|| gleiterg.vorzeichen != gleitref.vorzeichen) {
				printAdd(x.toString(), y.toString());
				printErg(gleiterg.toString(), gleitref.toString());
			} else {
				System.out.println("    Richtiges Ergebnis\n");
			}
			
			
			/*************
			 * Eigene Tests einfuegen
			 */
			
			System.out.println("Addition Tests:\n");
			
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
			
			Gleitpunktzahl addtest8_1 = new Gleitpunktzahl(16D);
			Gleitpunktzahl addtest8_2 = new Gleitpunktzahl(64D);
			System.out.println("Addtest8: 16 + 64 = " + addtest8_1.add(addtest8_2).toString() + "\n");
			
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

			System.out.println("\n\nSubtraktions Tests:\n");
			
			Gleitpunktzahl subtest1_1 = new Gleitpunktzahl(2.5D);
			Gleitpunktzahl subtest1_2 = new Gleitpunktzahl(0.75D);
			System.out.println("Subtest1: 2.5 - 0.75 = " + subtest1_1.sub(subtest1_2).toString() + "\n");

			Gleitpunktzahl subtest2_1 = new Gleitpunktzahl(-2.5D);
			Gleitpunktzahl subtest2_2 = new Gleitpunktzahl(-0.75D);
			System.out.println("Subtest2: -2.5 - -0.75 = " + subtest2_1.sub(subtest2_2).toString() + "\n");
			
			Gleitpunktzahl subtest3_1 = new Gleitpunktzahl(-1D);
			Gleitpunktzahl subtest3_2 = new Gleitpunktzahl(2D);
			System.out.println("Subtest3: -1.0 - 2.0 = " + subtest3_1.sub(subtest3_2).toString() + "\n");
			
			Gleitpunktzahl subtest4_1 = new Gleitpunktzahl(-1D);
			Gleitpunktzahl subtest4_2 = new Gleitpunktzahl(5D);
			System.out.println("Subtest4: -1.0 - 5.0 = " + subtest4_1.sub(subtest4_2).toString() + "\n");
			
			Gleitpunktzahl subtest5_1 = new Gleitpunktzahl(1D);
			Gleitpunktzahl subtest5_2 = new Gleitpunktzahl(2D);
			System.out.println("Subtest5: 1.0 - 2.0 = " + subtest5_1.sub(subtest5_2).toString() + "\n");

			Gleitpunktzahl subtest6_1 = new Gleitpunktzahl(1D);
			Gleitpunktzahl subtest6_2 = new Gleitpunktzahl(1D);
			System.out.println("Subtest6: 1.0 - 1.0 = " + subtest6_1.sub(subtest6_2).toString() + "\n");
			
			Gleitpunktzahl subtest7_1 = new Gleitpunktzahl(1333331D);
			Gleitpunktzahl subtest7_2 = new Gleitpunktzahl(13333331D);
			System.out.println("Subtest7: Inf - Inf = " + subtest7_1.sub(subtest7_2).toString() + "\n");
			
			Gleitpunktzahl subtest8_1 = new Gleitpunktzahl(0D);
			Gleitpunktzahl subtest8_2 = new Gleitpunktzahl(1.5D);
			System.out.println("Subtest8: 0 - 1.5 = " + subtest8_1.sub(subtest8_2).toString() + "\n");
			
			Gleitpunktzahl subtest9_1 = new Gleitpunktzahl(3D);
			Gleitpunktzahl subtest9_2 = new Gleitpunktzahl(-2D);
			System.out.println("Subtest9: 3 + -2 = " + subtest9_1.add(subtest9_2).toString() + "\n");
			
			Gleitpunktzahl subtest10_1 = new Gleitpunktzahl();
			Gleitpunktzahl subtest10_2 = new Gleitpunktzahl();
			subtest10_1.setInfinite(false);
			subtest10_2.setInfinite(true);
			System.out.println("Subtest10: Inf - -Inf = " + subtest10_1.sub(subtest10_2).toString() + "\n");
			subtest10_1.setInfinite(true);
			subtest10_2.setInfinite(true);
			System.out.println("Subtest11: -Inf - -Inf = " + subtest10_1.sub(subtest10_2).toString() + "\n");
			subtest10_1.setInfinite(false);
			subtest10_2.setNaN();
			System.out.println("Subtest10: Inf - NaN = " + subtest10_1.sub(subtest10_2).toString() + "\n");
			
			System.out.println("\nFast Inverse Square Root Tests:\n");
			
			int magic_number = 1331;
			FastMath.setMagic(magic_number);
			System.out.println("Magic Number: " + magic_number);
			
			Gleitpunktzahl invtest1 = new Gleitpunktzahl(4D);
			System.out.println("invtest1: " + invtest1.toString());
			System.out.println("InvTest1: 4D -> " + FastMath.invSqrt(invtest1).toString());
			System.out.println("Absolute Error: " + FastMath.absInvSqrtErr(invtest1));
			System.out.println("Relative Error: " + FastMath.relInvSqrtErr(invtest1)+"\n");
			
			Gleitpunktzahl invtest2 = new Gleitpunktzahl(-4D);
			System.out.println("invtest2: " + invtest2.toString());
			System.out.println("InvTest2: -4D -> " + FastMath.invSqrt(invtest2).toString()+"\n");
			

			Gleitpunktzahl invtest3 = new Gleitpunktzahl(0D);
			System.out.println("invtest3: " + invtest3.toString());
			System.out.println("InvTest3: 0.0 -> " + FastMath.invSqrt(invtest3).toString()+"\n");
			

			Gleitpunktzahl invtest4 = new Gleitpunktzahl();
			invtest4.setInfinite(false);
			System.out.println("invtest4: " + invtest4.toString());
			System.out.println("InvTest4: Inf -> " + FastMath.invSqrt(invtest4).toString()+"\n");
			
			Gleitpunktzahl invtest5 = new Gleitpunktzahl(16D);
			System.out.println("invtest5: " + invtest5.toString());
			System.out.println("InvTest5: 16 -> " + FastMath.invSqrt(invtest5).toString());
			System.out.println("Absolute Error: " + FastMath.absInvSqrtErr(invtest5));
			System.out.println("Relative Error: " + FastMath.relInvSqrtErr(invtest5)+"\n");
			
			
			/*
			
			System.out.println("\n\nNeue Optimale Magic Number ermitteln:\n");
			int opt_magic_abs = 0;
			int opt_magic_rel = 0;
			double low_avg_rel = 10000000;
			double low_avg_abs = 10000000;
			double example_values = 100D;
			double inc_steps = .1D;
			int magic = 1329;
			
			for(;magic < 1340; magic++) {
				FastMath.setMagic(magic);
				example_values = 100;
				
				double avg_rel = 0;
				double avg_abs = 0;
				int loop_counter = 0;
				Gleitpunktzahl test_g;
				while(example_values < 150D) {
					test_g = new Gleitpunktzahl(example_values);
					avg_rel += FastMath.absInvSqrtErr(test_g);
					avg_abs += FastMath.relInvSqrtErr(test_g);
							
					loop_counter++;
					example_values += inc_steps; 
				}
				
				// Calculate Average
				avg_abs /= (double) loop_counter;
				avg_rel /= (double) loop_counter;
				
				if(avg_rel < low_avg_rel) {
					low_avg_rel = avg_rel;
					opt_magic_rel = magic;
				}
				if(avg_abs < low_avg_abs) {
					low_avg_abs = avg_abs;
					opt_magic_abs = magic;
				}
				
			}
			
			System.out.println("Opt Magic Abs: " + opt_magic_abs + " with an abs error average of " + low_avg_abs);
			System.out.println("Opt Magic Rel: " + opt_magic_rel + " with an rel error average of " + low_avg_rel);
			
			*/
		} catch (Exception e) {
			System.out.print("Exception bei der Auswertung des Ergebnis!!\n");
		}

		/* Sonderfaelle */
		System.out.println("\n\nTest der Sonderfaelle mit Gleitpunktzahl");

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
			
			

			System.out.println("\n\nEIGENE TESTS EINFÜGEN!!!!!!!\n\n");


		} catch (Exception e) {
			System.out.print("Exception bei der Auswertung des Ergebnis in der Klasse Gleitpunktzahl!!\n");
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