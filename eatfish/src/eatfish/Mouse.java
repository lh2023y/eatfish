package eatfish;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**鼠标类*/
public class Mouse {
	MouseAdapter l;


	/**启动鼠标事件*/
	public  Mouse(){
		this.l = new MouseAdapter() {
			//鼠标移入时状态切换
			public void mouseEntered(MouseEvent e) {
				if(World.state==World.STOP) {
					World.state=World.RUNNING;
				}
				
			}
			//鼠标移出时的状态切换
			public void mouseExited(MouseEvent e) {
				World.state=World.STOP;
			}
			
			
			
			/** 鼠标按下事件 */
			public void mousePressed(MouseEvent e) {
				/*World.hero.tx = e.getX()-(World.hero.width/2);
				World.hero.ty = e.getY()-(World.hero.height/2);
				World.hero.spx = (e.getX()-(World.hero.width/2))/World.hero.x;
				World.hero.spy = (e.getY()-(World.hero.height/2))/World.hero.y;*/
			}

			/** 鼠标释放事件 */
			public void mouseReleased(MouseEvent e) {
				//当鼠标进入我们的那个一个位置
				//修改World类的状态为启动的
				//>x1  <x2 
				//>y1  <y2
			}
			/** 鼠标点击事件 */
			public void mouseClicked(MouseEvent e) {
				if(World.state==World.START) {
					World.state=World.RUNNING;
				}
				if(World.state==World.DEAD) {
					World.hero=new Hero();
					World.state=World.RUNNING;
					
				}
				
			}

			/** 鼠标移动事件 */
			public void mouseMoved(MouseEvent e) {
				/*World.hero.x = e.getX()-(World.hero.width/2);
				World.hero.y = e.getY()-(World.hero.height/2);*/
				
			}	
		};

	}
}
