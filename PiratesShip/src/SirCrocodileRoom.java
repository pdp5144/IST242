public class SirCrocodileRoom extends EnemyRoom{
    SirCrocodile enemy;
    public SirCrocodileRoom(int x, int y, SirCrocodile enemy){
        super(x, y, enemy);
        this.enemy=enemy;
    }
    public String intro_text(){
        if (enemy.is_alive()){
            return " He takes out metal hook and approaches you !!!";
        }else{
            return "He turns into pill of sand.";
        }
    }
}
