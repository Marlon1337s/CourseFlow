package program;
import javax.swing.SwingUtilities;

import forms.FrmLogin;

public class Main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			FrmLogin frmPrincipal = new FrmLogin();
            frmPrincipal.setVisible(true);
        });

	}

}
