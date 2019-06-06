package ua.lviv.iot.fortifications.manager;

import ua.lviv.iot.fortifications.models.Fortifications;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FortificationsManagerImpl implements FortificationManager {

    private List<Fortifications> fortifications;

    public void setFortifications(List<Fortifications> fortifications) {
        this.fortifications = fortifications;
    }

    public FortificationsManagerImpl(List<Fortifications> fortifications) {
        this.fortifications = fortifications;
    }

    @Override
    public List<Fortifications> findItemsByTime(double timeToBuild) {
        fortifications.stream().filter(fortifications1 -> fortifications1.getTimeToBuild() == timeToBuild).forEach(fortifications1 -> System.out.println(fortifications1));
        return null;
    }

    @Override
    public List<Fortifications> findItemsByLength(double lenght) {
        fortifications.stream().filter(fortifications1 -> fortifications1.getLenght() == lenght).forEach(fortifications1 -> System.out.println(fortifications1));
        return null;
    }

    @Override
    public void sortByDepth(List<Fortifications> fortifications, boolean reverse) {

        if(reverse){
            Collections.sort(fortifications ,Comparator.comparing(Fortifications::getDepth).reversed());
        }
        else {
            Collections.sort(fortifications ,Comparator.comparing(Fortifications::getDepth));
        }
    }
}
