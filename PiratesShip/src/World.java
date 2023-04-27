import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
public class World {
    // Class level variables
    public static String[][] _world; // two dimension array
    static Point Starting_Position = new Point(0,0);
    public static ArrayList<MapTile> history = new ArrayList<MapTile>();

    public void load_tiles(){
        List<String> rows = new ArrayList<String>();
        try{//Reading map.txt
            BufferedReader f = new BufferedReader(new FileReader("src/map.txt"));
            String row;
            while ((row = f.readLine()) != null) {
                rows.add(row);
            }
            f.close();// Closing file
            int x_max = rows.get(0).split("\t").length;
            _world = new String[rows.size()][x_max];
            String[] cols;
            String title_name;
            //Nested function for two-dimensional for loop
            // control loop
            for (int y = 0; y < rows.size(); y++) {
                cols = rows.get(y).split("\t");
                // Counter control loop
                for (int x = 0; x < x_max && x < cols.length; x++) {
                    title_name = cols[x];
                    if (title_name.equals("EnteringShip")) {
                        Starting_Position.x = y;
                        Starting_Position.y = x;
                    }
                    _world[y][x] = title_name.equals(" ") ? null : title_name;
                }
            }
            System.out.println(_world);
        } //Closing try
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static MapTile tile_exists(int x, int y){
        MapTile mt = null;



        if ((x >= 0 && x < _world.length) && (y >= 0 && y < _world[0].length)
                && _world[x][y] != null) {
            switch (_world[x][y]){
                case "EnteringShip":
                    mt = new EnteringShip(x, y);
                    mt = checkRoomExists(mt);
                    break;

                case "TreasureRoom":

                    mt = new TreasureRoom(x, y, new Gold(30));
                    mt = checkRoomExists(mt);
                    break;
                case "SirCrocodileRoom":
                    mt = new SirCrocodileRoom(x, y, new SirCrocodile("Power of the Sand-Sand Fruit control and transform into sand"));
                    mt = checkRoomExists(mt);
                    break;
                case "DoflamingoRoom":
                    mt = new DoflamingoRoom(x, y, new Doflamingo("Power of String-String Devil Fruit create and manipulate strings"));
                    mt = checkRoomExists(mt);
                    break;
                case "EmptyRoom":
                    mt = new EmptyRoom(x, y);
                    break;
                case "KaidoRoom":
                    mt = new KaidoRoom(x, y, new Kaido("Power of Devil Fruit that his ability to transform into a Beast Dragon"));
                    mt = checkRoomExists(mt);
                    break;
                case "GeckoMoriaRoom":
                    mt = new GeckoMoriaRoom(x, y, new GeckoMoria("Power of the Shadow-Shadow Fruit manipulate shadows and create zombie-like creatures"));
                    mt = checkRoomExists(mt);
                    break;
                case "LeaveShip":
                    mt = new LeaveShip(x, y);
                    break;
            }
        }
        return mt;
    }

    private static MapTile checkRoomExists(MapTile mt){
        if(history.indexOf(mt) != -1){
            mt = history.get(history.indexOf(mt));
        }else{
            history.add(mt);
        }
        return mt;
    }
}