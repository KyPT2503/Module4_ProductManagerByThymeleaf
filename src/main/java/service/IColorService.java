package service;

import model.Color;

import java.util.List;

public interface IColorService {
    List<Color> getAll();

    Color getById(int id);
}
