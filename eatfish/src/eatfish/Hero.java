package eatfish;

import java.awt.image.BufferedImage;

import utils.GetImg;

public class Hero extends AllFather{
	public int level=1;
	/*int tx;
	int ty;*/
	public static int God=4; 
	int life=3;
	//记录上一个x坐标
	int lx;
	//方向
	int award=1;
	//经验
	int jy=0;
	//移动速度
	int maxsp=3;
	int lsp=0;
	int rsp=0;
	int usp=0;
	int dsp=0;
	int a=1;
	
	boolean W = false;
	boolean S = false;
	boolean A = false;
	boolean D = false;
	static BufferedImage[] imgs;
	static {
		imgs=new BufferedImage[6];
		imgs[0]=GetImg.read("hero1.png");
		imgs[1]=GetImg.read("hero2.png");
		imgs[2]=GetImg.read("2r.png");
		imgs[3]=GetImg.read("2l.png");
		imgs[4]=GetImg.read("hr.png");
		imgs[5]=GetImg.read("hl.png");
		
	}
	public Hero() {
		super(450,300,70, 40);
	}
	public BufferedImage lp;
	@Override
	public BufferedImage getImages() {
		//给鼠标用的
		/*if(x-lx<0) {
			award=1;
		}else if(x-lx>0){
			award=0;
		}else if(x-lx==0) {
			
		}*/
		if(level==2) {

			if(D==true) {
				lx=x;
				lp=imgs[2];
				return imgs[2];
			}
			if(A==true){
				lx=x;
				lp=imgs[3];
				return imgs[3];
			}
		}
		if(level==3) {
			if(D==true) {
				lx=x;
				lp=imgs[4];
				return imgs[4];
			}
			if(A==true){
				lx=x;
				lp=imgs[5];
				return imgs[5];
			}
		}
		// TODO Auto-generated method stub
		if(level==1){
			if(D==true) {
				lx=x;
				lp=imgs[0];
				return imgs[0];
			}
			if(A==true){
				lx=x;
				lp=imgs[1];
				return imgs[1];
			}
		}
		if(lp!=null) {
			return lp;
		}else {
			return imgs[0];
		}
	}

	@Override
	public void step() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void step2() {
		// TODO Auto-generated method stub
		
	}
	int aindex=0;
	int uindex=0;
	int dindex=0;
	int lindex=0;
	int rindex=0;
	public void herostep(){
		if(W==true) {
			if(dsp>0) {
				dindex++;
				if(dindex%30==0) {
					dsp-=a;
				}
				y+=dsp;
			}else {
				if(usp<maxsp-1) {
					aindex++;
					if(aindex%30==0) {
					usp+=a;
					}
				}
				y-=usp;
			}
		}
		if(A==true) {
			if(lsp<maxsp) {
				aindex++;
				if(aindex%30==0) {
					lsp+=a;
				}
			}
			x-=lsp;
		}
		if(D==true) {
			if(rsp<maxsp) {
				aindex++;
				if(aindex%30==0) {
					rsp+=a;
				}
			}
			x+=rsp;
		}
		if(S==true) {
			if(usp>0) {
				uindex++;
				if(uindex%30==0) {
					usp-=a;
				}
				y-=usp;
			}else {
				if(dsp<maxsp-1) {
					aindex++;
					if(aindex%30==0) {
						dsp+=a;
					}
				}
				y+=dsp;
			}
		}
		if(W==false) {
			if(usp!=0) {
				uindex++;
				if(uindex%20==0) {
					usp-=a;
				}
				y-=usp;
			}
		}
		if(A==false) {
			if(lsp!=0) {
				lindex++;
				if(lindex%20==0) {
					lsp-=a;
				}
				
				x-=lsp;
			}
		}
		if(S==false) {
			if(dsp!=0) {
				dindex++;
				if(dindex%20==0) {
					dsp-=a;
				}
				
				y+=dsp;
			}
		}
		if(D==false) {
			if(rsp!=0) {
				rindex++;
				if(rindex%20==0) {
					rsp-=a;
				}
				
				x+=rsp;
			}
		}
	}
	

}
