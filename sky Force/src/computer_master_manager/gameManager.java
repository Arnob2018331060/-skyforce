package computer_master_manager;
import java.awt.Graphics;
import computer_master_entity.Player;
import computer_master_setUp.gameSetUp;
public class gameManager {
	private Player player;
	public gameManager() {
		
	}
	public void init() {
	player=new Player((gameSetUp.gameWidth/2)+50,(gameSetUp.gameHeight-30)+50);
	player.init();
	}
public void tick() {
	player.tick();
}
public void render(Graphics g) {
	player.render(g);
}
}
