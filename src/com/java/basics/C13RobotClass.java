package com.java.basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class C13RobotClass {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
		String filepath = null;
		cb.setContents(new StringSelection(filepath ), null);
		
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
	}
}
