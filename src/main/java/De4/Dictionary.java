
package De4;

import java.util.ArrayList;
import java.util.Scanner;

public class Dictionary {
    private ArrayList<Word> wordList;

    public Dictionary(ArrayList<Word> wordList) {
        this.wordList = wordList;
    }
    
    public Dictionary(){
        this.wordList = new ArrayList<>();
    }
    
    public void addWord(Word word){
        wordList.add(word);
    }
    
    public void displayAllWords(){
        for (Word word: wordList){
            word.displayInfo();
            System.out.println();
        }
    }
    
    public int getSize(){
        return wordList.size();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dictionary dictionary = new Dictionary();
        while(true){
            System.out.print("Nhập id: ");
            int id = input.nextInt();
            if(id == 0){
                break;
            }
            input.nextLine();
            System.out.print("Nhập từ tiếng anh: ");
            String en = input.nextLine();
            System.out.print("Nhập nghĩa tiếng việt: ");
            String vn = input.nextLine();
            Word word = new Word(id, en, vn);
            dictionary.addWord(word);
        }
        System.out.println("Danh sách từ vựng: ");
        dictionary.displayAllWords();
        System.out.println("Kích thước từ điển: "+dictionary.getSize());
    }
}
