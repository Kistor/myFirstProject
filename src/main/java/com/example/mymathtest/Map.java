package com.example.mymathtest;

public class Map {

    public void mapInit(int[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = 0;
            }
        }

        int coord;
        for (int i = 0; i < map.length; i++) {
            // рандом места для бомбы
            coord = (int) (Math.random() * 100);
            if (map[coord % 10][coord / 10] == 10) {
                i--;
            } else {
                int x = coord % 10;
                int y = coord / 10;
                map[x][y] = 10;

                // написать обозначения для


            }
        }
    }
}
