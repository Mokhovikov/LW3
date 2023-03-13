package org.example.Repo;

import org.example.Entity.Sing;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.TreeMap;

public interface PlaylistRepo {
    void findAllByListen(TreeMap<String, ArrayList<LocalDate>> first,
                         TreeMap<String, ArrayList<LocalDate>> second,
                         TreeMap<String, ArrayList<LocalDate>> third);

    void form (ArrayList<Sing> all,
               TreeMap<String, ArrayList<LocalDate>> allMap,
               TreeMap<String, ArrayList<LocalDate>> first,
               TreeMap<String, ArrayList<LocalDate>> second,
               TreeMap<String, ArrayList<LocalDate>> third);
}
