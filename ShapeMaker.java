import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapeMaker extends JPanel{
	private static int draw;
	private static Shape shapes[] = new Shape[6];
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		ShapeFactory maker = new ShapeFactory();
		if(draw == 1) {
			int choice;
			for(int i=0; i < 6; i++) {
				choice = (int) (Math.random() * 3);
				shapes[i] = maker.getShape(i*90, i*90, choice);
				shapes[i].draw(g2d);
			}
		}else if(draw == 2) {
			SortingTechnique.sorter(shapes);
			for(int j=0; j < 6; j++){
				shapes[j].changeCoords(j*90, j*90);
				shapes[j].draw(g2d);
		}
		}
	}
	
	public static void main(String[] args) {
		ShapeMaker rects = new ShapeMaker();
		JFrame frame = new JFrame("Shape Maker");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton loadButton = new JButton("Load Shapes");
		JButton sortButton = new JButton("Sort Shapes");
		loadButton.setBounds(190, 0, 110, 30);
		sortButton.setBounds(300, 0, 110, 30);
		loadButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					draw = 1;
					frame.add(rects);
					frame.repaint();
			}
		});
		sortButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				draw = 2;
				frame.add(rects);
				frame.repaint();
		}
	});
		frame.add(loadButton);
		frame.add(sortButton);
		frame.add(rects);
		frame.setSize(600, 600);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	

}