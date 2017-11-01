/**
 * 
 */
package math_crunch;
import java.io.*;

/**
 * @author swampy
 *
 */
public class MathCrunchMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathCrunchProcessor cruncher = new MathCrunchProcessor(null);
		if (args.length == 0) {
			System.out.println(" Specify an operation and operands.");
			System.exit(-1);
		}
		else if (args.length == 2) {
			System.out.println(args[0] + " " + args[1]);
			if (args[0].contains("convert")) {
				System.out.println(cruncher.CrunchConvert(args[1]));
			}
			else if (args[0].contains("sqrt")) {
				System.out.println(cruncher.CrunchSqrt(args[1]));
			}
			else {
				System.out.println(" Specify an operation and operands.");
				System.exit(-2);
			}
		}
		else if (args.length == 3) {
			System.out.println(args[0] + " " + args[1] + " " + args[2]);
			if (args[0].contains("add")) {
				System.out.println(cruncher.CrunchAddition(args[1], args[2]));
			}
			else if (args[0].contains("subtract")) {
				System.out.println(cruncher.CrunchSubtraction(args[1], args[2]));
			}
			else if (args[0].contains("multiply")) {
				System.out.println(cruncher.CrunchMultiplication(args[1], args[2]));
			}
			else if (args[0].contains("divide")) {
				System.out.println(cruncher.CrunchDivision(args[1], args[2]));
			}
			else if (args[0].contains("power")) {
				System.out.println(cruncher.CrunchPower(args[1], args[2]));
				
			}
			else {
				System.out.println(" Specify an operation and operands.");
				System.exit(-3);
			}
		}

	}

}
