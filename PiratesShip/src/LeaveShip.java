public class LeaveShip extends MapTile{
    private String desc;

    public LeaveShip(int x, int y) {
        super(x, y);
        desc = "You have safely made it out of 'PirateShip' with all Valuables";
    }
    public String intro_text(){
        return "\n You see a bright Light in the distance";
    }
    public void modify_player(Player player){
        player.victory = true;

    }
}
