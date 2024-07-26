package services;

import models.Candidate;
import java.util.HashMap;
import java.util.Map;

public class CandidateService {
    private Map<String, Candidate> candidates = new HashMap<>();

    public void addCandidate(Candidate candidate) {
        candidates.put(candidate.getCandidateId(), candidate);
    }

    public Candidate getCandidate(String candidateId) {
        return candidates.get(candidateId);
    }

    public Map<String, Candidate> getAllCandidates() {
        return candidates;
    }
}
