import java.awt.Rectangle;

public class Bullet extends BaseVectorShape {

	Bullet(){
		setShape(new Rectangle(0,0,2,2));
		setAlive(false);
	}
	
	public Rectangle getBounds(){
		Rectangle r;
		r = new Rectangle((int)getX(), (int) getY(), 1, 1);
		return r;
	}
	
}
