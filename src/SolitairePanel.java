import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.util.HashMap;


public class SolitairePanel extends JPanel implements ComponentListener {

	private HashMap<CardPlace,JLabel> places;
	
	public SolitairePanel(){
		this.addComponentListener(this);
		setBackground(Color.green);
		places = new HashMap<CardPlace,JLabel>();
		for(CardPlace place : CardPlace.values()){
			JLabel tempLabel = new JLabel();
			tempLabel.setBackground(Color.GRAY);
			add(tempLabel);
			places.put(place, tempLabel);
		}
		placeLabels();
	}
	
	public void setPlace(CardPlace place, Card card){
		places.get(place).setIcon(new ImageIcon("cardback.png"));
	}
	
	private void placeLabels(){
		int heightFactor = getHeight()/22;
		int widthFactor = getWidth()/38;
		int factor = Math.min(heightFactor, widthFactor);
		places.get(CardPlace.set1).setBounds(2*factor, 2*factor, 4*factor, 6*factor);
		places.get(CardPlace.set2).setBounds(2*factor + 4*factor + 1*factor, 2*factor, 4*factor, 6*factor);
		places.get(CardPlace.set3).setBounds(2*factor + 2*4*factor + 2*1*factor, 2*factor, 4*factor, 6*factor);
		places.get(CardPlace.set4).setBounds(2*factor + 3*4*factor + 3*1*factor, 2*factor, 4*factor, 6*factor);
		places.get(CardPlace.pickupCards).setBounds(2*factor + 5*4*factor + 5*1*factor, 2*factor, 4*factor, 6*factor);
		places.get(CardPlace.pickupPile).setBounds(2*factor + 6*4*factor + 6*1*factor, 2*factor, 4*factor, 6*factor);
		
		places.get(CardPlace.stack1).setBounds(2*factor, 2*2*factor + 6*factor, 2*factor, 6*factor);
		places.get(CardPlace.stack2).setBounds(2*factor + 4*factor + 1*factor, 2*2*factor + 30*factor, 20*factor, 6*factor);
		places.get(CardPlace.stack3).setBounds(2*factor + 2*4*factor + 2*1*factor, 2*2*factor + 6*factor, 4*factor, 6*factor);
		places.get(CardPlace.stack4).setBounds(2*factor + 3*4*factor + 3*1*factor, 2*2*factor + 6*factor, 4*factor, 6*factor);
		places.get(CardPlace.stack5).setBounds(2*factor + 4*4*factor + 4*1*factor, 2*2*factor + 6*factor, 4*factor, 6*factor);
		places.get(CardPlace.stack6).setBounds(2*factor + 5*4*factor + 5*1*factor, 2*2*factor + 6*factor, 4*factor, 6*factor);
		places.get(CardPlace.stack7).setBounds(2*factor + 6*4*factor + 6*1*factor, 2*2*factor + 6*factor, 4*factor, 6*factor);
		// TODO
		for(JLabel label : places.values()){
			label.setBackground(Color.GRAY);
		}
	}
	
	@Override
	public void componentHidden(ComponentEvent arg0) {		
	}

	@Override
	public void componentMoved(ComponentEvent arg0) {
	}

	@Override
	public void componentResized(ComponentEvent arg0) {
		placeLabels();
		repaint();
	}

	@Override
	public void componentShown(ComponentEvent arg0) {		
	}

}
