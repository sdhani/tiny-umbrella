package com.example.android.hamburgerblitz;

import android.util.Log;

import java.util.Random;

public class Board {
    private int row = 3;
    private int col = 6;
    private int board[][] = new int[row][col];


    public void initializeBoard(){
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                Random rand = new Random();
                int value = rand.nextInt((5)+1) + 1; //random 1 to 5
                board[i][j] = value;

            }
        }
    }

    public int[][] getBoard(){
        return board;
    }
}
