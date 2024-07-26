package services;

import models.Candidate;

public class EvaluationService {
    public void evaluateCandidate(Candidate candidate, String result) {
        candidate.setResult(result);
    }
}
