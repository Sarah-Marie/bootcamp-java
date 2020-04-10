
public class Sheep extends AnimalAbstract implements Cloneable {
	
	private String Name;

	public Sheep(int count) {
		super(count);
	}

	public Sheep(int count, String name) {
		super(count);
		Name = name;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String getCountString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void incrementCount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resetCount() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
