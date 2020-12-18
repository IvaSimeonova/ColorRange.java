package Iva;

public class Time {
	private int hour, minute, second;
	
	public Time(){
		setTime(System.currentTimeMillis());
	}

	public Time(long millisecs) {
		setTime(millisecs);
	}
	
	public Time(int hour, int minute, int second){
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	public int getHour(){
		return hour;
	}
	
	private void setHour(int hour) {
		// TODO Auto-generated method stub
		this.hour = hour;
	}
	
	public int getMinute(){
		return minute;
	}
	
	private void setMinute(int minute) {
		// TODO Auto-generated method stub
		this.minute = minute;
	}
	
	public int getSecond(){
		return second;
	}
	
	private void setSecond(int second) {
		// TODO Auto-generated method stub
		this.second = second;
	}
	
	public void setTime(long milliseconds) {
		long millisecondsToday = milliseconds % ( 1000l * 60 * 60 * 24);
		this.hour = (int)(millisecondsToday / ( 1000l * 60 * 60 ));
		this.minute = (int)(millisecondsToday % ( 1000l * 60 * 60 )) / (1000 * 60);
		this.second = (int)(millisecondsToday % ( 1000l * 60 * 60 )) % (1000 * 60) / 1000;
	}
	
	public String toString(){
		return "Hour: " + hour + ", minutes: " + minute + ", seconds: " + second;
	}
	
}

