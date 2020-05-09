package eatfish;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import utils.GetImg;

public class Pic extends AllFather{
	
	private static BufferedImage imgs;
	static {
		
		imgs=GetImg.read("background2.jpg");
		
	}
	//无参构造
	public Pic() {
		super(0,0,900, 600);
		// TODO Auto-generated constructor stub
	}
	int index=0;
	public BufferedImage getImages() {
		return imgs;
		//[index++%imgs.length];
	}
	public void step() {
		
	}
	public void paintObject(Graphics g) {
		g.drawImage(getImages(), x, y, null);

	}
	@Override
	public void step2() {
		// TODO Auto-generated method stub
		
	}
}
