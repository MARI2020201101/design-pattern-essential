package ch19.state;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

interface Context {
    void setClock(int hour);
    void changeState(State state);
    void doLog(String msg); //사용기록
    void doInform(String msg); //통보
    void doCall(String msg); //호출
}
class SafeFrame extends Frame implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}