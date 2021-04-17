package dev;

import arc.struct.*;
import arc.util.*;
import mindustry.mod.*;

import static mindustry.Vars.*;

@SuppressWarnings("unused")
public class Launcher extends Mod {
    private static final Seq<String> blacklist = Reflect.get(Scripts.class, "blacklist");
    private static final Seq<String> whitelist = Reflect.get(Scripts.class, "whitelist");

    public Launcher() {
        enableConsole = true;

        blacklist.clear();
        whitelist.clear();
    }

    @Override
    public void init() {
        ui.settings.game.checkPref("console", enableConsole, (e) -> enableConsole = e);
    }
}
