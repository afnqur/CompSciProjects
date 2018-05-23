import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;




import javax.swing.*;

@SuppressWarnings("serial")
public class MyFrame extends JFrame {

	private JPanel panel;
	private JButton button;
	private JLabel label;
	
	private ButtonListener listen;
	
	class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			File x = new File("memeLinks.txt");
			Scanner link = null;
			try {
				link = new Scanner(x);
			} catch (FileNotFoundException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
//			int count = 0;
//			while(link.hasNext()) {
//				count++;
//			}
//			int counter = 0;
//			int k = (int)(Math.random()*count);
//			String thisLink = null;
//			while(link.hasNext()) {
//				if(counter-1 == count) {
//					thisLink = link.nextLine();
//				}
//				counter ++;
//			}
			 //Change 
			ArrayList<String> list = new ArrayList<String>();
			int count = 0;
			while(link.hasNext()) {
				System.out.println(list.add(link.nextLine()));
				count++;
			}
			//System.out.println(count);
			int k = (int)(Math.random()*count +1);
			System.out.println(k);
			try {
			    Desktop.getDesktop().browse(new URL(list.get(k)).toURI());
			} catch (Exception e1) {}
			
		}
	}
	public MyFrame() {
		panel = new JPanel();
		button = new JButton("Get Meme");
		label = new JLabel("");
		
		listen = new ButtonListener();
		button.addActionListener(listen);
		panel.add(button);
		panel.add(label);
		
		this.add(panel);
	}
	
	public static void main(String[] args) {
		JFrame x = new MyFrame();
		x.setSize(100, 100);
		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		x.setVisible(true);
		// TODO Auto-generated method stub

	}
	

}
