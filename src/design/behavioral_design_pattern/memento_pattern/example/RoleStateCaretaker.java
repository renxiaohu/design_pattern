package design.behavioral_design_pattern.memento_pattern.example;

/**
 * <p>角色状态管理者</p>
 * Created by Administrator on 2017/3/6.
 */
public class RoleStateCaretaker {
    private RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
