/**
 * 
 */
package xperimental;

/**
 * @author Nick
 *
 */
public class Seller {
	protected String phone;
	protected String name;
	
	Seller(String name){
		this.name = name;
	}
	
	/**
	 * @return the name
	 */
	protected String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	protected void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the phone
	 */
	protected String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	protected void setPhone(String phone) {
		this.phone = phone;
	}
	
}
