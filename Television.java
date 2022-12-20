package Assignment3;

public class Television {

	public static void main(String[] args) {
		Television decisionInput = new Television();
		decisionInput.changeChannel();

	}
	
	// instance variables
	  private int size;
	  private String brand;
	  private boolean isOn;

	  // methods
	  public void turnOn() {
	    // turn on the television
	  }

	  public void turnOff() {
	    // turn off the television
	  }

	  public void changeChannel() {
	    // change the channel
		  System.out.println("Changing Channel");
	  }

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}	
	

}
