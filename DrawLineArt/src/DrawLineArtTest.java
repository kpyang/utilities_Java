import javax.swing.JFrame;

public class DrawLineArtTest {

	public static void main(String[] args) {
		DrawLineArt panel = new DrawLineArt();
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize( 250, 250 );
		application.setVisible(true);
	}

}
