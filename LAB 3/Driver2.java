public class Driver2 {
    public static void main(String[] args) {

        Card[] cards = new Card[10];
        int count = 0;

        // Cards to add
        Card[] input = {
            new Card("Ace", "Spades"),
            new Card("King", "Hearts"),
            new Card("Queen", "Diamonds"),
            new Card("Ace", "Spades"),   // Duplicate
            new Card("Jack", "Clubs")
        };

        boolean duplicateFound = false;

        for (Card card : input) {

            // Check against previously added cards
            for (int i = 0; i < count; i++) {
                if (card.equals(cards[i])) {
                    System.out.println("Duplicate found: " + card);
                    duplicateFound = true;
                    break;
                }
            }

            // Stop after first duplicate
            if (duplicateFound)
                break;

            cards[count] = card;
            count++;
        }
    }
}

