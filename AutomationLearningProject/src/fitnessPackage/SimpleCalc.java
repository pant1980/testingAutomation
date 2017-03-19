/**
 * 
 */
package fitnessPackage;

/**
 * @author Pankaj Pant
 *
 */
public class SimpleCalc {

	public double first, second;
	/**
	 * @param first the first to set
	 */
	public void setFirst(double first) {
		this.first = first;
	}
	/**
	 * @return the first
	 */
	public double getFirst() {
		return first;
	}



	/**
	 * @param second the second to set
	 */
	public void setSecond(double second) {
		this.second = second;
	}
	/**
	 * @return the second
	 */
	public double getSecond() {
		return second;
	}

	
	public double sum() {
		return first+second;
	}
	
	public double diff() {
		return first-second;
	}
	
}
