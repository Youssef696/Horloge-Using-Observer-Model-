import java.util.ArrayList;

public class HorlogeMain {

	public static void main(String[] args) {
		Horloge TestHrlg = new Horloge();
		
		Observer Ang = new ObserverAnglais(TestHrlg);
		
		Observer Frc = new ObserverFrancais(TestHrlg);
		
		ArrayList<Observer> Observers = new ArrayList<Observer>();
		
		Observers.add(Ang);
		Observers.add(Frc);
		
		TestHrlg.setObservers(Observers);
		
		TestHrlg.refresh();
		
		
		
	}

}
