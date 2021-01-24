package caloriesCalculator;

public class clientsData {

	private int age;
	private int weight;
	private int active;
	private int height;
	//private int weightToLose;
	
	clientsData(){
	}
	
	public clientsData(int age, int weight, int active, int height){
		this.active = active;
		this.age = age;
		this.weight = weight;
		this.height = height;
		//this.weightToLose = weightToLose;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	/*public int getWeightToLose() {
		return weightToLose;
	}

	public void setWeightToLose(int weightToLose) {
		this.weightToLose = weightToLose;
	}*/

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public int calculateCalories(){
		int calories = (int) Math.round(655+(9.6*this.weight)+(1.8*this.height) - (4.7*this.age));
		if(this.active == 1){
			calories*=0.80;
		}else if(this.active == 2){
			calories*=0.90;
		}else if(this.active == 4){
			calories*= 1.1;
		}
		
		return calories;
	}
}
