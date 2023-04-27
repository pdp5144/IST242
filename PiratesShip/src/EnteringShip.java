public class EnteringShip extends MapTile{

    public EnteringShip(int x,int y){
        super(x, y);
    }


    public String intro_text() {
        return "\n You find yourself in a Room with a flickering lantern on the wall.\nYou can make out four paths, each equally as dark";
    }
    public void modify_player(Player player){

    }
}
