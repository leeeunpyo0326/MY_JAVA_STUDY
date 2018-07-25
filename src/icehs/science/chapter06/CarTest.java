package icehs.science.chapter06;

class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Car ice = new Car();
			ice.oilAmount = 5;
			ice.distance = 140;
			
			ice.printCarInfo();
			ice.addOil(10);
			ice.printCarInfo();
			ice.driveCar("IT센터", "인천공항", 10.17);
			ice.printCarInfo();
			ice.driveCar("인천공항", "곤지암", 62.21);
			ice.printCarInfo();
			ice.calculateDrivingDistance();
			
		

	}

}
