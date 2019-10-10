/**
 * 
 */

/**
 * @author 
 *
 */
public class Person {
	/*attributes*/
	private String nid;
	private String name;
	private char gender;
	private double height;
	private double weight;
	
	
	public Person(String nid,String name,char gender,double height,double weight)
	{
		
	}


	/**
	 * @return the nid
	 */
	public String getNid() {
		return nid;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @return the gender
	 */
	public char getGender() {
		return gender;
	}


	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}


	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @param gender the gender to set
	 */
	public void setGender(char gender) {
		this.gender = gender;
	}


	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}


	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}


	@Override
	public String toString() {
		return "Person [nid=" + nid + ", name=" + name + ", gender=" + gender + ", height=" + height + ", weight="
				+ weight + "]";
	}
	
	
	public double calculateBmi(double height, double weight)
	{
		return(weight/(Math.pow(height, 2)));
	}
	

}
