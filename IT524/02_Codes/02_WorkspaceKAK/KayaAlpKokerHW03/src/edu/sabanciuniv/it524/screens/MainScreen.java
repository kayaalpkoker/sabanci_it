package edu.sabanciuniv.it524.screens;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileSystemView;

import edu.sabanciuniv.it524.dao.StudentDAO;
import edu.sabanciuniv.it524.parsers.CSVParser;
import edu.sabanciuniv.it524.parsers.TSVParser;
import edu.sabanciuniv.it524.parsers.TextFileParser;

public class MainScreen extends JFrame {
	
	private JButton fileReadButton;
	private JTextArea fileContentArea;
	private JScrollPane fileContentScrollPane;
	private JTextField fileNameField;
	private JButton fileSaveButton;
	private JButton dbSaveButton;
	
	public MainScreen()
	{
		this.setTitle("IT524 Homework 3");
		this.getContentPane().setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(400, 450);
		this.setLocationRelativeTo(null);
		
		//Buton ekliyoruz
		this.fileReadButton = new  JButton("Read File ...");
		this.fileReadButton.setLocation(280, 20);
		this.fileReadButton.setSize(100, 25);
		this.getContentPane().add(fileReadButton);
		
		//Seçilen dosya isminin görüneceği textfield ekliyoruz
		this.fileNameField = new JTextField();
		this.fileNameField.setLocation(20, 20);
		this.fileNameField.setSize(250, 25);
		this.getContentPane().add(fileNameField);
		
		
		//Dosyanın içeriğinin görüntüleneceği textArea yı önce ScrollPane içerisine ekleyoruz
		//Sonra scrollpane i frame ekliyoruz
		this.fileContentArea = new JTextArea();
		this.fileContentArea.setLocation(20, 60);
		this.fileContentArea.setSize(360, 250);
		
		this.fileContentScrollPane = new JScrollPane();
		this.fileContentScrollPane.getViewport().setView(this.fileContentArea);
		this.fileContentScrollPane.setLocation(20, 60);
		this.fileContentScrollPane.setSize(360, 250);
		this.getContentPane().add(fileContentScrollPane);
		
		
		
		
		//Buton a kliklendiğinde JFileChooser (Dosya seçme ekranı) açıyoruz
		//Bunun için button un mouseClicked eventini override etmemiz gerekiyor
		this.fileReadButton.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				 JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
			        jfc.setPreferredSize(new Dimension(400, 400));
			        int returnValue = jfc.showOpenDialog(null);
			        if (returnValue == JFileChooser.APPROVE_OPTION) {
			            File selectedFile = jfc.getSelectedFile();
			            fileNameField.setText(selectedFile.getAbsolutePath());
			            
			            
			            TextFileParser parser = null;
			            if (selectedFile.getName().endsWith(".csv")) {
			            	parser = new CSVParser(); }
			            else if (selectedFile.getName().endsWith(".tsv")) {
			            	parser = new TSVParser(); }
			            else {
			            	String errorMessage = "Please choose a CSV or TSV file!";
			            	JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
			            	fileContentArea.setText("");
			            }
			            
			            if (parser != null) {
			            String fileContent = parser.readFile(selectedFile.getAbsolutePath());
			            fileContentArea.setText(fileContent);
			            }
			            
			            
			        }
			}
		});
		
		int buttonStartXLoc = 80;
		int buttonStartYLoc = 320;
		int buttonHeight = 25;
		int buttonWidth = 250;
		 //Dosyayı kaydetme butonunu ekliyoruz
		this.fileSaveButton = new  JButton("Save File (output.txt)");
		this.fileSaveButton.setLocation(buttonStartXLoc, buttonStartYLoc);
		this.fileSaveButton.setSize(buttonWidth, buttonHeight);
		this.getContentPane().add(fileSaveButton);
		
		this.fileSaveButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				try (FileWriter writer = new FileWriter("output.txt")) {
					
					writer.write(fileContentArea.getText());
					writer.flush();
					
					String saveMessage = "Your file has been saved as 'output.txt'!";
					JOptionPane.showMessageDialog(null, saveMessage, "Save successful!", JOptionPane.INFORMATION_MESSAGE);
					
					
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				
				

			}
		});
		
		//Veritabanına kaydetme butonunu ekliyoruz
		this.dbSaveButton = new  JButton("Save Database (Students table)");
		this.dbSaveButton.setLocation(buttonStartXLoc, buttonStartYLoc+(2*buttonHeight));
		this.dbSaveButton.setSize(buttonWidth, buttonHeight);
		this.getContentPane().add(dbSaveButton);
		
		
		this.dbSaveButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					StudentDAO sDAO = new StudentDAO();
					sDAO.insert(fileContentArea.getText());
					String saveDBMessage = "Your data has been saved to the database!";
					JOptionPane.showMessageDialog(null, saveDBMessage, "Database save successful!", JOptionPane.INFORMATION_MESSAGE);
					
					
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				
				
			}
	
		});
	

	}
	
}