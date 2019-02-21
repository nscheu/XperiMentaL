/**
 * 
 */
package main.org.java.XperiMentaL;

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
	
	public Plane(){
		
	}
	
	public Plane(int id, int year, String make, String model, String color, String description, String price, Seller seller, Location location){
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
	public int getId() {
		return id;
	}

	/**
	 * @param i the id to set
	 */
	public void setId(int i) {
		this.id = i;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}

	/**
	 * @return the seller
	 */
	public Seller getSeller() {
		return seller;
	}

	/**
	 * @param  seller the seller to set
	 */
	public void setSeller(String seller) {
		this.seller =  new Seller(seller);
	}

	/**
	 * @return the location
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String city, String state) {
		this.location = new Location(city, state);
	}
    
}
