package org.test;


import org.engine.GameLoop;
import org.graphics.Animation;
import org.graphics.Renderer;
import org.input.KeyInput;
import org.resource.ImageResource;
import org.world.GameObject;

import com.jogamp.newt.event.KeyEvent;

public class TestPlayer extends GameObject {

	public float runSpeed = 2.0f;
	
	public TestPlayer () {
		animations = new Animation[2];
		animations[0] = new Animation();
		animations[0].frames = new ImageResource[1];
		animations[0].frames[0] = new ImageResource("/res/image_2.png");
		
		//animations[0].frames[1] = new ImageResource("/res/Saved Pictures/tile001.png");
		//animations[0].frames[2] = new ImageResource("/res/Saved Pictures/tile002.png");
	}
	public void update() {
		float xInput = 0;
		float yInput = 0;
		
		if (KeyInput.getKey(KeyEvent.VK_LEFT)) {
			xInput-=3;
		}
		
		if (KeyInput.getKey(KeyEvent.VK_RIGHT)) {
			xInput+=3;
		}
		
		if (KeyInput.getKey(KeyEvent.VK_UP)) {
			yInput+=3;
		}
		
		if (KeyInput.getKey(KeyEvent.VK_DOWN)) {
			yInput-=3;
		}
		
		
		x += xInput * GameLoop.updateDelta();
		y += yInput * GameLoop.updateDelta();
		
		Renderer.cameraX = x;
		Renderer.cameraY = y;
		
	}

	
}
