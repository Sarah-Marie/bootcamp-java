
public class SportUtilityVehicle extends Car {
	private boolean thirdRow;
	private boolean offRoadCapable;
	
	public SportUtilityVehicle() {
		super();
	}

	public SportUtilityVehicle(String make, String model, int year, double mpg, boolean thirdRow,
			boolean offRoadCapable) {
		super(make, model, year, mpg);
		this.thirdRow = thirdRow;
		this.offRoadCapable = offRoadCapable;
	}

	@Override
	public String toString() {
		return super.toString() + ", SportUtilityVehicle [thirdRow=" + thirdRow + ", offRoadCapable=" + offRoadCapable + "]";
	}

	@Override
	public String getDisplayText() {
		
		return make + " " + model +", " + year;
	}
	
	

}
