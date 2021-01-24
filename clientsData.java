package caloriesCalculator;

public class clientsData {

	private int age;
	private int weight;
	private int active;
	private int height;
	
	public clientsData() {
	}
	public clientsData(int age, int weight, int active, int height){
		this.active = active;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {
		if(age<10 || age > 120){
			 throw new Exception("Enter value between 10 and 120");
			}else{
				this.age = age;;
			}
		
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

	public void setWeight(int weight) throws Exception {
		
		if(weight<20 || weight > 200){
		 throw new Exception("Enter value between 20 and 200");
		}else{
		this.weight = weight;
		}
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) throws Exception {
		if(weight<20 || weight > 200){
			 throw new Exception("Enter value between 100 and 250");
			}else{
				this.height = height;
			}
		
	}
	public  void validateData(int age,int weight,int active,int height) throws Exception{
		this.setAge(age);
		this.setWeight(weight);
		this.setActive(active);
		this.setHeight(height);
		
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
