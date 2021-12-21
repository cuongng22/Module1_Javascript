package Bt;

import java.util.ArrayList;
import java.util.Scanner;

public class CandyManager {
    private ArrayList<Candy> candyArrayList;

    public CandyManager(ArrayList<Candy> candyArrayList) {
        this.candyArrayList = candyArrayList;
    }

    public ArrayList<Candy> getCandyArrayList() {
        return candyArrayList;
    }

    public boolean deleteCandy(int idCandy) {
        for (Candy candy : candyArrayList) {
            if (candy.getId() == idCandy) {
                return candyArrayList.remove(candy);
            }
        }
        return false;
    }

    public boolean editCandy(int id) {
        for (int i = 1; i < candyArrayList.size(); i++) {
            Candy candy1 = candyArrayList.get(i);
            if (candy1.getId() == id) {
                candyArrayList.set(i, candy1);
                return true;
            }
        }
        return false;
    }

    public void deleteAll() {
        candyArrayList.clear();
    }

    public static void creatCandyArray(Scanner scanner) {

    }
}
