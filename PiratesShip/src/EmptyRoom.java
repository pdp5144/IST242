public class EmptyRoom extends MapTile {
    private String desc;

    public EmptyRoom(int x, int y) {
        super(x, y);
        desc = "Empty room with creaking floorboards, rusty walls and feels presence of super natural entities";
    }
    public String intro_text() {
        return desc;
    }

    @Override
    public void modify_player(Player player) {
    }
}
