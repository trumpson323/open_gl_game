package org.engine;

import org.graphics.Renderer;
import org.test.TestPlayer;
import org.world.World;

public class Main {

	public static void main(String[] args) {
		Renderer.init();
		GameLoop.start();
		
		//test code
		World.addObject(new TestPlayer());
	}

}
