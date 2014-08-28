public class GameClient {
    int[][] gameTiles = new int[4][12];
    final int xSpot = 1;
    final int oSpot = 2;

    // create a game client object
    public GameClient()
    {
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 12; j++)
            {
                gameTiles[i][j] = 0;
            }
        }
    }

    // register the placement of an x or an o
    public void registerPlacement(int row, int column, boolean xPlayer)
    {
        if (xPlayer)
        {
            gameTiles[row][column] = xSpot;
        }
        else
        {
            gameTiles[row][column] = oSpot;
        }
    }

    // other functions to run the game client go here
}
