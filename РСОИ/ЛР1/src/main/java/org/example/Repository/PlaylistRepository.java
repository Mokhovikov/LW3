package org.example.Repository;

import org.example.Models.Playlist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;
import java.util.TreeMap;

public interface PlaylistRepository {
    void findByAmountListen(TreeMap<String, Integer> first, TreeMap<String, Integer> second, TreeMap<String, Integer> third);


}
