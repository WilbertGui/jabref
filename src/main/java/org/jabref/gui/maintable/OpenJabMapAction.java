package org.jabref.gui.maintable;

import org.jabref.Globals;
import org.jabref.gui.DialogService;
import org.jabref.gui.StateManager;
import org.jabref.gui.actions.ActionHelper;
import org.jabref.gui.actions.SimpleCommand;
import org.jabref.gui.externalfiletype.ExternalFileTypes;
import org.jabref.gui.fieldeditors.LinkedFileViewModel;
import org.jabref.preferences.PreferencesService;

import java.io.File;
import java.io.IOException;

public class OpenJabMapAction extends SimpleCommand {
    private final DialogService dialogService;
    private final StateManager stateManager;


    public OpenJabMapAction(DialogService dialogService, StateManager stateManager) {
        this.dialogService = dialogService;
        this.stateManager = stateManager;


    }

    @Override
    public void execute() {
        String path = "C:\\sw\\CS761Proj\\feature-folk\\EndPoint\\JabMap-win32-x64\\JabMap.exe";
        File file = new File(path);

        if (! file.exists()) {
            throw new IllegalArgumentException("The file " + path + " does not exist");
        }
        try {
            Process p = Runtime.getRuntime().exec(file.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
