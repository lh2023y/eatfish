package eatfish;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;



public abstract class AllFather {
	public int level;
	int award;//0为向右，1为向左
	//定义等级
	
	//定义三种状态常量
	public static final int LIFE=0;//活着
	public static final int DEAD=1;//死的
	public static final int REMOVE=2;//消失
	//定义当前对象的状态属性
	protected int state=LIFE;//初始默认活着
		
	int x;
	int y;
	int width;
	int height;
	Random rand = new Random();
	//给怪
	
	public AllFather(int width, int height) {

		this.award=rand.nextInt(2);
		if(award==0) {
			this.x = 900+this.width;
			this.y = rand.nextInt((600 - this.height));
			this.width = width;
			this.height = height;
		}else if(award==1){
			this.x = -300-this.width;
			this.y = rand.nextInt((600 - this.height));
			this.width = width;
			this.height = height;
		}
	}
	/** 给天空 英雄机 子弹 */
	public AllFather(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	public abstract BufferedImage getImages();
	// 移动的方法
	public abstract void step();
	public abstract void step2();

		/** 画图片的方法 */
		public void paintObject(Graphics g) {
			if(getImages()!=null) {
				g.drawImage(getImages(), x, y, null);
			}
			
		}

		/*
		 * enemy[0].hit(hero)
		 */
		/** 碰撞 */
		public boolean hit(AllFather f) {
			// this.想象为子弹,f想象为一架敌机
			int x1 = f.x - this.width;// 左侧点
			int x2 = f.x + f.width;// 右侧点

			int y1 = f.y - this.height;// 上方点
			int y2 = f.y + f.height;// 下方点

			return this.x > x1 && this.x < x2 && this.y > y1 && this.y < y2;
		}
}
