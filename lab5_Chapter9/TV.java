package lab5_Chapter9;

public class TV {
	int channel = 1; // default
	int volumeLevel = 1; // default
	boolean on = false; // tv is off
	
	public TV() {
	}
	
	public void turnOn() {
		on = true;
	}
	
	public void turnOff() {
		on = false;
	}
	
	public void setChannel(int newChannel) {
		if(on && newChannel >= 1 && newChannel <= 120)
			channel = newChannel;
	}
	
	public void setVolume(int newVolumeLevel) {
		if(on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
			volumeLevel = newVolumeLevel;
	}
	
	public void channelUp() {
		if(on && channel < 120)
			channel++;
	}
	
	public void channelDown() {
		if(on && channel > 1)
			channel--;
	}
	
	public void volumeUp() {
		if(on && volumeLevel < 7)
			volumeLevel++;
	}
	
	public void volumeDown() {
		if(on && volumeLevel > 1)
			volumeLevel--;
	}
	
	public static void main(String[] args) {
		TV tv1 = new TV();
		tv1.turnOn();
		tv1.setChannel(30);
		tv1.setVolume(3);
		
		TV tv2 = new TV();
		tv2.turnOn();
		tv2.channelUp();
		tv2.channelUp();
		tv2.volumeUp();
		
		System.out.println("tv1's channel is " + tv1.channel + " and volume is " + tv1.volumeLevel);
		System.out.println("tv2's channel is " + tv2.channel + " and volume is " + tv2.volumeLevel);
	}
}