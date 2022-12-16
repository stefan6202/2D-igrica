package entity;

import main.GamePanel;

public class PlayerDummy extends Entity{

	public static final String npcName="Dummy";
	
	public PlayerDummy(GamePanel gp) {
		super(gp);
		
		name=npcName;
		
		getImage();
	}
	
	public void getImage() {
		bdown1=setUp("/player/boy_down_1",gp.tileSize,gp.tileSize);
		gdown1=setUp("/player/green_boy_down_1",gp.tileSize,gp.tileSize);
		rdown1=setUp("/player/red_boy_down_1",gp.tileSize,gp.tileSize);
		ydown1=setUp("/player/yellow_boy_down_1",gp.tileSize,gp.tileSize);
		wdown1=setUp("/player/white_boy_down_1",gp.tileSize,gp.tileSize);
		
		if(gp.player.boja==gp.player.plavi) {			
			up1=setUp("/player/boy_up_1",gp.tileSize,gp.tileSize);
			up2=setUp("/player/boy_up_2",gp.tileSize,gp.tileSize);
			down1=setUp("/player/boy_down_1",gp.tileSize,gp.tileSize);
			down2=setUp("/player/boy_down_2",gp.tileSize,gp.tileSize);
			left1=setUp("/player/boy_left_1",gp.tileSize,gp.tileSize);
			left2=setUp("/player/boy_left_2",gp.tileSize,gp.tileSize);
			right1=setUp("/player/boy_right_1",gp.tileSize,gp.tileSize);
			right2=setUp("/player/boy_right_2",gp.tileSize,gp.tileSize);			
		}
		else if(gp.player.boja==gp.player.zeleni) {
			up1=setUp("/player/green_boy_up_1",gp.tileSize,gp.tileSize);
			up2=setUp("/player/green_boy_up_2",gp.tileSize,gp.tileSize);
			down1=setUp("/player/green_boy_down_1",gp.tileSize,gp.tileSize);
			down2=setUp("/player/green_boy_down_2",gp.tileSize,gp.tileSize);
			left1=setUp("/player/green_boy_left_1",gp.tileSize,gp.tileSize);
			left2=setUp("/player/green_boy_left_2",gp.tileSize,gp.tileSize);
			right1=setUp("/player/green_boy_right_1",gp.tileSize,gp.tileSize);
			right2=setUp("/player/green_boy_right_2",gp.tileSize,gp.tileSize);
		}
		else if(gp.player.boja==gp.player.crveni) {
			up1=setUp("/player/red_boy_up_1",gp.tileSize,gp.tileSize);
			up2=setUp("/player/red_boy_up_2",gp.tileSize,gp.tileSize);
			down1=setUp("/player/red_boy_down_1",gp.tileSize,gp.tileSize);
			down2=setUp("/player/red_boy_down_2",gp.tileSize,gp.tileSize);
			left1=setUp("/player/red_boy_left_1",gp.tileSize,gp.tileSize);
			left2=setUp("/player/red_boy_left_2",gp.tileSize,gp.tileSize);
			right1=setUp("/player/red_boy_right_1",gp.tileSize,gp.tileSize);
			right2=setUp("/player/red_boy_right_2",gp.tileSize,gp.tileSize);
			
		}
		else if(gp.player.boja==gp.player.zuti) {
			up1=setUp("/player/yellow_boy_up_1",gp.tileSize,gp.tileSize);
			up2=setUp("/player/yellow_boy_up_2",gp.tileSize,gp.tileSize);
			down1=setUp("/player/yellow_boy_down_1",gp.tileSize,gp.tileSize);
			down2=setUp("/player/yellow_boy_down_2",gp.tileSize,gp.tileSize);
			left1=setUp("/player/yellow_boy_left_1",gp.tileSize,gp.tileSize);
			left2=setUp("/player/yellow_boy_left_2",gp.tileSize,gp.tileSize);
			right1=setUp("/player/yellow_boy_right_1",gp.tileSize,gp.tileSize);
			right2=setUp("/player/yellow_boy_right_2",gp.tileSize,gp.tileSize);
			
		}
		
	}
}
