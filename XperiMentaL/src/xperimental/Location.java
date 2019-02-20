/**
 * 
 */
package xperimental;

/**
 * @author Nick
 *
 */
public class Location {
	protected String city;
	protected String state;
	Location(String city, String state){
		this.city = city;
		this.state = state;
	}
	/**
	 * @return the city
	 */
	protected String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	protected void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	protected String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	protected void setState(String state) {
		this.state = state;
	}
	
	
}
