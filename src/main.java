import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Jaap van Gestel <18139027@student.hhs.nl> on 23-4-2019
 */
public class main {
    private static JFrame frame;
    private static final ButtonListener listener = new ButtonListener();

    private static final JMenuBar MENU_BAR = new JMenuBar();
    private static final JMenu BESTAND = new JMenu("Bestand");
    private static final JMenuItem AFSLUITEN = new JMenuItem("Afsluiten");

    private static final JMenu REGISTREREN = new JMenu("Registreren");
    private static final JMenuItem SPELER_TOEVOEGEN = new JMenuItem("Speler ");
    private static final JMenuItem TOERNOOI_TOEVOEGEN = new JMenuItem("Toernooi ");
    private static final JMenuItem TOERNOOI_INSCHRIJVING_TOEVOEGEN = new JMenuItem("Toernooi inschrijving ");
    private static final JMenuItem WINNAARS_REGISTREREN = new JMenuItem("Winnaars ");
    private static final JMenuItem MASTERCLASS_TOEVOEGEN = new JMenuItem("Masterclass ");
    private static final JMenuItem MASTERCLASS_INSCHRIJVING_TOEVOEGEN = new JMenuItem("Masterclass inschrijving ");
    private static final JMenuItem BEKENDE_SPELER_TOEVOEGEN = new JMenuItem("Bekende speler ");

    private static final JMenu WIJZIGEN = new JMenu("Wijzigen");
    private static final JMenuItem SPELER_WIJZIGEN = new JMenuItem("Speler ");
    private static final JMenuItem TOERNOOI_WIJZIGEN = new JMenuItem("Toernooi ");
    private static final JMenuItem TOERNOOI_INSCHRIJVING_WIJZIGEN = new JMenuItem("Toernooi inschrijving ");        //NODIG?
    private static final JMenuItem WINNAARS_WIJZIGEN = new JMenuItem("Winnaars ");
    private static final JMenuItem MASTERCLASS_WIJZIGEN = new JMenuItem("Masterclass ");
    private static final JMenuItem MASTERCLASS_INSCHRIJVING_WIJZIGEN = new JMenuItem("Masterclass inschrijving ");     //NODIG?
    private static final JMenuItem BEKENDE_SPELER_WIJZIGEN = new JMenuItem("Bekende speler ");               //NODIG?


    private static final JMenu VERWIJDEREN = new JMenu("Verwijderen");
    private static final JMenuItem SPELER_VERWIJDEREN = new JMenuItem("Speler ");
    private static final JMenuItem TOERNOOI_VERWIJDEREN = new JMenuItem("Toernooi ");
    private static final JMenuItem TOERNOOI_INSCHRIJVING_VERWIJDEREN = new JMenuItem("Toernooi inschrijving ");
    private static final JMenuItem WINNAARS_VERWIJDEREN = new JMenuItem("Winnaars ");                  //NODIG?
    private static final JMenuItem MASTERCLASS_VERWIJDEREN = new JMenuItem("Masterclass ");
    private static final JMenuItem MASTERCLASS_INSCHRIJVING_VERWIJDEREN = new JMenuItem("Masterclass inschrijving ");
    private static final JMenuItem BEKENDE_SPELER_VERWIJDEREN = new JMenuItem("Bekende speler ");


    private static final JMenu OVERZICHT = new JMenu("Overzicht");
    private static final JMenuItem GEREGISTREERDE_SPELERS = new JMenuItem("Geregistreerde speler");
    private static final JMenuItem GEPLANDE_TOERNOOIEN = new JMenuItem("Geplande toernooien");

    private static final JMenuItem INLEG_PER_TOERNOOI = new JMenuItem("Inleg per toernooi");
    private static final JMenuItem BEGIN_TAFELS = new JMenuItem("Aantal begin tafels");
    private static final JMenuItem TAFEL_INDELING = new JMenuItem("Tafel indeling");

    private static final JMenuItem WINNAARS = new JMenuItem("Winnaars");
    private static final JMenuItem WINNARS_PER_RONDE = new JMenuItem("Winnaars per ronde"); //NODIG?
    private static final JMenuItem WINNAARS_PER_TAFEL = new JMenuItem("Winnaars per tafel");
    private static final JMenuItem WINNAARS_PER_TOERNOOI = new JMenuItem("Winnaars per toernooi");

    private static final JMenuItem SPELERS_MET_X_RATING = new JMenuItem("Speler met bepaalde rating");


