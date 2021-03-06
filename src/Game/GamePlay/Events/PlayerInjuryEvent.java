package Game.GamePlay.Events;

import Game.GamePlay.GamePlayer;
import Utils.Event.Event;
import Utils.Signature;

public final class PlayerInjuryEvent extends Event {
    public final static String NAME  = "Player Injured";

    private final GamePlayer injuredPlayer;
//    Should also have a thing here to tell what kind of injury they suffered

    public PlayerInjuryEvent(final Signature signature, final GamePlayer player) {
        super(signature, NAME);
        injuredPlayer = player;
    }

    public final GamePlayer getInjuredPlayer(){
        return injuredPlayer;
    }

    @Override
    public String toString() {
        return getType()+" | "+injuredPlayer;
    }
}
