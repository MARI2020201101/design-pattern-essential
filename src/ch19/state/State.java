package ch19.state;

interface State {
    void doClock(Context context, int hour);
    void doUse(Context context);
    void doAlarm(Context context);
    void doCall(Context context);
}
class DayState implements State{

    private static final DayState dayState = new DayState();
    public static DayState getInstance(){
        return dayState;
    }
    private DayState(){}

    @Override
    public void doClock(Context context, int hour) {
        if(hour > 18 || hour < 6){
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.doLog("[주간] 사용");
    }

    @Override
    public void doAlarm(Context context) {
        context.doInform("[주간] 비상벨");
    }

    @Override
    public void doCall(Context context) {
        context.doCall("[주간] 전화 호출");
    }
}
class NightState implements State{
    private static final NightState nightState = new NightState();
    public static NightState getInstance(){
        return nightState;
    }
    private NightState(){}
    @Override
    public void doClock(Context context, int hour) {
        if(hour <= 18 && hour >= 6){
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.doInform("[야간] 사용");
    }

    @Override
    public void doAlarm(Context context) {
        context.doInform("[야간] 비상벨");
    }

    @Override
    public void doCall(Context context) {
        context.doCall("[야간] 녹음 전화 호출");
    }
}