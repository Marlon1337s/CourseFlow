package Front.Curse.Drawer;

import Front.Curse.Form.AlunosForm;
import Front.Curse.Form.CursosForm;
import Front.Curse.Form.ProfessorForm;
import Front.Curse.Form.TurmaForm;
import Front.Curse.Tabbed.WindowsTabbed;
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
public class MydrawerBuilder extends SimpleDrawerBuilder {

    @Override
    public SimpleHeaderData getSimpleHeaderData() {
        return new SimpleHeaderData()
                .setIcon(new AvatarIcon(getClass().getResource("../Image/PerfilADM.jpg"), 60, 60, 999))
                .setTitle("Admin")
                .setDescription("curseflow@gmail.com");
    }

    @Override //Nome dos Menus
    public SimpleMenuOption getSimpleMenuOption() {
        String menus[][] = {
            {"~MENU~"},
            {"Alunos"},
            {"Cursos"},
            {"Professores"},
            {"Turmas"}};

        //icones dos Menus
        String icons[] = {
            "dashboard.svg",
            "ui.svg",
            "forms.svg",
            "chart.svg",};

        return new SimpleMenuOption()
                .setMenus(menus)
                .setIcons(icons)
                .setBaseIconPath("Front/Curse/Drawer/Icon")
                .setIconScale(0.45f)
                .addMenuEvent(new MenuEvent() {
                    @Override
                    public void selected(MenuAction action, int index, int subIndex) {
                        if (index >= 0 && index <= 4) {
                            // Abra a tela correspondente ao índice
                            switch (index) {
                                case 0:
                                    WindowsTabbed.getInstance().addTab("Alunos", new AlunosForm());
                                    break;
                                // Adicione mais casos conforme necessário para os índices 1, 2, 3, 4
                                case 1:
                                    WindowsTabbed.getInstance().addTab("Cursos", new CursosForm());
                                    break;
                                case 2:
                                    // Abra a tela correspondente ao índice 2
                                    WindowsTabbed.getInstance().addTab("Professor", new ProfessorForm());
                                    break;
                                case 3:
                                    // Abra a tela correspondente ao índice 3
                                    WindowsTabbed.getInstance().addTab("Turma", new TurmaForm());
                                    break;
                                default:
                                    break;

                            }
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
