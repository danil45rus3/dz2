public class Main {
    public static void main(String[] args) {
        MyArrayList<Number> numberMyArrayList = new MyArrayList<>(15);
        numberMyArrayList.add(22);
        numberMyArrayList.add(51);
        System.out.println(numberMyArrayList.get(0));
        numberMyArrayList.remove(0);
        System.out.println(numberMyArrayList.size());
    }
}