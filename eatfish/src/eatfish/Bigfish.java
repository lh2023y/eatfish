package eatfish;

import java.awt.image.BufferedImage;


import utils.GetImg;

public class Bigfish extends AllFather{
	public int level=3;
	static BufferedImage[] imgs= {};
	
	static {
		imgs=new BufferedImage[2];
		//imgs=new BufferedImage[2];
		imgs[0]=GetImg.read("k1.png");
		imgs[1]=GetImg.read("k2.png");

	}
	public Bigfish() {
		
		// TODO Auto-generated constructor stub
		super(240,130);
		super.level=3;
	}
	@Override
	public BufferedImage getImages() {
		// TODO Auto-generated method stub
		if(state==LIFE) {
			if(award==0) {
				return imgs[0];
			}else if(award==1){
				return imgs[1];
			}
		}else {
			return null;
		}
		return null;
		
	}

	@Override
	public void step() {
		// TODO Auto-generated method stub
		x-=2;
	}
	@Override
	public void step2() {
		// TODO Auto-generated method stub
		x+=2;
	}

}
