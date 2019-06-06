package ua.lviv.iot.fortifications;

import ua.lviv.iot.fortifications.manager.FortificationManager;
import ua.lviv.iot.fortifications.manager.FortificationsManagerImpl;
import ua.lviv.iot.fortifications.models.Aperal;
import ua.lviv.iot.fortifications.models.Fortifications;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Fortifications> fortifications = new ArrayList<>();
        fortifications.add(new Aperal(2, 55,44,8));

        FortificationsManagerImpl manager = new  FortificationsManagerImpl(fortifications);

        manager.sortByDepth(fortifications, true);

        manager.findItemsByTime(44);
    }
}
