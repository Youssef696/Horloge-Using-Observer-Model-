import java.awt.FlowLayout;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ObserverFrancais extends Observer{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String timeFrancais;
	private SimpleDateFormat formatFrancais;
	JLabel timeLabel;

	

	ObserverFrancais(Horloge horloge) {
		super();
		this.horloge = horloge;
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Horloge Francais");
		setLayout(new FlowLayout());
		this.setSize(350,200);
		this.setResizable(false);
		timeLabel = new JLabel();
		
		
		this.add(timeLabel);
		
		this.setVisible(true);
		
	}
		
	@Override
	public void update(Date time) {
		
		formatFrancais = new SimpleDateFormat("HH:mm:ss");
		timeFrancais = formatFrancais.format(time.getTime());
		timeLabel.setText(timeFrancais);
		
	}

}
