package application;

import java.awt.Label;

public class Element {
	private Label mainLabel; 
	private String fullText;
	private String shortText;

	/* 
	 * Initializes element object with given string value.
	 * @param String s String text that the element will contain.
	 */
	public Element(String s) {
		mainLabel.setText(s);
	}

	/*
	 * Sets text of element to specified string.
	 * @param String s String text that element will be changed to.
	 * 
	 */
	public void setText(String s) {
		mainLabel.setText(s);
	}

	/*
	 * Returns String containing text in the main label object.
	 */
	public String getText() {
		return mainLabel.getText();
	}

	/*
	 * Shortens text to length n and adds "..." for asthetics.
	 * If resulting string is longer than original, original is returned.
	 * @param n Int representing length to shorten to.
	 */
	public String shorten(int n) {
		shortText = "";
		
		if(n >= mainLabel.getText().length() - 3) {
			shortText = mainLabel.getText();
		}
		else {
			for(int i = 0; i < n; i++) {
				shortText += mainLabel.getText().charAt(i);
			}
			shortText += "...";
		}
		
		return shortText;
	}
}




