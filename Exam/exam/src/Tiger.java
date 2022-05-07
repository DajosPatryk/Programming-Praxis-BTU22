public class Tiger extends Katze implements Grosskatze{
    public Tiger(String name) {
        super(name, 0);
    }

    @Override
    public void bruellen() {
        System.out.println("ROAARRRR");
    }
}
