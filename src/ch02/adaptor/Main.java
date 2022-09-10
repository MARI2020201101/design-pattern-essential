package ch02.adaptor;

class Main {
    public static void main(String[] args) {
        Print wrapper = new BannerWrapper("Hello");
        wrapper.printStrong();
        wrapper.printWeek();
    }
}
