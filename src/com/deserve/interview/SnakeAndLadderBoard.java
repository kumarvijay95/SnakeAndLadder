package com.deserve.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SnakeAndLadderBoard {
    // size of the board
    int size;

    // list of snakes
    List<Snake> snakes;

    // list of ladders
    List<Ladder> ladders;

    //map containing player id and their pieces
    Map<String, Integer> playersPieces;

    public SnakeAndLadderBoard(int size) {
        this.size = size;
        this.snakes = new ArrayList<>();
        this.ladders = new ArrayList<>();
        this.playersPieces = new HashMap<>();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<Snake> getSnakes() {
        return snakes;
    }

    public void setSnakes(List<Snake> snakes) {
        this.snakes = snakes;
    }

    public List<Ladder> getLadders() {
        return ladders;
    }

    public void setLadders(List<Ladder> ladders) {
        this.ladders = ladders;
    }

    public Map<String, Integer> getPlayersPieces() {
        return playersPieces;
    }

    public void setPlayersPieces(Map<String, Integer> playersPieces) {
        this.playersPieces = playersPieces;
    }
}