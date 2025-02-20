import java.util.*;

public class VotingSystem {
    Map<String, Integer> voteCount = new HashMap<>();
    Map<String, Integer> sortedResults = new TreeMap<>();
    Map<String, Integer> voteOrder = new LinkedHashMap<>();

    public void castVote(String candidate) {
        voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);
        voteOrder.put(candidate, voteOrder.getOrDefault(candidate, 0) + 1);
    }

    public void displayResults() {
        sortedResults.putAll(voteCount);
        System.out.println("Sorted Results (by candidate name): " + sortedResults);
        System.out.println("Vote Order: " + voteOrder);
    }

    public static void main(String[] args) {
        VotingSystem vs = new VotingSystem();
        vs.castVote("Alice");
        vs.castVote("Bob");
        vs.castVote("Alice");
        vs.castVote("Charlie");
        vs.castVote("Bob");
        vs.displayResults();
    }
}

