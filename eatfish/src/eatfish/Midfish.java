package eatfish;

import java.awt.image.BufferedImage;
import java.util.logging.Level;

import utils.GetImg;

public class Midfish extends AllFather{
	public int level=2;
	static BufferedImage[] imgs= {};
	
	static {
		imgs=new BufferedImage[2];
		//imgs=new BufferedImage[2];
		imgs[0]=GetImg.read("s1.png");
		imgs[1]=GetImg.read("s2.png");

	}
	public Midfish() {
		
		// TODO Auto-generated constructor stub
		super(120,60);
		super.level=2;
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
		// TODO Auto-generated method stub
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
