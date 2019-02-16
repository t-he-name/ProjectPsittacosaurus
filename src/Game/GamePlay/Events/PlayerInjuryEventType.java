package Game.GamePlay.Events;

import Utils.Event.IEventType;

public final class PlayerInjuryEventType implements IEventType {
    public final static String NAME  = "Player Injured";

    @Override
    public String getEventType() {
        return NAME;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof IEventType){
            return ((IEventType) obj).getEventType().equals(getEventType());
        }
        return super.equals(obj);
    }
}