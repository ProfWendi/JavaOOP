package sheridan.jollymor.bus;

/**
 * This class models a simple container with a specific
 * volume.  The container must have a name and the volume
 * of the container must be greater than 0.
 * 
 * @author Wendi Jollymore
 */
public class Container {
    
	private int id = 0;
    private String name = "container";
    private double volume = 1.0;
    
    /**
     * Construct a default container named "container"
     * with a volume of 1.0.
     */
    public Container() {}

    /**
     * Construct a container with a specific name and
     * volume.  Name can't be empty 
     * and volume must be greater than 0.
     * 
     * @param name the name of this container
     * @param size the programmer-specified volume
     */
    public Container( String name, double size) {
        
        // make sure name and volume are valid
        setName(name);
        setVolume(size);
    }
    
    /**
     * Construct a container with a specific id, name, and
     * volume.  ID can't be 0 or less, name can't be empty 
     * and volume must be greater than 0.
     * 
     * @param id the unique container ID
     * @param name the name of this container
     * @param size the programmer-specified volume
     */
    public Container(int id, String name, double size) {
        
        // make sure id, name, and volume are valid
        setId(id);
        setName(name);
        setVolume(size);
    }
    
    /**
     * Attempts to place a valid id into this container's
     * id member.  The id can't be 0 or less, otherwise an 
     * exception is thrown.
     * 
     * @param name the programmer-specified container ID
     * @throws IllegalArgumentException if the IDis invalid
     */
    public void setId(int id) {
        
        // make sure id isn't invalid
        if (id > 0) {
            this.id = id;
        } else { // id is not valid
            throw new IllegalArgumentException("Error: must be greater than 0.");
        }
    }
    
    /**
     * Retrieves the id of this container.
     * 
     * @return this container's id
     */
    public int getId() {
        return id;
    }

    /**
     * Attempts to place a valid name into this container's
     * name member.  The name can't be a null object and can't
     * be an empty string, otherwise an exception is thrown.
     * 
     * @param name the programmer-specified container name
     * @throws IllegalArgumentException if the name is empty
     */
    public void setName(String name) {
        
        // make sure name isn't empty
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else { // name is not valid
            throw new IllegalArgumentException("Error: name can't be empty.");
        }
    }
    
    /**
     * Retrieves the name of this container.
     * 
     * @return this container's name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Attempts to place a valid volume into this container's
     * volume member.  If the volume is not greater than 0, an
     * exception is thrown.
     * 
     * @param volume the programmer-specified volume
     * @throws IllegalArgumentException if the volume is invalid
     */
    public void setVolume(double volume) {
        
        // make sure volume is valid
        if (volume > 0) {
            this.volume = volume;
        } else { // volume is not valid
            throw new IllegalArgumentException("Error: size must be greater"
                + " than 0.");
        }
    }
    
    /**
     * Retrieves the volume of this container.
     * 
     * @return this container's volume
     */
    public double getVolume() {
        return volume;
    }
    
    /**
     * Gets this container as a String.
     * 
     * @return this container as a formatted string
     */
    public String toString() {
        
        // formatted container name and volume
        return String.format("%s: %.2f", name, volume);
    }
    
}