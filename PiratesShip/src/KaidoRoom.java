public class KaidoRoom extends EnemyRoom {
    Kaido enemy;
    public KaidoRoom(int x, int y, Kaido enemy){
        super(x, y, enemy);
        this.enemy=enemy;
    }
    public String intro_text(){
        if (enemy.is_alive()){
            return " Fire Flames comes out and approaches you !!!";
        }else{
            return "Turns back to normal from dragon and collapse on the ground.";
        }
    }
}
