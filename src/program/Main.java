package program;
import javax.swing.SwingUtilities;

import forms.gui.FrmLogin;

public class Main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			FrmLogin frmLogin = new FrmLogin();
            frmLogin.setVisible(true);
        });
	}
}
