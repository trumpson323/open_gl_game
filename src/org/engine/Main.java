package org.engine;

import org.graphics.Renderer;
import org.test.TestPlayer;
import org.world.World;
import org.world.tiles.GrassTiles;

public class Main {

	public static void main(String[] args) {
		Renderer.init();
		GameLoop.start();
		
		//test code
		World.addTile(new GrassTiles());
		World.addObject(new TestPlayer());
	}

}
