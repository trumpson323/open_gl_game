package org.test;

import org.graphics.Animation;
import org.resource.ImageResource;
import org.world.GameObject;

public class TestPlayer extends GameObject {

	public TestPlayer () {
		animations = new Animation[3];
		animations[0] = new Animation();
		animations[0].frames = new ImageResource[3];
		animations[0].frames[1] = new ImageResource("/res/Saved Pictures/tile000.png");
		animations[1].frames[1] = new ImageResource("/res/Saved Pictures/tile001.png");
		animations[2].frames[2] = new ImageResource("/res/Saved Pictures/tile002.png");
	}
	public void update() {
		x += 0.1f;
	}

	
}
