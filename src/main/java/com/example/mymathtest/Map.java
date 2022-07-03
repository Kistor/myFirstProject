package com.example.mymathtest;

public class Map {
    final  private int  bomb =9;
    int[][] map;
    int size;
    boolean[][] openMap;

    Map(){}

    Map(int Size)
    {
        size = Size;
        map = new int[size][size];
        openMap = new boolean[size][size];
    }


    public int GetNumBomb() {
        return bomb;
    }
    public void printMap()
    {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                System.out.print(map[j][i] + " ");
            }
            System.out.println();
        }
    }


    public void mapInit() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = 0;
                openMap[i][j] = false;
            }
        }

        int coord;
        for (int i = 0; i < map.length; i++) {
            // рандом места для бомбы
            coord = (int) (Math.random() *size*size);
            if (map[coord % size][coord / size] == 9) {
                i--;
            } else {
                int x = coord % size;
                int y = coord / size;
                map[x][y] = bomb;

                try {
                    if(map[x+1][y+1] != bomb)
                        map[x+1][y+1]++;
                } catch (Exception ignored) {}
                try {
                    if(map[x][y+1] != bomb)
                        map[x][y+1]++;
                } catch (Exception ignored) {}
                try {
                    if(map[x+1][y] != bomb)
                        map[x+1][y]++;
                } catch (Exception ignored) {}
                try {
                    if(map[x-1][y-1] != bomb)
                        map[x-1][y-1]++;
                }catch (Exception ignored){}
                try {
                    if(map[x][y-1] != bomb)
                        map[x][y-1]++;
                }catch (Exception ignored){}
                try {
                    if(map[x-1][y] != bomb)
                        map[x-1][y]++;
                }catch (Exception ignored){}
                try {
                    if(map[x-1][y+1] != bomb)
                        map[x-1][y+1]++;
                }catch (Exception ignored){}
                try {
                    if(map[x+1][y-1] != bomb)
                        map[x+1][y-1]++;
                }catch (Exception ignored){}


            }
        }
    }
}
