package Equipment;

public abstract class Armor extends Equipment {

	private int _weight;

	public int getWeight() {
		return this._weight;
	}

	/**
	 * 
	 * @param weight
	 */
	public void setWeight(int weight) {
		this._weight = weight;
	}

}