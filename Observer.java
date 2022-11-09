import java.util.Date;

import javax.swing.JFrame;

public abstract class Observer extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected Horloge horloge ;
	
	
	public Observer() {
		this.horloge = new Horloge();
	};
	
	
	
	public Observer(Horloge horloge) {
		this.horloge = horloge;
	}

	public Horloge getHorloge() {
		return horloge;
	}

	public void setHorloge(Horloge horloge) {
		this.horloge = horloge;
	}
	
	public abstract void update(Date time); 
	
	
}
