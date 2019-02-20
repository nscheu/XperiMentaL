/**
 * 
 */
package xperimental;

/**
 * @author Nick
 *
 */
public class Plane {
	protected int id;
	protected int year;
	protected String make;
	protected String model;
	protected String color;
	protected String description;
	protected String price;
	protected Seller seller;
	protected Location location;
	
	Plane(){
		
	}
	
	Plane(int id, int year, String make, String model, String color, String description, String price, Seller seller, Location location){
		this.id = id;
		this.year = year;
		this.make= make;
		this.model = model;
		this.color = color;
		this.description = description;
		this.price = price;
		this.seller = seller;
		this.location = location;
	}
	

	public String toString() {
		return "" +
				this.id +
				this.year +
				this.make +
				this.model +
				this.color +
				this.description +
				this.price +
				this.seller +
				this.location;
	}

	
	/**
	 * @return the id
	 */
	protected int getId() {
		return id;
	}

	/**
	 * @param i the id to set
	 */
	protected void setId(int i) {
		this.id = i;
	}

	/**
	 * @return the year
	 */
	protected int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	protected void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the make
	 */
	protected String getMake() {
		return make;
	}

	/**
	 * @param make the make to set
	 */
	protected void setMake(String make) {
		this.make = make;
	}

	/**
	 * @return the model
	 */
	protected String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	protected void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the color
	 */
	protected String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	protected void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the description
	 */
	protected String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	protected void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the price
	 */
	protected String getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	protected void setPrice(String price) {
		this.price = price;
	}

	/**
	 * @return the seller
	 */
	protected Seller getSeller() {
		return seller;
	}

	/**
	 * @param  seller the seller to set
	 */
	protected void setSeller(String seller) {
		this.seller =  new Seller(seller);
	}

	/**
	 * @return the location
	 */
	protected Location getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	protected void setLocation(String city, String state) {
		this.location = new Location(city, state);
	}
    
}
