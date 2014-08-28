import AIBots.*;

public class AISetup
{
    public static AIBot setupAI(AIPlayers player, boolean xPlayer)
    {
        AIBot newPlayer = null;

        // here we create an object
        switch (player)
        {
            case HEURISTICPLAYER:
                newPlayer = new HeuristicBot();
                break;
            case CLASSIFIERPLAYER:
                newPlayer = new ClassifierBot();
                break;
            case NEURALNETWORKPLAYER:
                newPlayer = new NeuralNetworkBot();
                break;
            case MINMAXPLAYER:
                newPlayer = new MinMaxBot();
                break;
            case ALPHABETAPRUNINGPLAYER:
                newPlayer = new AlphaBetaPruningBot();
                break;
            default:
                System.out.println("Houston we have a problem!");
        }
        return newPlayer;
    }
}
