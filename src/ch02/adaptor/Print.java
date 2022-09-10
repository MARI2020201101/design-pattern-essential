package ch02.adaptor;

interface Print {
    void printWeek();
    void printStrong();
}
class BannerWrapper extends Banner implements Print{

    public BannerWrapper(String string) {
        super(string);
    }

    @Override
    public void printWeek() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}