package Front.Curse.Drawer;

import Front.Curse.Form.AlunosForm;
import Front.Curse.Tabbed.WindowsTabbed;
import java.awt.desktop.AppHiddenEvent;
import raven.drawer.component.SimpleDrawerBuilder;
import raven.drawer.component.footer.SimpleFooterData;
import raven.drawer.component.header.SimpleHeaderData;
import raven.drawer.component.menu.MenuAction;
import raven.drawer.component.menu.MenuEvent;
import raven.drawer.component.menu.MenuValidation;
import raven.drawer.component.menu.SimpleMenuOption;
import raven.swing.AvatarIcon;

/**
 *
 * @author Bruno H
 */
public class MydrawerBuilder extends SimpleDrawerBuilder{

    @Override
    public SimpleHeaderData getSimpleHeaderData() {
          return new SimpleHeaderData()
                .setIcon(new AvatarIcon(getClass().getResource("/Curse/Image/PerfilADM.jpg"), 60, 60, 999))
                .setTitle("Admin")
                .setDescription("curseflow@gmail.com");
    }

    @Override //Nome dos Menus
    public SimpleMenuOption getSimpleMenuOption() {
      String menus[][] = {
            {"~MAIN~"},
            {"Dashboard"},
            {"~MENU~"},
            {"Alunos"},
            {"Cursos"},
            {"Professores"},
            {"Turmas"},
            {"Logout"}};

         //icones dos Menus
        String icons[] = {
            "dashboard.svg",
            "ui.svg",
            "forms.svg",
            "chart.svg",
            "icon.svg",
            "Logout.svg",};

        return new SimpleMenuOption()
                .setMenus(menus)
                .setIcons(icons)
                .setBaseIconPath("Curse/Drawer/Icon")
                .setIconScale(0.45f)
                .addMenuEvent(new MenuEvent() {
                    @Override
                    public void selected(MenuAction action, int index, int subIndex) {
                        if(index==0){
                            WindowsTabbed.getInstance().addTab("Aluno", new AlunosForm());
                        }
                        System.out.println("Menu selected " + index + " " + subIndex);
                    }
                })
                .setMenuValidation(new MenuValidation() {
                    @Override
                    public boolean menuValidation(int index, int subIndex) {
//                        if(index==0){
//                            return false;
//                        }else if(index==3){
//                            return false;
//                        }
                        return true;
                    }

                });
    }
    @Override
    public SimpleFooterData getSimpleFooterData() {
        return new SimpleFooterData()
                .setTitle("CurseFlow")
                .setDescription("Version 0.0.1");
    }
    
}