public class GeckoMoriaRoom extends EnemyRoom{
    GeckoMoria enemy;
    public GeckoMoriaRoom(int x, int y, GeckoMoria enemy){
        super(x, y, enemy);
        this.enemy=enemy;
    }
    public String intro_text(){
        if (enemy.is_alive()){
            return " A Black Shadows comes out and approaches you with the speed on light!!!";
        }else{
            return "Hundred's of Shadows comes out from the corps.";
        }
    }
}
