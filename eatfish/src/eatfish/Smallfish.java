package eatfish;

import java.awt.image.BufferedImage;


import utils.GetImg;

public class Smallfish extends AllFather{
	
	static BufferedImage[] imgs= {};
	
	static {
		imgs=new BufferedImage[2];
		//imgs=new BufferedImage[2];
		imgs[0]=GetImg.read("smallfish1.png");
		imgs[1]=GetImg.read("smallfish2.png");

	}
	public Smallfish() {
		
		// TODO Auto-generated constructor stub
		super(50,44);
		super.level=1;

		
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
	int aw=rand.nextInt(20);
	@Override
	public void step() {
		// TODO Auto-generated method stub
		x-=2;
		if(aw>14) {
			y+=1;
		}
		if(aw<14&&aw>7 ) {
			y-=1;
		}
		if(aw<10) {
			
		}
	}
	@Override
	public void step2() {
		x+=2;
		if(aw>14) {
			y+=1;
		}
		if(aw<14&&aw>7 ) {
			y-=1;
		}
		if(aw<10) {
			
		}
	}

}