    public static void main(String[] args) {
        frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setJMenuBar(MENU_BAR);

        MENU_BAR.add(BESTAND);
        MENU_BAR.add(REGISTREREN);
        MENU_BAR.add(WIJZIGEN);
        MENU_BAR.add(VERWIJDEREN);
        MENU_BAR.add(OVERZICHT);

        BESTAND.add(AFSLUITEN);

        REGISTREREN.add(SPELER_TOEVOEGEN);
        REGISTREREN.add(TOERNOOI_TOEVOEGEN);
        REGISTREREN.add(TOERNOOI_INSCHRIJVING_TOEVOEGEN);
        REGISTREREN.add(WINNAARS_REGISTREREN);
        REGISTREREN.add(MASTERCLASS_TOEVOEGEN);
        REGISTREREN.add(MASTERCLASS_INSCHRIJVING_TOEVOEGEN);
        REGISTREREN.add(BEKENDE_SPELER_TOEVOEGEN);

        WIJZIGEN.add(SPELER_WIJZIGEN);
        WIJZIGEN.add(TOERNOOI_WIJZIGEN);
        WIJZIGEN.add(TOERNOOI_INSCHRIJVING_WIJZIGEN);
        WIJZIGEN.add(WINNAARS_WIJZIGEN);
        WIJZIGEN.add(MASTERCLASS_WIJZIGEN);
        WIJZIGEN.add(MASTERCLASS_INSCHRIJVING_WIJZIGEN);
        WIJZIGEN.add(BEKENDE_SPELER_WIJZIGEN);

        VERWIJDEREN.add(SPELER_VERWIJDEREN);
        VERWIJDEREN.add(TOERNOOI_VERWIJDEREN);
        VERWIJDEREN.add(TOERNOOI_INSCHRIJVING_VERWIJDEREN);
        VERWIJDEREN.add(WINNAARS_VERWIJDEREN);
        VERWIJDEREN.add(MASTERCLASS_VERWIJDEREN);
        VERWIJDEREN.add(MASTERCLASS_INSCHRIJVING_VERWIJDEREN);
        VERWIJDEREN.add(BEKENDE_SPELER_VERWIJDEREN);

        OVERZICHT.add(GEREGISTREERDE_SPELERS);
        OVERZICHT.add(GEPLANDE_TOERNOOIEN);
        OVERZICHT.add(INLEG_PER_TOERNOOI);
        OVERZICHT.add(BEGIN_TAFELS);
        OVERZICHT.add(TAFEL_INDELING);
        OVERZICHT.add(WINNAARS);
        OVERZICHT.add(SPELERS_MET_X_RATING);

        WINNAARS.add(WINNARS_PER_RONDE);
        WINNAARS.add(WINNAARS_PER_TAFEL);
        WINNAARS.add(WINNAARS_PER_TOERNOOI);

        AFSLUITEN.addActionListener(listener);

        SPELER_TOEVOEGEN.addActionListener(listener);
        TOERNOOI_TOEVOEGEN.addActionListener(listener);
        TOERNOOI_INSCHRIJVING_TOEVOEGEN.addActionListener(listener);
        WINNAARS_REGISTREREN.addActionListener(listener);
        MASTERCLASS_TOEVOEGEN.addActionListener(listener);
        MASTERCLASS_INSCHRIJVING_TOEVOEGEN.addActionListener(listener);
        BEKENDE_SPELER_TOEVOEGEN.addActionListener(listener);

        SPELER_WIJZIGEN.addActionListener(listener);
        TOERNOOI_WIJZIGEN.addActionListener(listener);
        TOERNOOI_INSCHRIJVING_WIJZIGEN.addActionListener(listener);
        WINNAARS_WIJZIGEN.addActionListener(listener);
        MASTERCLASS_WIJZIGEN.addActionListener(listener);
        MASTERCLASS_INSCHRIJVING_WIJZIGEN.addActionListener(listener);
        BEKENDE_SPELER_WIJZIGEN.addActionListener(listener);

        SPELER_VERWIJDEREN.addActionListener(listener);
        TOERNOOI_VERWIJDEREN.addActionListener(listener);
        TOERNOOI_INSCHRIJVING_VERWIJDEREN.addActionListener(listener);
        WINNAARS_REGISTREREN.addActionListener(listener);
        MASTERCLASS_VERWIJDEREN.addActionListener(listener);
        MASTERCLASS_INSCHRIJVING_VERWIJDEREN.addActionListener(listener);
        BEKENDE_SPELER_VERWIJDEREN.addActionListener(listener);

        GEREGISTREERDE_SPELERS.addActionListener(listener);
        GEPLANDE_TOERNOOIEN.addActionListener(listener);
        INLEG_PER_TOERNOOI.addActionListener(listener);
        BEGIN_TAFELS.addActionListener(listener);
        TAFEL_INDELING.addActionListener(listener);
        WINNARS_PER_RONDE.addActionListener(listener);
        WINNAARS_PER_TAFEL.addActionListener(listener);
        WINNAARS_PER_TOERNOOI.addActionListener(listener);
        SPELERS_MET_X_RATING.addActionListener(listener);

        frame.setLocationRelativeTo(null);
        frame.setTitle("FullHouse Administratie Systeem");
        frame.setVisible(true);


    }

    static class ButtonListener implements ActionListener {
        @Override
        /**
         * afhankelijk van de source -> voer actie uit
         */
        public void actionPerformed(ActionEvent actionEvent) {
            if (actionEvent.getSource() == AFSLUITEN) {
            frame.dispose();

            }
        }

    }}
