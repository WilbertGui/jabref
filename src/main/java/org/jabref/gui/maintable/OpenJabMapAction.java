package org.jabref.gui.maintable;

import javafx.scene.control.SplitPane;
import javafx.scene.layout.Pane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import org.jabref.gui.DialogService;
import org.jabref.gui.StateManager;
import org.jabref.gui.actions.SimpleCommand;

public class OpenJabMapAction extends SimpleCommand {
    private final DialogService dialogService;
    private final StateManager stateManager;
    private final SplitPane splitPane ;
    private Pane jabMapPane;
    public OpenJabMapAction(DialogService dialogService, StateManager stateManager, SplitPane splitPane) {
        this.dialogService = dialogService;
        this.stateManager = stateManager;

        this.splitPane = splitPane;
        jabMapPane = new Pane();

        initJabMapPane();
    }

    private void initJabMapPane(){

        WebView browser = new WebView();

        WebEngine webEngine = browser.getEngine();
        webEngine.load("http://google.com");  //gwl for next step, please modify here to show jabmap index.html
        jabMapPane.getChildren().add(browser);
    }
    @Override
    public void execute() {

        if (splitPane.getItems().contains(jabMapPane)){
            splitPane.getItems().remove(jabMapPane);
        }else{
            splitPane.getItems().add(jabMapPane);
        }

    }
}
