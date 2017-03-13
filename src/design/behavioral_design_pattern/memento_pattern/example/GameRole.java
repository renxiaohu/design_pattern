package design.behavioral_design_pattern.memento_pattern.example;

/**
 * <p>游戏角色类</p>
 *  备忘录模式举例
 *  游戏大战Boss前 后恢复初始状态
 * Created by Administrator on 2017/3/6.
 */
public class GameRole {

    //生命力
    private int vit;

    //攻击力
    private int atk;

    //防御力
    private int def;

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    //保存角色状态
    public RoleStateMemento saveState(){
        return new RoleStateMemento(vit,atk,def);
    }
    //恢复角色状态
    public void recoverrySatte(RoleStateMemento roleStateMemento){
        this.vit = roleStateMemento.getVit();
        this.atk = roleStateMemento.getAtk();
        this.def = roleStateMemento.getDef();
    }
    //状态显示
    public void stateDisplay(){
        System.out.print("角色当前状态：\n");
        System.out.print("体力："+this.vit+"！\n");
        System.out.print("攻击力："+this.atk+"！\n");
        System.out.print("防御力："+this.def+"！\n");
    }
    //获得初始状态
    public void getInitState(){
        this.vit = 100;
        this.def = 100;
        this.atk = 100;
    }
    //战斗
    public void getFight(){
        this.vit = 0;
        this.def = 0;
        this.atk = 0;
    }
}
