package Game.PlayerStrategy.Defense;

import Game.Field.Location;
import Game.Field.Vector;
import Game.GameField;
import Game.GamePlayer;
import PhysicsEngine.MovementInstruction;

public class RusherStrategy extends DefensivePlayerStrategy {

    private MovementInstruction move = null;

    @Override
    public void calculateMove(final GamePlayer hostPlayer, final GameField field) {



        move = new MovementInstruction(hostPlayer, new Vector(new Location(0, -1)));

    }

    @Override
    public MovementInstruction getMove() {
        return move;
    }
}