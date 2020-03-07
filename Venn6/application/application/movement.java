package application;
 


import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
public class movement implements MouseListener,MouseMotionListener {
	
	
	
	private int x;
	private int y;

	
	public void Movement(Component...pns) {
		for (Component panel:pns) {
			panel.addMouseListener(this);
			panel.addMouseMotionListener(this);
		}
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		x= getX();
		y=getY();
		
	}

	@Override
	public void mousePressed(MouseEvent event) {
		
		x = event.getX();
		y=event.getY();

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseDragged(MouseEvent event) {
		
		event.getComponent().setLocation((event.getX()+event.getComponent().getX())-x,(event.getY()+event.getComponent().getY())-y);
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	
	

	
	
	
}
