package japi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class JApiEx extends JPanel {
    Action cutAction, copyAction, pasteAction;
    ImageIcon cutIcon, copyIcon, pasteIcon;

    public JApiEx() {
        super(new BorderLayout());
        createActions();
    }

    private void createActions() {
        cutAction = new CutAction("Cut", new ImageIcon(), "Cut stuff onto the clipboard", new Integer(KeyEvent.VK_CUT));
        copyAction = new CopyAction("Copy", new ImageIcon(), "Copy stuff to the clipboard", new Integer(KeyEvent.VK_COPY));
        pasteAction = new PasteAction("Paste", new ImageIcon(), "Paste whatever is on the clipboard", new Integer(KeyEvent.VK_PASTE));
    }

    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");

        JMenuItem cutMenuItem = new JMenuItem(cutAction);
        JMenuItem copyMenuItem = new JMenuItem(copyAction);
        JMenuItem pasteMenuItem = new JMenuItem(pasteAction);

        editMenu.add(cutMenuItem);
        editMenu.add(copyMenuItem);
        editMenu.add(pasteMenuItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        return menuBar;
    }

    private JToolBar createToolBar() {
        JToolBar toolBar = new JToolBar();

        JButton cutButton = new JButton(cutAction);
        JButton copyButton = new JButton(copyAction);
        JButton pasteButton = new JButton(pasteAction);

        toolBar.add(cutButton);
        toolBar.add(copyButton);
        toolBar.add(pasteButton);

        return toolBar;
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Java AbstractAction Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JApiEx panel = new JApiEx();
        panel.add(panel.createToolBar(), BorderLayout.PAGE_START);
        panel.setOpaque(true);
        frame.setContentPane(panel);

        frame.setJMenuBar(panel.createMenuBar());

        frame.setPreferredSize(new Dimension(450, 300));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}

class PasteAction extends AbstractAction {
    public PasteAction(String name, ImageIcon icon, String shortDescription, Integer mnemonic) {
        super(name, icon);
        putValue(SHORT_DESCRIPTION, shortDescription);
        putValue(MNEMONIC_KEY, mnemonic);
    }

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Would have done the 'Paste' action.");
    }
}

class CopyAction extends AbstractAction {
    public CopyAction(String name, ImageIcon icon, String shortDescription, Integer mnemonic) {
        super(name, icon);
        putValue(SHORT_DESCRIPTION, shortDescription);
        putValue(MNEMONIC_KEY, mnemonic);
    }

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Would have done the 'Copy' action.");
    }
}

class CutAction extends AbstractAction {
    public CutAction(String name, ImageIcon icon, String shortDescription, Integer mnemonic) {
        super(name, icon);
        putValue(SHORT_DESCRIPTION, shortDescription);
        putValue(MNEMONIC_KEY, mnemonic);
    }

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Would have done the 'Cut' action.");
    }
}
