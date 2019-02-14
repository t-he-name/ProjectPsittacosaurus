package Game.Field;

import Tuple.Tuple2;

public enum Endzone {
    NORTH, SOUTH;

    public final Endzone getOpposite(){
        return this == NORTH ? SOUTH : NORTH;
    }

    public final boolean isNorth(){ return this.equals(NORTH); }
    public final boolean isSouth(){ return this.equals(SOUTH); }

    public final Tuple2<Double, Double> getGoalLocation(final FieldObject player){
        if(this == NORTH) return new Tuple2<>(player.getLocation().getFirst(), Field.ENDZONE_HEIGHT);
        else return new Tuple2<>(player.getLocation().getFirst(), Field.FIELD_HEIGHT-Field.ENDZONE_HEIGHT);
    }
}
