package service;

import model.Color;

import java.util.ArrayList;
import java.util.List;

public class ColorService implements IColorService {
    private static List<Color> colors = new ArrayList<>();

    static {
        colors.add(new Color(1, "Red"));
        colors.add(new Color(2, "Black"));
        colors.add(new Color(3, "Blue"));
        colors.add(new Color(4, "Green"));
        colors.add(new Color(5, "White"));
        colors.add(new Color(6, "Yellow"));
    }

    @Override
    public List<Color> getAll() {
        return colors;
    }

    @Override
    public Color getById(int id) {
        for (Color color : colors) {
            if (color.getId() == id) {
                return color;
            }
        }
        return null;
    }
}
