package org.input;



import com.jogamp.newt.event.InputEvent;
import com.jogamp.newt.event.KeyEvent;
import com.jogamp.newt.event.KeyListener;

public class KeyInput implements KeyListener{
	
	private static boolean[] keys = new boolean[256];
	
	@Override
	public void keyPressed(KeyEvent e) {
		if( 0 == ( InputEvent.AUTOREPEAT_MASK & e.getModifiers() ) )  { 
			keys[e.getKeyCode()] = true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		
		if( 0 == ( InputEvent.AUTOREPEAT_MASK & e.getModifiers() ) )  { 
			keys[e.getKeyCode()] = false;
			}
		
	}

	public static boolean getKey (int keyCode) {
		return keys[keyCode];
	}
}
