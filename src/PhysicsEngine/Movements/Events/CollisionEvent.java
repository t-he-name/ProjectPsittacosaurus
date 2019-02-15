package PhysicsEngine.Movements.Events;

import Event.Event;
import Game.GamePlay.GamePlayer;
import Tuple.Tuple2;
import Utils.Signature;

public final class CollisionEvent extends Event {

    private final GamePlayer mPlayer1;
    private final GamePlayer mPlayer2;

    public CollisionEvent(final Signature signature, final GamePlayer player1, final GamePlayer player2){
        super(signature, new CollisionEventType());
        mPlayer1 = player1;
        mPlayer2 = player2;
    }

    public final Tuple2<GamePlayer, GamePlayer> getCollisionPair(){
        return new Tuple2<>(mPlayer1, mPlayer2);
    }

    @Override
    public String toString() {
        return getType().getEventType()+" "+getCollisionPair();
    }
}