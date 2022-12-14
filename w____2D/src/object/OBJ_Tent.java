package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Tent extends Entity{	
	GamePanel gp;
	public static final String objName="Tent";	
	
	public OBJ_Tent(GamePanel gp) {
		super(gp);
		this.gp=gp;
		
		type=type_consumable;
		name=objName;
		down1=setUp("/objects/tent", gp.tileSize, gp.tileSize);
		description="["+name+"]\nYou can sleep until\nnext morning";
		price=300;
		stackable=true;
		
	}
	
	public boolean use(Entity entity) {
		
		gp.gameState=gp.sleepState;
		gp.playSE(14);
		gp.player.life=gp.player.maxLife;
		gp.player.mana=gp.player.maxMana;
		gp.player.getSleepingImage(down1);
		return true;
		
	}

}