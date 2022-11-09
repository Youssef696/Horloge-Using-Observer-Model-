import java.awt.FlowLayout;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ObserverAnglais extends Observer{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String timeAnglais;
	private SimpleDateFormat formatAnglais;
	JLabel timeLabel;
	

	

	ObserverAnglais(Horloge horloge) {
		super();
		this.horloge = horloge;
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Horloge Anglais");
		setLayout(new FlowLayout());
		this.setSize(350,200);
		this.setResizable(false);
		timeLabel = new JLabel();
		timeLabel.setText(timeAnglais);
		
		
		this.add(timeLabel);
		
		this.setVisible(true);
		
	}
		
	@Override
	public void update(Date time) {
		
		formatAnglais = new SimpleDateFormat("hh:mm a");
		timeAnglais = formatAnglais.format(time.getTime());
		timeLabel.setText(timeAnglais);
	}
	
	
}
