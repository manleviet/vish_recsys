/**
 * Class to define a Canopy is the ViSH scenario
 */ 
package clustering;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import models.UserProfile;


/**
 * @author Daniel Gallego Vico
 *
 */
public class Canopy {
	
	private UserProfile center;
	private int canopyId;
	
	// points that are into the canopy
	private List<UserProfile> users = new ArrayList<UserProfile>();
	
	/**
	 * Empty constructor
	 */
	public Canopy() {
		
	}
	
	/**
	 * Constructor
	 */
	public Canopy(int id, UserProfile user) {
		this.canopyId = id;
		this.center = user;
	}
	
	/**
	 * Constructor
	 * 
	 * @param center
	 * @param canopyId
	 */
	public Canopy(UserProfile center, int canopyId) {
		this.center = center;
		this.canopyId = canopyId;
	}

	/**
	 * @return the center
	 */
	public UserProfile getCenter() {
		return center;
	}
	
	/**
	 * 
	 * @param user
	 */
	public void setCenter(UserProfile user) {
		this.center = user;
	}

	/**
	 * @return the canopyId
	 */
	public int getCanopyId() {
		return canopyId;
	}
	
	/**
	 * @return the users into the canopy
	 */
	public List<UserProfile> getUsers() {
		return users;
	}

	/**
	 * Add a user into the canopy
	 * @param user
	 */
	public void addUser(UserProfile user) {
		users.add(user);
	}
	
	/**
	 * Sort the users into the canopy by their distance to the center
	 */
	public void sortUsersByDistance() {
		Collections.sort(users);
	}
	
}
