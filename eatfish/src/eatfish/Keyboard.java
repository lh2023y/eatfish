package eatfish;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;

public class Keyboard {
	KeyListener s;
	

	public Keyboard() {
		this.s = new KeyAdapter() {
			/** 键盘松开方法 HeroObject.speed=7;松开某个键之后把移动恢复为原来的 */
			public void keyReleased(KeyEvent e) {
				int key = e.getKeyCode();
				switch (key) {
				case KeyEvent.VK_W:
					World.hero.W = false;
					
					break;
				case KeyEvent.VK_S:
					World.hero.S = false;
					
					break;
				case KeyEvent.VK_A:
					World.hero.A = false;
					
					break;
				case KeyEvent.VK_D:
					World.hero.D = false;
					
					break;
				}
			}

			int speet = 10;

			/** 键盘按下方法 HeroObject.speed=1;按下某个键（技能）之后把移动变慢 */
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyCode();
				switch (key) {
				case KeyEvent.VK_W:
					World.hero.W = true;
					//World.hero.y-=8;
					break;
				case KeyEvent.VK_S:
					World.hero.S = true;
					//World.hero.y+=8;
					break;
				case KeyEvent.VK_A:
					World.hero.A = true;
					//World.hero.x-=8;
					break;
				case KeyEvent.VK_D:
					World.hero.D = true;
					//World.hero.x+=8;
					break;
				case KeyEvent.VK_J:
					if(World.state==World.START) {
						World.state=World.RUNNING;
					}
					break;
				}

				
			}
			 
		};
	}
}
