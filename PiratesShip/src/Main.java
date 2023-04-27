public class Main {
    public static void main(String[] args) {


        Gold Goldcoin = new Gold(30);
        Apple GreenApple = new Apple(10,20);


        Kaido Emperor = new Kaido("Can turn into Demonic Dragon");
       GeckoMoria Shichibukai = new GeckoMoria("Power of the Shadow-Shadow Fruit manipulate shadows and create zombie-like creatures");
       Doflamingo Donquixote = new Doflamingo("Power of String-String Fruit create and manipulate strings");
       SirCrocodile HookFinger = new SirCrocodile(" Power of the Sand-Sand Fruit control and transform into sand");
        World world = new World();
        world.load_tiles();

       System.out.println(Goldcoin);
        System.out.println(GreenApple);
        System.out.println(Emperor);
        System.out.println(Shichibukai);
        System.out.println(Donquixote);
        System.out.println(HookFinger);
    }
}