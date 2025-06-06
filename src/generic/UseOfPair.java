package generic;

public class UseOfPair {
    public static void main(String[] args) {
        Pair<String, Double> pair = new Pair<>("mohammad", 19.0);
        String name = pair.getFirst();
        Double avg = pair.getSecond();
        System.out.println(name);
        System.out.println(avg);

        Pair<String,String> pairTwo = new Pair<>("mohammad","aliani");
        String nameTwo = pairTwo.getFirst();
        String lastnameTwo = pairTwo.getSecond();
        System.out.println(nameTwo);
        System.out.println(lastnameTwo);

    }
}
