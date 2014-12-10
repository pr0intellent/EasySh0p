import javax.swing.*;

public class MoreInputWindow
{
	public static void main(String[] args)		
	{
		// Eingabefelder aufbauen -- erstelle Array und belege es mit Werten -- hier sind jetzt 3 Felder erstellt mit Index(feld) 0 , 1 und 2
		JTextField[] feld = {new JTextField(), new JTextField(), new JTextField(), new JTextField(), new JTextField()};
		Object[] msg = {"Name:", feld[0], "Anzahl:", feld[1], "Einzelpreis:", feld[2], "Gesamtpreis:", feld[3]};

		// Dialogfenster anzeigen		object aufrufen mit msg, "Argument=Eingabe", 2="wie es aussehen soll" oder JOptionPane.YES_NO_OPTION); 
		//JOptionPane.showConfirmDialog(null, msg, "Eingabe", 2);
		//JOptionPane.showConfirmDialog(null, msg, "Eingabe", JOptionPane.YES_NO_OPTION);
		//JOptionPane.showConfirmDialog(null, msg, "Eingabe", JOptionPane.YES_NO_CANCEL_OPTION);
		JOptionPane.showConfirmDialog(null, msg, "Neuen Artikel hinzuf\u00fcgen", JOptionPane.OK_CANCEL_OPTION);

		// Benutzereingabe erfragen
		JOptionPane.showMessageDialog(null, feld[0].getText() + " wurden erfolgreich eingetragen ");

	}
}