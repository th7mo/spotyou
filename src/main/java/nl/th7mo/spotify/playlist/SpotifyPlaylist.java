package nl.th7mo.spotify.playlist;

import java.util.ArrayList;
import java.util.List;

public class SpotifyPlaylist {

    private List<Item> items = new ArrayList<>();
    private String name;

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void join(SpotifyPlaylist playlist) {
        items.addAll(playlist.getItems());
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public int size() {
        return items.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
