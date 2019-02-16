package Game.GamePlay.PlayerStrategy.Defense;

import Game.GamePlay.GameField;
import Game.GamePlay.GamePlayer;
import Game.GamePlay.PlayerInfluence;
import Game.GamePlay.PlayerStrategy.BasePlayerStrategy;
import Game.IGamePlayerOwner;
import PhysicsEngine.Movements.MovementInstruction;
import Tuple.Tuple2;

import java.util.List;

public class CoverageStrategy extends BasePlayerStrategy {

    @Override
    public void calculateMove(final GamePlayer hostPlayer, final GameField field) {

    }

    @Override
    public MovementInstruction getMove() {
        return null;
    }

    @Override
    public Tuple2<Double, Double> calculateGoal(GamePlayer hostPlayer, GameField field, IGamePlayerOwner hostTeam) {
        return null;
    }

    @Override
    public List<PlayerInfluence> getInfluences(GamePlayer hostPlayer, GameField field) {
        return null;
    }
}
