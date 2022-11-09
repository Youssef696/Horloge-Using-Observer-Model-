
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Horloge {
	
	
	Date dateTime;
	private ArrayList<Observer> Observers;
	
	
	public Horloge() {
		this.dateTime = new Date();
		this.Observers = new ArrayList<Observer>();
	}
	
	
	public Date getdateTime() {
		return this.dateTime;
	}

	public void setObservers(ArrayList<Observer> observers) {
		Observers = observers;
	}
	
	
	public void notifyObservers() {
		for (Observer Observ : Observers) {
			Observ.update(this.dateTime);
		}
	}
	
	public void refresh() {
		while(true) {
			dateTime= Calendar.getInstance().getTime();
			notifyObservers();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
}
