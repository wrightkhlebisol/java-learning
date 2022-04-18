
public class Main {
    public static void main(String[] args) {
        GuessTheGame guessTheGame = new GuessTheGame();
        try {
            guessTheGame.guess();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
