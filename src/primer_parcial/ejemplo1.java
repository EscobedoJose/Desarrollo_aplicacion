package primer_parcial;
import java.awt.*;
import javax.swing.*;
public class ejemplo1 {
	private JFrame f;
	private JButton bn, bs, bw, be, bc;
	
	public ejemplo1 () {
		f= new JFrame("Border Layout");
		bn= new JButton("Button 1");
		bc= new JButton("Button 2");
		bw= new JButton("Button 3");
		bs= new JButton("Button 4");
		be= new JButton("Button 5");
		}
	public void launchFrame() {
		f.add(bn, BorderLayout.NORTH);
		f.add(bs, BorderLayout.SOUTH);
		f.add(bw, BorderLayout.WEST);
		f.add(be, BorderLayout.EAST);
		f.add(bc, BorderLayout.CENTER);
		f.setSize(400,200);
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		ejemplo1 guiWindow2 = new ejemplo1();
		guiWindow2.launchFrame();
	}

}
