package eatfish;

import java.awt.image.BufferedImage;

import utils.GetImg;

public class Heart extends AllFather{
	
	BufferedImage img=GetImg.read("x.png");
	public Heart(int x,int y,int width,int height) {
		super(x,y,width,height);
	}
	@Override
	public BufferedImage getImages() {
		// TODO Auto-generated method stub
		return img;
	}

	@Override
	public void step() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void step2() {
		// TODO Auto-generated method stub
		
	}

}
