/**
 * 
 */
package math_crunch;
import java.util.Iterator;
import java.util.Map;

import com.generic.arithmetic.Arithmetic;;
/**
 * @author swampy
 *
 */
public class MathCrunchProcessor {
	
	private Arithmetic cruncher;

	/**
	 * @param cruncher
	 */
	public MathCrunchProcessor(Arithmetic cruncher) {
		if (cruncher != null)
			this.cruncher = cruncher;
		else
			this.cruncher = new Arithmetic();
	}
	
	public String CrunchConvert(String num, String base) {

		// default to base 10 if not specified
		String toBase = (base != null) ? base : "decimal"; 
		Map<String, String> resMap = cruncher.numberBaseConvertor(num);
		
		String result = "Converting: " + num + " to " + toBase + ": " + resMap.get(toBase);

		return result;

	}
	public String CrunchSqrt(String num) {
		return cruncher.sqrt(num);
	}
	public String CrunchAddition(String num1, String num2) {
		return cruncher.addition(num1, num2);
	}
	public String CrunchSubtraction(String num1, String num2) {
			return cruncher.subtraction(num1, num2);
	}
	public String CrunchMultiplication(String num1, String num2) {
		return cruncher.multiplication(num1, num2);
	}
	public String CrunchDivision(String num, String nom) {
		return cruncher.division(num, nom);
	}
	public String CrunchPower(String num, String exp) {
		return cruncher.power(num, exp);
	}

}
