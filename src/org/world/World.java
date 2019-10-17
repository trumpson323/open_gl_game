package org.world;

import java.util.concurrent.ConcurrentLinkedQueue;

import org.graphics.Graphics;

public class World {

	
	private static ConcurrentLinkedQueue<Tile> tiles = new ConcurrentLinkedQueue<Tile>();

	private static ConcurrentLinkedQueue<GameObject> gameObjects = new ConcurrentLinkedQueue<GameObject>();
	
	public static void update() {
		
		for (GameObject go : gameObjects) {
			go.update();
		}
		
	}
	
	public static void render() {
	
		//Tile.tiles[0].render(0, 0);
		
		for (GameObject go : gameObjects) {
			go.render();
		}
	
	}
	
	public static void addObject(GameObject go) {
		gameObjects.offer(go);
	}
	public static void addTile(Tile tile) {
		tiles.offer(tile);
	}
}
