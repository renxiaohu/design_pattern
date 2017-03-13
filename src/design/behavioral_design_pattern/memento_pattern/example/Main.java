package design.behavioral_design_pattern.memento_pattern.example;

/**
 * Created by Administrator on 2017/3/6.
 */
public class Main {
    public static void main(String arges[]){

        //大战boss前
        GameRole lixiaoyao = new GameRole();
        lixiaoyao.getInitState();
        lixiaoyao.stateDisplay();

        //保存进度
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setRoleStateMemento(lixiaoyao.saveState());

        //大战Boss时，耗损严重
        lixiaoyao.getFight();
        lixiaoyao.stateDisplay();

        //恢复之前状态
        lixiaoyao.recoverrySatte(roleStateCaretaker.getRoleStateMemento());
        lixiaoyao.stateDisplay();
    }
}
