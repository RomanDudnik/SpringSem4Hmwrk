package org.example.SpringSem4Hmwrk.service;

import org.example.SpringSem4Hmwrk.model.Salon;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SalonService {
    private List<Salon> salons = new ArrayList<>();

    /**
     * Метод добавления салона
     * @param salon
     */

    public void addSalon(Salon salon) {
        salons.add(salon);
    }

    /**
     * Метод получения всех салонов
     * @return
     */

    public List<Salon> findAll() {
        return salons;
    }
}
