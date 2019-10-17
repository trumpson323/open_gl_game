package org.engine;

import org.graphics.Renderer;
import org.world.World;

public class GameLoop {

	private static boolean running = false;
	
	private static int updates = 0;
	private static int MAX_UPDATES = 5;
	
	private static long lastUpdateTime = 0;
	
	private static  int targetFPS = 30;
	private static int targetTime = 1000000000 / targetFPS;
	
	public static void start () {
		Thread thread = new Thread() {
			public void run () {
				
				running = true;
				
				lastUpdateTime = System.nanoTime();
				
				while (running) {
					long currentTime = System.nanoTime();
					
					updates = 0;
					
					while (currentTime - lastUpdateTime > targetTime) {
						World.update();
						lastUpdateTime += targetTime;
						updates++;
						
						if(updates > MAX_UPDATES) {
							break;
						}
					}
					
					Renderer.render();
					
					
					long timeTaken = System.nanoTime() - currentTime;
					if(targetTime > timeTaken) {
						try {
							Thread.sleep((targetTime - timeTaken) / 1000000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
					/*
					long startTime = System.nanoTime();
					
					World.update();
					
					Renderer.render();
					
					long timeTaken = System.nanoTime() - startTime;
					
					if (timeTaken < targetTime) {
						try {
							Thread.sleep((targetTime - timeTaken) / 1000000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				 */
				}
			}
		};
		thread.setName("Game Loop");
		thread.start();
	}
	
	public static float updateDelta() {
		return 1.0f / 1000000000 * targetTime;
	}
	
}