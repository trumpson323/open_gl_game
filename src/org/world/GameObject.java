package org.world;

import org.graphics.Animation;
import org.graphics.Graphics;

public class GameObject {

	//remove static when done
	public float x = 0;
	public float y = 1;
	
	public float width = 1;
	public float height = 1;
	
	public float rotation = 0;
	
	public Animation[] animations;
	public int currentAnimation = 0;
	
	public void update() {
		
		
		
	}
	
	public void render() {
		
		
		animations[currentAnimation].play();
		Graphics.setRotation(rotation);
		Graphics.drawImage(animations[currentAnimation].getImage(), x, y, width, height);
		Graphics.setRotation(0);
		
	}
	
}
