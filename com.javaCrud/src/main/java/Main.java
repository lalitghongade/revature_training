import java.util.List;

import com.BussinesException.BusinessException;
import com.javaCrud.PlayerDAO;
import com.javaCrud.PlayerDAOImpl;
import com.javaCrud.model.Player;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		PlayerDAO pl = new PlayerDAOImpl();
		
		try {
			List<Player> playerlist =pl.getAllPlayers();
			for(Player player:playerlist) {
				System.out.println(player);
			}
			
			
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		//
      Player player = new Player(101, "MS Dhoni", 35, "Ranchi", "M","Cricket", 9892412328L);

      try {
          if(pl.createPlayer(player) == 1) {
              System.out.println("\n\nPlayer created with below details successfully");
              System.out.println(player);
          }
      } catch (BusinessException e) {
          e.printStackTrace();
      }

      try {
          if (pl.updatePlayer(100, 9987406550L) == 1) {
              System.out.println("\n\nPlayer updated with below details successfully");
              System.out.println(player);
          }
      } catch (BusinessException e) {
          e.printStackTrace();
      }


      try {
          if (pl.deletePlayer(101) == 1) {
              System.out.println("\n\nPlayer deleted successfully...");
          }
      } catch (BusinessException e) {
          e.printStackTrace();
      }


 }


		
		
		

	}


