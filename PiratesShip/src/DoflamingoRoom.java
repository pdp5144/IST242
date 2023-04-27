public class DoflamingoRoom extends EnemyRoom{
    Doflamingo enemy;
    public DoflamingoRoom(int x, int y, Doflamingo enemy){
        super(x, y, enemy);
        this.enemy=enemy;
    }
    public String intro_text(){
        if (enemy.is_alive()){
            return " White Strings comes out to heal the wounds!!!";
        }else{
            return "White color bloods comes out from the corps and then turn into Ash.";
        }
    }
}
