/**
 * 
 */
package main.org.java.XperiMentaL;

/**
 * @author Nick
 *
 */
public class Location {
	protected String city;
	protected String state;
	
	public Location(String city, String state){
		this.city = city;
		this.state = state;
	}
	
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	
	
}
