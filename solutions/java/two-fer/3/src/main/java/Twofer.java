public class Twofer {
    public String twofer(String name) {
        String recipient = (name == null) ? "you" : name;
        return "One for " + recipient + ", one for me.";
    }
}
